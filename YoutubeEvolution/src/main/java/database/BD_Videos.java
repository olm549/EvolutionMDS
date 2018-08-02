package database;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.vaadin.ui.TextArea;

import database.Videos;
//import evolutionYoutube.Categoria;
import evolutionYoutube.Listas_creadas;

public class BD_Videos {
	public BD_general _bd_PrincipalVideos;
	public Vector<Videos> _contieneVideo = new Vector<Videos>();

	public List Cargar_Videos_Megusta() throws PersistentException {
	
		List listaVideos=null;
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			
	      listaVideos=VideosDAO.queryVideos("NumVisualizaciones > 0", "NumVisualizaciones");
		} catch(Exception e) {
			transaccion.rollback();			
		}
		return listaVideos;
	}

	public List Cargar_Videos_Recientes() throws PersistentException {
		List listaVideos=null;
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			
	      listaVideos=VideosDAO.queryVideos("Fecha = 2018", "NumVisualizaciones");
		} catch(Exception e) {
			transaccion.rollback();			
		}
		return listaVideos;
	}

	public List Cargar_Videos_Relacionados() throws PersistentException {
		List listaVideos=null;
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			
	      listaVideos=VideosDAO.queryVideos("NumVisualizaciones > 0", "NumVisualizaciones");
		} catch(Exception e) {
			transaccion.rollback();			
		}
		return listaVideos;
	}

	public List Cargar_Videos_Suscripciones() throws PersistentException {
		List listaVideos=null;
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			
	      listaVideos=VideosDAO.queryVideos("NumVisualizaciones > 0", "NumVisualizaciones");
		} catch(Exception e) {
			transaccion.rollback();			
		}
		return listaVideos;
	}

	public void subir_video(String aTitulo, String aMiniatura, boolean aDeshabilitar_comentarios, TextArea aDescripcion, String aEtiquetas, String categoria, String lista) throws PersistentException {
		VideosCriteria vc = new VideosCriteria();
		//El titulo era unico?
		//En ese caso realizar vc
		/*vc.titulo.eq(aTitulo);
		if(vc.uniqueVideos()!=null) {
			throw new RuntimeException("Titulo en uso");

		}
		*/
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			Videos video = database.VideosDAO.createVideos();
			video.setTitulo(aTitulo);
			video.setMiniatura(aMiniatura);
			video.setDescrVideo(aDescripcion.toString());
			video.setEtiquetas(aEtiquetas.toString());
			video.setFecha(Calendar.getInstance().toString());
			video.setNumVisualizaciones(0);
			//DEBERIA RECIIR IDCATEGORIA NO CATEGORIA video.setCategoria(categoria);
			//FALTA IDAUTOR EN PARAM video.setORMAutor()
			//FALTA CONTENIDO VIDEO EN PARAM video.setContenidoVideo(value);
			transaccion.commit();
		}catch(Exception e) {
			transaccion.rollback();
			e.printStackTrace();
		}
	}

	public void Eliminar_video(int aID) {
		throw new UnsupportedOperationException();
	}

	public void descargar(int aID) {
		throw new UnsupportedOperationException();
	}

	public List ver_etiquetas() {
		throw new UnsupportedOperationException();
	}

	public void me_gusta(int aIDvideo) {
		throw new UnsupportedOperationException();
	}

	public List buscar(String aTexto) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_Video_De_Lista(int[] aLista_De_IDs_Videos) {
		throw new UnsupportedOperationException();
	}

	public List cargar_Videos_Subidos(int aIDUsuario) {
		throw new UnsupportedOperationException();
	}

	public List cargar_Gestion_Videos_Subidos(int aIDUsuario) {
		throw new UnsupportedOperationException();
	}

	public void modificar_video(String aTitulo, String aDescripcion, int[] aId_categorias, String aEtiquetas) {
		throw new UnsupportedOperationException();
	}

	public void eliminarVideo(int aIDVideo) {
		throw new UnsupportedOperationException();
	}

	public void editar_Miniatura(int aIDVideo) {
		throw new UnsupportedOperationException();
	}
}