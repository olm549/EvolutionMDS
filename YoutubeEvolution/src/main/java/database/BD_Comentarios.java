package database;
import java.util.List;
import java.util.Vector;

import com.vaadin.ui.TextArea;

import database.Comentarios;

public class BD_Comentarios {
	public BD_general _bd_PrincipalComentarios;
	public Vector<Comentarios> _contieneComentarios = new Vector<Comentarios>();

	public List cargar_Comentarios(int aID) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_comentario(int aIDcomentario) {
		throw new UnsupportedOperationException();
	}

	public void enviar_comentario(TextArea aTexto, int aIDvideo) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_comentario_propio(int aIDComentario) {
		throw new UnsupportedOperationException();
	}
}