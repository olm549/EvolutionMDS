package database;
import java.util.List;
import java.util.Vector;

import com.vaadin.ui.TextArea;

import database.Videos;
import evolutionYoutube.Categoria;
import evolutionYoutube.Listas_creadas;

public class BD_Videos {
	public BD_general _bd_PrincipalVideos;
	public Vector<Videos> _contieneVideo = new Vector<Videos>();

	public List Cargar_Videos_Megusta() {
		throw new UnsupportedOperationException();
	}

	public List Cargar_Videos_Recientes() {
		throw new UnsupportedOperationException();
	}

	public List Cargar_Videos_Relacionados() {
		throw new UnsupportedOperationException();
	}

	public List Cargar_Videos_Suscripciones() {
		throw new UnsupportedOperationException();
	}

	public void Subir_video(String aTitulo, String aMiniatura, boolean aDeshabilitar_comentarios, TextArea aDescripcion, String aEtiquetas, Categoria aCategoria, Listas_creadas aLista) {
		throw new UnsupportedOperationException();
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