package database;
import java.util.List;

import org.orm.PersistentException;

import com.vaadin.ui.TextArea;

//import evolutionYoutube.Categoria;
import evolutionYoutube.Listas_creadas;

public interface IRegistrado {

	public List Cargar_Videos_Relacionados();

	public List Cargar_Videos_Suscripciones();

	public void Registrarse(String aNombre, String aApellidos, String aApodo, int aEdad, String aEmail, String aContrasenia, String aConfirmacion);

	public void subir_video(String aTitulo, String aMiniatura, boolean aDeshabilitar_comentarios, TextArea aDescripcion, String aEtiquetas, String aCategoria, String aLista) throws PersistentException;

	public void descargar(int aID);

	public List cargar_Comentarios(int aID);

	public void aniade_a_lista(int aIDvideo, int aIDlista);

	public void me_gusta(int aIDvideo);

	public void enviar_comentario(TextArea aTexto, int aIDvideo, int aIDUsuario) throws PersistentException;

	public void eliminar_Video_De_Lista(int[] aLista_De_IDs_Videos);

	public void cambiar_Nombre_Lista(String aNuevo_Nombre);

	public List cargar_Lista_Videos(int aId_Lista);

	public void eliminar_lista_reproduccion(int aID_lista);

	public Usuario_registrado cargar_Datos_Registrado(int aID_Registrado);

	public String editar_avatar(int aID_Usuario);

	public void modificar_datos(String aNombre, String aApellido, String aApodo, String anio, String aEmail, String aContrasenia);

	public void dejar_de_seguir(int aID_Usuario);

	public List cargar_Seguidores(int aID_Usuario);

	public List cargar_Suscripciones(int aID_Usuario);

	public void suscribirse(int aID_Usuario);

	public List cargar_Listas_Reproduccion(int aID_Usuario);

	public List cargar_Videos_Subidos(int aIDUsuario);

	public List cargar_Gestion_Videos_Subidos(int aIDUsuario);

	public void modificar_video(String aTitulo, String aDescripcion, int[] aId_categorias, String aEtiquetas);

	public void eliminar_Video(int aIDVideo);

	public void editar_Miniatura(int aIDVideo);

	public void eliminar_comentario_propio(int aIDUsuario, int aIDComentario, int aIDVideo);
}