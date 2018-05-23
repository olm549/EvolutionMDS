/**
 * Licensee: OLM(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateProyectoMDSData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = database.ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			database.Usuarios ldatabaseUsuarios = database.UsuariosDAO.loadUsuariosByQuery(null, null);
			// Update the properties of the persistent object
			database.UsuariosDAO.save(ldatabaseUsuarios);
			database.Usuario_registrado ldatabaseUsuario_registrado = database.Usuario_registradoDAO.loadUsuario_registradoByQuery(null, null);
			// Update the properties of the persistent object
			database.Usuario_registradoDAO.save(ldatabaseUsuario_registrado);
			database.Videos ldatabaseVideos = database.VideosDAO.loadVideosByQuery(null, null);
			// Update the properties of the persistent object
			database.VideosDAO.save(ldatabaseVideos);
			database.Listas_de_reproduccion2 ldatabaseListas_de_reproduccion2 = database.Listas_de_reproduccion2DAO.loadListas_de_reproduccion2ByQuery(null, null);
			// Update the properties of the persistent object
			database.Listas_de_reproduccion2DAO.save(ldatabaseListas_de_reproduccion2);
			database.Usuario_Administrador ldatabaseUsuario_Administrador = database.Usuario_AdministradorDAO.loadUsuario_AdministradorByQuery(null, null);
			// Update the properties of the persistent object
			database.Usuario_AdministradorDAO.save(ldatabaseUsuario_Administrador);
			database.Categorias2 ldatabaseCategorias2 = database.Categorias2DAO.loadCategorias2ByQuery(null, null);
			// Update the properties of the persistent object
			database.Categorias2DAO.save(ldatabaseCategorias2);
			database.Comentarios ldatabaseComentarios = database.ComentariosDAO.loadComentariosByQuery(null, null);
			// Update the properties of the persistent object
			database.ComentariosDAO.save(ldatabaseComentarios);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Usuarios by UsuariosCriteria");
		database.UsuariosCriteria ldatabaseUsuariosCriteria = new database.UsuariosCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldatabaseUsuariosCriteria.ID.eq();
		System.out.println(ldatabaseUsuariosCriteria.uniqueUsuarios());
		
		System.out.println("Retrieving Usuario_registrado by Usuario_registradoCriteria");
		database.Usuario_registradoCriteria ldatabaseUsuario_registradoCriteria = new database.Usuario_registradoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldatabaseUsuario_registradoCriteria.ID.eq();
		System.out.println(ldatabaseUsuario_registradoCriteria.uniqueUsuario_registrado());
		
		System.out.println("Retrieving Videos by VideosCriteria");
		database.VideosCriteria ldatabaseVideosCriteria = new database.VideosCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldatabaseVideosCriteria.id_video.eq();
		System.out.println(ldatabaseVideosCriteria.uniqueVideos());
		
		System.out.println("Retrieving Listas_de_reproduccion2 by Listas_de_reproduccion2Criteria");
		database.Listas_de_reproduccion2Criteria ldatabaseListas_de_reproduccion2Criteria = new database.Listas_de_reproduccion2Criteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldatabaseListas_de_reproduccion2Criteria.id_lista.eq();
		System.out.println(ldatabaseListas_de_reproduccion2Criteria.uniqueListas_de_reproduccion2());
		
		System.out.println("Retrieving Usuario_Administrador by Usuario_AdministradorCriteria");
		database.Usuario_AdministradorCriteria ldatabaseUsuario_AdministradorCriteria = new database.Usuario_AdministradorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldatabaseUsuario_AdministradorCriteria.ID.eq();
		System.out.println(ldatabaseUsuario_AdministradorCriteria.uniqueUsuario_Administrador());
		
		System.out.println("Retrieving Categorias2 by Categorias2Criteria");
		database.Categorias2Criteria ldatabaseCategorias2Criteria = new database.Categorias2Criteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldatabaseCategorias2Criteria.id_categoria.eq();
		System.out.println(ldatabaseCategorias2Criteria.uniqueCategorias2());
		
		System.out.println("Retrieving Comentarios by ComentariosCriteria");
		database.ComentariosCriteria ldatabaseComentariosCriteria = new database.ComentariosCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//ldatabaseComentariosCriteria.id_comentario.eq();
		System.out.println(ldatabaseComentariosCriteria.uniqueComentarios());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateProyectoMDSData retrieveAndUpdateProyectoMDSData = new RetrieveAndUpdateProyectoMDSData();
			try {
				retrieveAndUpdateProyectoMDSData.retrieveAndUpdateTestData();
				//retrieveAndUpdateProyectoMDSData.retrieveByCriteria();
			}
			finally {
				database.ProyectoMDSPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
