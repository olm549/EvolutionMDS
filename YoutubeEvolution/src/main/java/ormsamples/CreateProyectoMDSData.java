/**
 * Licensee: OLM(University of Almeria)
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateProyectoMDSData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = database.ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			database.Usuarios ldatabaseUsuarios = database.UsuariosDAO.createUsuarios();
			// Initialize the properties of the persistent object here
			database.UsuariosDAO.save(ldatabaseUsuarios);
			database.Usuario_registrado ldatabaseUsuario_registrado = database.Usuario_registradoDAO.createUsuario_registrado();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : historial_usuario, suscriptor, listas_de_reproduccion, video_visualizado, video_subido, suscripcion, comentarios, videos_que_gustan, suscribe, suscrito, edad, numeroVisitas, id_Usuario_registrado
			database.Usuario_registradoDAO.save(ldatabaseUsuario_registrado);
			database.Videos ldatabaseVideos = database.VideosDAO.createVideos();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : usuario_visualizador, listas_de_videos, usuarios_que_dan_me_gusta, comentarios_en_videos, duracion, numVisualizaciones, categoria, autor
			database.VideosDAO.save(ldatabaseVideos);
			database.Listas_de_reproduccion2 ldatabaseListas_de_reproduccion2 = database.Listas_de_reproduccion2DAO.createListas_de_reproduccion2();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : videos_en_lista, num_videos, usuario_registrado, usuario_que_consulta_historial
			database.Listas_de_reproduccion2DAO.save(ldatabaseListas_de_reproduccion2);
			database.Usuario_Administrador ldatabaseUsuario_Administrador = database.Usuario_AdministradorDAO.createUsuario_Administrador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : id_Usuario_Administrador
			database.Usuario_AdministradorDAO.save(ldatabaseUsuario_Administrador);
			database.Categorias2 ldatabaseCategorias2 = database.Categorias2DAO.createCategorias2();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : videos, edad
			database.Categorias2DAO.save(ldatabaseCategorias2);
			database.Comentarios ldatabaseComentarios = database.ComentariosDAO.createComentarios();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : usuarios_que_comentan, videosComentados
			database.ComentariosDAO.save(ldatabaseComentarios);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateProyectoMDSData createProyectoMDSData = new CreateProyectoMDSData();
			try {
				createProyectoMDSData.createTestData();
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
