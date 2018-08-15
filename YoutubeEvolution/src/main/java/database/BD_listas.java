package database;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

public class BD_listas {
	public BD_general _bd_PrincipalListas;
	public Vector<Listas_de_reproduccion> _contieneListas = new Vector<Listas_de_reproduccion>();

	public void aniade_a_lista(int IDusuario, int aIDvideo, int aIDlista) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_registrado user = Usuario_registradoDAO.loadUsuario_registradoByQuery("ID = "+IDusuario,"1");
			Videos video = VideosDAO.loadVideosByQuery("id_video = "+aIDvideo, "1");
			for(Listas_de_reproduccion lista : user.listas_de_reproduccion.toArray()) {
				if(lista.getId_lista()==aIDlista) {
					lista.videos_en_lista.add(video);
					break;
				}
			}
		}catch(Exception e ) {
			transaccion.rollback();
			e.printStackTrace();
		}
	}
	//LAS LISTAS NO TIENEN NOMBRE XDXDXD
	public void cambiar_Nombre_Lista(int IDlista, int IDusuario, String aNuevo_Nombre) {
	/*	PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_registrado user = Usuario_registradoDAO.loadUsuario_registradoByQuery("ID = "+IDusuario,"1");
			for(Listas_de_reproduccion2 lista : user.listas_de_reproduccion.toArray()) {
				if(lista.getId_lista()==IDlista) {
					lista.setNombre(aNuevo_Nombre);
					break;
				}
			}
		}catch(Exception e ) {
			transaccion.rollback();
			e.printStackTrace();
		}*/
	}

	public List<Videos> cargar_Lista_Videos(int aId_Lista, int id_usuario) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		ArrayList<Videos> listaVideos = new ArrayList<Videos>();
		try {
			Usuario_registrado user = Usuario_registradoDAO.loadUsuario_registradoByQuery("ID = "+id_usuario,"1");
			for(Listas_de_reproduccion lista : user.listas_de_reproduccion.toArray()) {
				if(lista.getId_lista()==aId_Lista) {
					for(Videos video : lista.videos_en_lista.toArray()) {
						listaVideos.add(video);
					}
					break;
				}
			}
		}catch(Exception e ) {
			transaccion.rollback();
			e.printStackTrace();
		}
		return listaVideos;
	}

	public void eliminar_lista_reproduccion(int aID_lista, int IDusuario) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_registrado user = Usuario_registradoDAO.loadUsuario_registradoByQuery("ID = "+IDusuario,"1");
			for(Listas_de_reproduccion lista : user.listas_de_reproduccion.toArray()) {
				if(lista.getId_lista()==aID_lista) {
					user.listas_de_reproduccion.remove(lista);
					break;
				}
			}
			transaccion.commit();
		}catch(Exception e ) {
			transaccion.rollback();
			e.printStackTrace();
		}
	}
	//METODO MAL DEFINIDO, DEBERIA SER IDLISTA, IDVIDEO E IDUSUARIO PARAM
	public void eliminar_Video_De_Lista(int[] aLista_De_IDs_Videos) {
		// TODO Auto-generated method stub
		
	}

	public List<Listas_de_reproduccion> cargar_Listas_Reproduccion(int aID_Usuario) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		ArrayList<Listas_de_reproduccion> listalistas=new ArrayList<Listas_de_reproduccion>();
		try {
			
	      Usuario_registrado user = Usuario_registradoDAO.loadUsuario_registradoByQuery("ID = "+aID_Usuario, "1");
	      for(Listas_de_reproduccion foo : user.listas_de_reproduccion.toArray()) {
	    	  listalistas.add(foo);
	      }
		} catch(Exception e) {
			transaccion.rollback();			
		}
		return listalistas;
	}

}