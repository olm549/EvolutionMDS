package database;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.vaadin.ui.TextArea;

import database.Comentarios;

public class BD_Comentarios {
	public BD_general _bd_PrincipalComentarios;
	public Vector<Comentarios> _contieneComentarios = new Vector<Comentarios>();
	
	public List cargar_Comentarios(int aID) throws PersistentException {
		List listaComentarios = null;
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			
	      listaComentarios = ComentariosDAO.queryComentarios("videosComentadosId = "+aID, "1");
		} catch(Exception e) {
			transaccion.rollback();			
		}
		return listaComentarios;
	}
	//FALTA IDVIDEO?
	public void eliminar_comentario(int aIDcomentario) {
		throw new UnsupportedOperationException();
	}
	//No faltaria el IDUsuario que envia el comentario?
	//EDIT :
	//he aniadido IDUSUARIO A LOS PARAMETROS, EN ESTE METODO Y EN BDGENERAL.
	public void enviar_comentario(TextArea aTexto, int aIDvideo, int aIDusuario) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
		Comentarios comentario = database.ComentariosDAO.createComentarios();
		Videos vid = database.VideosDAO.getVideosByORMID(aIDvideo);
		Usuario_registrado user = database.Usuario_registradoDAO.getUsuario_registradoByORMID(aIDusuario);
		comentario.setContenido_comentario(aTexto.toString());
		comentario.setVideosComentados(vid);
		comentario.setORM_Usuarios_que_comentan(user);
		transaccion.commit();
			
		} catch (Exception e) {
			transaccion.rollback();
			e.printStackTrace();
		}
		
	}
	//FALTA IDVIDEO? EDIT DONE
	public void eliminar_comentario_propio(int aIDUsuario, int aIDComentario, int aIDVideo) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
		Videos vid = database.VideosDAO.getVideosByORMID(aIDVideo);
		Comentarios coment = database.ComentariosDAO.getComentariosByORMID(aIDComentario);
		Usuario_registrado user = database.Usuario_registradoDAO.getUsuario_registradoByORMID(aIDUsuario);
		if(coment.getUsuarios_que_comentan().getId_Usuario_registrado()!=aIDUsuario) {
			throw new RuntimeException("El comentario no pertenece al usuario");
		}
		vid.comentarios_en_videos.remove(coment);
		transaccion.commit();
		}catch(Exception e) {
			
			transaccion.rollback();
			e.printStackTrace();
			
		}
	}
}