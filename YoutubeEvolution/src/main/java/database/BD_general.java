package database;

import java.util.List;

import com.vaadin.ui.TextArea;

import evolutionYoutube.Categoria;
import evolutionYoutube.Listas_creadas;
import evolutionYoutube.Etiqueta;

public class BD_general implements IRegistrado, IInvitado, IAdministrador {
	public BD_Videos _bd_Videos;
	public BD_listas _bd_listas;
	public BD_Usuario_registrado _bd_UsuariosRegistrados;
	public BD_Categorias _bd_categorias;
	public BD_Usuario_administrador _bd_Administradores;
	public BD_Comentarios _bd_Comentarios;

	public List Cargar_Videos_Relacionados() {
		throw new UnsupportedOperationException();
	}

	public List Cargar_Videos_Suscripciones() {
		throw new UnsupportedOperationException();
	}

	public void Registrarse(String aNombre, String aApellidos, String aApodo, int aEdad, String aEmail, String aContrasenia, String aConfirmacion) {
		throw new UnsupportedOperationException();
	}

	public void Subir_video(String aTitulo, String aMiniatura, boolean aDeshabilitar_comentarios, TextArea aDescripcion, String aEtiquetas, Categoria aCategoria, Listas_creadas aLista) {
		throw new UnsupportedOperationException();
	}

	public void descargar(int aID) {
		throw new UnsupportedOperationException();
	}

	public List cargar_Comentarios(int aID) {
		throw new UnsupportedOperationException();
	}

	public void aniade_a_lista(int aIDvideo, int aIDlista) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_comentario(Object aIDcomentario) {
		throw new UnsupportedOperationException();
	}

	public void me_gusta(int aIDvideo) {
		throw new UnsupportedOperationException();
	}

	public void enviar_comentario(TextArea aTexto, int aIDvideo) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_Video_De_Lista(int[] aLista_De_IDs_Videos) {
		throw new UnsupportedOperationException();
	}

	public void cambiar_Nombre_Lista(String aNuevo_Nombre) {
		throw new UnsupportedOperationException();
	}

	public List cargar_Lista_Videos(int aId_Lista) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_lista_reproduccion(int aID_lista) {
		throw new UnsupportedOperationException();
	}

	public Usuario_registrado cargar_Datos_Registrado(int aID_Registrado) {
		throw new UnsupportedOperationException();
	}

	public String editar_avatar(int aID_Usuario) {
		throw new UnsupportedOperationException();
	}

	public void modificar_datos(String aNombre, String aApellido, String aApodo, String aAnio, String aEmail, String aContrasenia) {
		throw new UnsupportedOperationException();
	}

	public void dejar_de_seguir(int aID_Usuario) {
		throw new UnsupportedOperationException();
	}

	public List cargar_Seguidores(int aID_Usuario) {
		throw new UnsupportedOperationException();
	}

	public List cargar_Suscripciones(int aID_Usuario) {
		throw new UnsupportedOperationException();
	}

	public void suscribirse(int aID_Usuario) {
		throw new UnsupportedOperationException();
	}

	public List cargar_Listas_Reproduccion(int aID_Usuario) {
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

	public void eliminar_Video(int aIDVideo) {
		throw new UnsupportedOperationException();
	}

	public void editar_Miniatura(int aIDVideo) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_comentario_propio(int aIDComentario) {
		throw new UnsupportedOperationException();
	}

	public List Cargar_Videos_Megusta() {
		throw new UnsupportedOperationException();
	}

	public List Cargar_Videos_Recientes() {
		throw new UnsupportedOperationException();
	}

	public List Cargar_Categorias() {
		throw new UnsupportedOperationException();
	}

	public Etiqueta[] ver_etiquetas() {
		throw new UnsupportedOperationException();
	}

	public void recuperar_contrasenia(String aEmail) {
		throw new UnsupportedOperationException();
	}

	public List buscar(String aTexto, String aTipo) {
		throw new UnsupportedOperationException();
	}

	public void iniciar_sesion(String aEmail, String aContrasenia) {
		throw new UnsupportedOperationException();
	}

	public void Eliminar_video(int aID) {
		throw new UnsupportedOperationException();
	}

	public void crear_categoria(String aNombre, String aContrasenia, int aEdad, String aImagen, boolean aConfirmacion) {
		throw new UnsupportedOperationException();
	}

	public List cargar_Lista_De_Categorias() {
		throw new UnsupportedOperationException();
	}

	public void eliminar_categoria(int aId_categoria) {
		throw new UnsupportedOperationException();
	}

	public List cargar_Lista_Usuarios() {
		throw new UnsupportedOperationException();
	}

	public void editar_Categoria(String aNombre_categoria, String aIcono_categoria, int aEdad_categoria) {
		throw new UnsupportedOperationException();
	}

	public Usuario_Administrador cargar_datos_admin(int aID_Admin) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_Usuario(int aIDUsuario) {
		throw new UnsupportedOperationException();
	}
}