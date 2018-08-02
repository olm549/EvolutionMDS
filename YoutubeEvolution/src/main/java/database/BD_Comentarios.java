package database;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.vaadin.ui.TextArea;

import database.Comentarios;

public class BD_Comentarios {
	public BD_general _bd_PrincipalComentarios;
	public Vector<Comentarios> _contieneComentarios = new Vector<Comentarios>();
	
	public List cargar_Comentarios(int aID) {
		throw new UnsupportedOperationException();
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
	//FALTA IDVIDEO?
	public void eliminar_comentario_propio(int aIDComentario) {
		throw new UnsupportedOperationException();
	}
}