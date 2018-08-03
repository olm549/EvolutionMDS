package database;

import java.util.List;

import org.orm.PersistentException;

import com.vaadin.ui.TextArea;


public class BD_general implements IRegistrado, IInvitado, IAdministrador {
	public BD_Videos _bd_Videos;
	public BD_listas _bd_listas;
	public BD_Usuario_registrado _bd_UsuariosRegistrados;
	public BD_Categorias _bd_categorias;
	public BD_Usuario_administrador _bd_Administradores;
	public BD_Comentarios _bd_Comentarios;

	public List Cargar_Videos_Relacionados() {
		BD_Videos bd = new BD_Videos();
		List lista = null;
		try {
			lista = bd.Cargar_Videos_Relacionados();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	public List Cargar_Videos_Suscripciones() {
		BD_Videos bd = new BD_Videos();
		List lista = null;
		try {
			lista = bd.Cargar_Videos_Suscripciones();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	public void Registrarse(String aNombre, String aApellidos, String aApodo, int aEdad, String aEmail, String aContrasenia, String aConfirmacion) {
		BD_Usuario_registrado bd = new BD_Usuario_registrado();
		try {
			bd.Registrarse(aNombre, aApellidos, aApodo, aEdad, aEmail, aContrasenia, aConfirmacion);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void subir_video(String aTitulo, String aMiniatura, boolean aDeshabilitar_comentarios, TextArea aDescripcion, String aEtiquetas, String categoria, String lista) { 
		BD_Videos bd = new BD_Videos();
		try {
			bd.subir_video(aTitulo, aMiniatura, aDeshabilitar_comentarios, aDescripcion, aEtiquetas, categoria, lista);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void descargar(int aID) {
		BD_Videos bd = new BD_Videos();
		bd.descargar(aID);
	}

	public List cargar_Comentarios(int aID) {
		BD_Comentarios bd = new BD_Comentarios();
		try {
			List lista = bd.cargar_Comentarios(aID);
			return lista;
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void aniade_a_lista(int aIDvideo, int aIDlista) {
		BD_listas bd = new BD_listas();
		bd.aniade_a_lista(aIDvideo, aIDlista);
	}

	public void eliminar_comentarioAdmin(int aIDcomentario) {
		BD_Comentarios bd = new BD_Comentarios();
		bd.eliminar_comentario(aIDcomentario);
	}

	public void me_gusta(int aIDvideo) {
		BD_Videos bd = new BD_Videos();
		bd.me_gusta(aIDvideo);
	}

	public void enviar_comentario(TextArea aTexto, int aIDvideo, int aIDusuario) {
		BD_Comentarios bd = new BD_Comentarios();
		try {
			bd.enviar_comentario(aTexto, aIDvideo, aIDusuario);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void eliminar_Video_De_Lista(int[] aLista_De_IDs_Videos) {
		BD_listas bd = new BD_listas();
		bd.eliminar_Video_De_Lista(aLista_De_IDs_Videos);
	}

	public void cambiar_Nombre_Lista(String aNuevo_Nombre) {
		BD_listas bd = new BD_listas();
		bd.cambiar_Nombre_Lista(aNuevo_Nombre);
	}

	public List cargar_Lista_Videos(int aId_Lista) {
		BD_listas bd = new BD_listas();
		return bd.cargar_Lista_Videos(aId_Lista);
	}

	public void eliminar_lista_reproduccion(int aID_lista) {
		BD_listas bd = new BD_listas();
		bd.eliminar_lista_reproduccion(aID_lista);
	}

	public Usuario_registrado cargar_Datos_Registrado(int aID_Registrado) {
		BD_Usuario_registrado bd = new BD_Usuario_registrado();
		return bd.cargar_Datos_Registrado(aID_Registrado);
	}

	public String editar_avatar(int aID_Usuario) {
		BD_Usuario_registrado bd = new BD_Usuario_registrado();
		return bd.editar_avatar(aID_Usuario);
	}

	public void modificar_datos(String aNombre, String aApellido, String aApodo, String aAnio, String aEmail, String aContrasenia) {
		BD_Usuario_registrado bd = new BD_Usuario_registrado();
		bd.modificar_datos(aNombre, aApellido, aApodo, aAnio, aEmail, aContrasenia);
		
	}

	public void dejar_de_seguir(int aID_Usuario) {
		BD_Usuario_registrado bd = new BD_Usuario_registrado();
		bd.dejar_de_seguir(aID_Usuario);
	}

	public List cargar_Seguidores(int aID_Usuario) {
		BD_Usuario_registrado bd = new BD_Usuario_registrado();
		return bd.cargar_Seguidores(aID_Usuario);
	}

	public List cargar_Suscripciones(int aID_Usuario) {
		BD_Usuario_registrado bd = new BD_Usuario_registrado();
		return bd.cargar_Suscripciones(aID_Usuario);
	}

	public void suscribirse(int aID_Usuario) {
		BD_Usuario_registrado bd = new BD_Usuario_registrado();
		bd.suscribirse(aID_Usuario);
	}

	public List cargar_Listas_Reproduccion(int aID_Usuario) {
		BD_listas bd = new BD_listas();
		return bd.cargar_Listas_Reproduccion(aID_Usuario);
	}

	public List cargar_Videos_Subidos(int aIDUsuario) {
		BD_Videos bd = new BD_Videos();
		return bd.cargar_Videos_Subidos(aIDUsuario);
			
	}

	public List cargar_Gestion_Videos_Subidos(int aIDUsuario) {
		BD_Videos bd = new BD_Videos();
		return bd.cargar_Gestion_Videos_Subidos(aIDUsuario);
	}

	public void modificar_video(String aTitulo, String aDescripcion, int[] aId_categorias, String aEtiquetas) {
		BD_Videos bd = new BD_Videos();
		bd.modificar_video(aTitulo, aDescripcion, aId_categorias, aEtiquetas);
	}

	public void eliminar_Video(int aIDVideo) {
		BD_Videos bd = new BD_Videos();
		bd.eliminarVideo(aIDVideo);
	}

	public void editar_Miniatura(int aIDVideo) {
		BD_Videos bd = new BD_Videos();
		bd.editar_Miniatura(aIDVideo);
	}

	public void eliminar_comentario_propio(int aIDUsuario, int aIDComentario, int aIDVideo) {
		BD_Comentarios bd = new BD_Comentarios();
		try {
			bd.eliminar_comentario_propio(aIDUsuario, aIDComentario, aIDVideo);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List Cargar_Videos_Megusta() {
		BD_Videos bd = new BD_Videos();
		List lista = null;
		try {
			lista = bd.Cargar_Videos_Megusta();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	public List Cargar_Videos_Recientes() {
		BD_Videos bd = new BD_Videos();
		List lista = null;
		try {
			lista = bd.Cargar_Videos_Recientes();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;
	}

	public List Cargar_Categorias() {
		BD_Categorias bd = new BD_Categorias();
		try {
			return bd.Cargar_Categorias();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List ver_etiquetas() {
		BD_Videos bd = new BD_Videos();
		return bd.ver_etiquetas();
	}

	public void recuperar_contrasenia(String aEmail) {
		BD_Usuario_registrado bd = new BD_Usuario_registrado();
		bd.recuperar_contrasenia(aEmail);
	}

	public List buscar(String aTexto, String aTipo) {
		if(aTipo.equals("Video")) {
			BD_Videos bd = new BD_Videos();
			return bd.buscar(aTexto);
			
		}
		else {
			BD_Usuario_registrado bd = new BD_Usuario_registrado();
			return bd.buscar(aTexto);
		}
	}

	public void iniciar_sesion(String aEmail, String aContrasenia) {
		BD_Usuario_registrado bd = new BD_Usuario_registrado();
		bd.iniciar_sesion(aEmail, aContrasenia);
	}

	public void Eliminar_video(int aID) {
		BD_Videos bd = new BD_Videos();
		bd.Eliminar_video(aID);
		
	}

	public void crear_categoria(int idAdmin, String aNombre, String aContrasenia, int aEdad, String aImagen, boolean aConfirmacion) {
		BD_Categorias bd = new BD_Categorias();
		try {
			bd.crear_categoria(idAdmin, aNombre, aContrasenia, aEdad, aImagen, aConfirmacion);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List cargar_Lista_De_Categorias() {
		BD_Categorias bd = new BD_Categorias();
		try {
			return bd.Cargar_Categorias();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void eliminar_categoria(int aId_categoria) {
		BD_Categorias bd = new BD_Categorias();
		try {
			bd.eliminar_categoria(aId_categoria);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public List cargar_Lista_Usuarios() {
		BD_Usuario_registrado bd = new BD_Usuario_registrado();
		return bd.cargar_Lista_Usuarios();
	}

	public void editar_Categoria(int id_Categoria, String aNombre_categoria, String aIcono_categoria, int aEdad_categoria) {
		BD_Categorias bd = new BD_Categorias();
		try {
			bd.editarCategoria(id_Categoria, aNombre_categoria, aIcono_categoria, aEdad_categoria);
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Usuario_Administrador cargar_datos_admin(int aID_Admin) {
		BD_Usuario_administrador bd = new BD_Usuario_administrador();
		return bd.cargar_datos_admin(aID_Admin);
	}

	public void eliminar_Usuario(int aIDUsuario) {
		BD_Usuario_administrador bd = new BD_Usuario_administrador();
		bd.eliminar_Usuario(aIDUsuario);
	}

}