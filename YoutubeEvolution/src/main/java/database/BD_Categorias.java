package database;
import java.util.List;
import java.util.Vector;
import database.Categorias2;

public class BD_Categorias {
	public BD_general _bd_principalCategorias;
	public Vector<Categorias2> _contieneCategorias = new Vector<Categorias2>();

	public List Cargar_Categorias() {
		throw new UnsupportedOperationException();
	}

	public void crear_categoria(String aNombre, String aContrasenia, int aEdad, String aImagen, boolean aConfirmacion) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_categoria(int aId_categoria) {
		throw new UnsupportedOperationException();
	}

	public void editarCategoria(String aNombre_categoria, String aIcono_categoria, int aEdad_categoria) {
		throw new UnsupportedOperationException();
	}
}