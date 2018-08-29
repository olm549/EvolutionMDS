package database;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TreeMap;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import com.vaadin.ui.TextArea;

public class BD_Videos {
	public BD_general _bd_PrincipalVideos;
	public Vector<Videos> _contieneVideo = new Vector<Videos>();

	@SuppressWarnings("unchecked")
	public List<Videos> Cargar_Videos_Megusta() throws PersistentException {
	
		List<Videos> listaVideos= new ArrayList<Videos>();
		TreeMap<Integer, Videos> treemap = new TreeMap();
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			for(Videos video :VideosDAO.listVideosByQuery(null, null)) {
				treemap.put(video.usuarios_que_dan_me_gusta.size(), video);
			}
			for(Videos video : treemap.values()) {
				listaVideos.add(video);
			}
			transaccion.commit();
		} catch(Exception e) {
			transaccion.rollback();			
		}
		return listaVideos;
	}

	@SuppressWarnings("unchecked")
	public List<Videos> Cargar_Videos_Recientes() throws PersistentException {
		List<Videos> listaVideos=null;
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			Calendar fecha = Calendar.getInstance();
			listaVideos =VideosDAO.queryVideos("fecha LIKE '%"+fecha.MONTH+"%'", null);
			transaccion.commit();
		} catch(Exception e) {
			transaccion.rollback();			
		}
		return listaVideos;
	}

	@SuppressWarnings("unchecked")
	public List<Videos> Cargar_Videos_Relacionados(int aIDUsuario) throws PersistentException {
		List<Videos> listaVideos= new ArrayList<Videos>();
		List<Categorias> listaCategorias = new ArrayList<Categorias>();
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
		  Usuario_registrado user= Usuario_registradoDAO.loadUsuario_registradoByQuery("ID = "+aIDUsuario, "1");
		  for(Videos videosLike : user.videos_que_gustan.toArray()) {
			  if(!listaCategorias.contains(videosLike.getCategoria()))
			  listaCategorias.add(videosLike.getCategoria());
		  }
		  
		  for(Categorias cat : listaCategorias) {
			  for(Videos video : cat.videos.toArray()) {
				  if(!listaVideos.contains(video))
					  listaVideos.add(video);
			  }
		  }
	      transaccion.commit();
		} catch(Exception e) {
			transaccion.rollback();			
		}
		return listaVideos;
	}

	@SuppressWarnings("unchecked")
	public List<Videos> Cargar_Videos_Suscripciones(int aIDUsuario) throws PersistentException {
		List<Videos> listaVideos= new ArrayList<Videos>();
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
		  Usuario_registrado user= Usuario_registradoDAO.loadUsuario_registradoByQuery("ID = "+aIDUsuario, "1");
		  for(Usuario_registrado suscritoA : user.suscriptor.toArray()) {
			  for(Videos video : suscritoA.video_subido.toArray()) {
				  listaVideos.add(video);
			  }
		  }
	     transaccion.commit();
		} catch(Exception e) {
			transaccion.rollback();			
		}
		return listaVideos;
	}

	public void subir_video(String aTitulo, String aMiniatura,String aContenido, int idAutor, boolean aDeshabilitar_comentarios, TextArea aDescripcion, String aEtiquetas, String categoria, int lista) throws PersistentException {
		
		//VideosCriteria vc = new VideosCriteria();
		//El titulo era unico?
		//En ese caso realizar vc
		/*vc.titulo.eq(aTitulo);
		if(vc.uniqueVideos()!=null) {
			throw new RuntimeException("Titulo en uso");
		}
		*/
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			
		Videos vid = database.VideosDAO.createVideos();

		Categorias categ = database.CategoriasDAO.loadCategoriasByQuery("nombre = '"+categoria+"'", "1");
		Listas_de_reproduccion list = database.Listas_de_reproduccionDAO.loadListas_de_reproduccionByQuery("id_lista = "+lista, "1");
		Usuario_registrado autor = database.Usuario_registradoDAO.loadUsuario_registradoByQuery("ID = " +idAutor, "1");
		vid.setTitulo(aTitulo);
		vid.setMiniatura(aMiniatura);
		vid.setAutor(autor);
		vid.setDescrVideo(aDescripcion.toString());
		vid.setContenidoVideo(aContenido);
		vid.setEtiquetas(aEtiquetas);
		Calendar fecha = Calendar.getInstance();
        String año = fecha.get(Calendar.DAY_OF_MONTH)+"-"+fecha.get(Calendar.MONTH)+"-"+fecha.get(Calendar.YEAR);
		vid.setFecha(año);
		vid.setCategoria(categ);
		vid.listas_de_videos.add(list);
		vid.setNumVisualizaciones(0);
		VideosDAO.save(vid);
		transaccion.commit();
		
		}catch(Exception e) {
			transaccion.rollback();
			e.printStackTrace();
		}
	}

	public void Eliminar_video(int aID) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			Videos vid = database.VideosDAO.loadVideosByQuery("id_video = "+aID, "1");
			VideosDAO.delete(vid);
			transaccion.commit();
		}catch(Exception e) {
			transaccion.rollback();
			
		}
	}

	public void descargar(int aID) {
		throw new UnsupportedOperationException();
	}

	public List<String> ver_etiquetas(int IDvideo) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		ArrayList<String> etq = new ArrayList<String>();
		try {
			Videos video = VideosDAO.loadVideosByQuery("id_video = "+IDvideo, "1");
			String[] etiquetas = video.getEtiquetas().split(",");
			for(String foo : etiquetas) {
				etq.add(foo);
			}
			transaccion.commit();
		}catch(Exception e) {
			transaccion.rollback();
			e.printStackTrace();
		}
		return etq;
	}

	public void me_gusta(int aIDvideo, int aIDusuario) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try{
			Usuario_registrado user = Usuario_registradoDAO.loadUsuario_registradoByQuery("ID = "+aIDusuario, "1");
			Videos vid = VideosDAO.loadVideosByQuery("id_video = "+aIDvideo , "1");
			user.videos_que_gustan.add(vid);
			vid.usuarios_que_dan_me_gusta.add(user);
			transaccion.commit();
		}catch(Exception e) {
			transaccion.rollback();
			e.printStackTrace();
		}
	}

	public List<Videos> buscar(String aTexto) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		ArrayList<Videos> lista = new ArrayList<Videos>();
		try {
			Videos[] listaVideos = VideosDAO.listVideosByQuery("titulo LIKE '%"+aTexto+"%'", "1");
			for(Videos vid : listaVideos) {
				lista.add(vid);
		}
		}catch(Exception e) {
			transaccion.rollback();
			e.printStackTrace();
		}
		return lista;
	}
	public List<Videos> buscarPorCategoria(String aTexto) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		ArrayList<Videos> lista = new ArrayList<Videos>();
		try {
			Videos[] listaVideos = VideosDAO.listVideosByQuery(null,null);
			for(Videos vid : listaVideos) {
				if(vid.getCategoria().getNombre().equals(aTexto))
				lista.add(vid);
		}
		}catch(Exception e) {
			transaccion.rollback();
			e.printStackTrace();
		}
		return lista;
	}
	//Que hace esto aqui?
	public void eliminar_Video_De_Lista(int[] aLista_De_IDs_Videos, int indice) {
		
	}

	public List<Videos> cargar_Videos_Subidos(int aIDUsuario) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		ArrayList<Videos> lista = new ArrayList<Videos>();
		try {
			Usuario_registrado user = Usuario_registradoDAO.loadUsuario_registradoByQuery("ID = "+aIDUsuario, "1");
			for(Videos video : user.video_subido.toArray()) {
				lista.add(video);
			}
		}catch(Exception e) {
			transaccion.rollback();
			e.printStackTrace();
		}
		return lista;
	}
	//Mismo metodo que el de arriba?
	public List<Videos> cargar_Gestion_Videos_Subidos(int aIDUsuario) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		ArrayList<Videos> lista = new ArrayList<Videos>();
		try {
			Usuario_registrado user = Usuario_registradoDAO.loadUsuario_registradoByQuery("ID = "+aIDUsuario, "1");
			for(Videos video : user.video_subido.toArray()) {
				lista.add(video);
			}
		}catch(Exception e) {
			transaccion.rollback();
			e.printStackTrace();
		}
		return lista;
	}

	public void modificar_video(String aTitulo, String aDescripcion, int[] aId_categorias, String aEtiquetas) {
		//?? array categorias, revisar, solo puede tener 1 categoria, mas faltan atributos.
	}

	public void eliminarVideo(int aIDVideo) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			Videos video = VideosDAO.loadVideosByQuery("id_video = "+aIDVideo,"1");
			VideosDAO.delete(video);
			transaccion.commit();
		}catch(Exception e) {
			transaccion.rollback();
			e.printStackTrace();
		}
	}

	public void editar_Miniatura(int aIDVideo, String miniatura) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			Videos video = VideosDAO.loadVideosByQuery("id_video = "+aIDVideo, "1");
			video.setMiniatura(miniatura);
			VideosDAO.save(video);
			transaccion.commit();
		}catch(Exception e ) {
			e.printStackTrace();
			transaccion.rollback();
		}
	}
}