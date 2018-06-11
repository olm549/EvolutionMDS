package database;

import java.util.List;
import java.util.Vector;
import database.Listas_de_reproduccion2;

public class BD_listas {
	public BD_general _bd_PrincipalListas;
	public Vector<Listas_de_reproduccion2> _contieneListas = new Vector<Listas_de_reproduccion2>();

	public void aniade_a_lista(int aIDvideo, int aIDlista) {
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

	public void eliminar_Video_De_Lista(int[] aLista_De_IDs_Videos) {
		// TODO Auto-generated method stub
		
	}

	public List cargar_Listas_Reproduccion(int aID_Usuario) {
		throw new UnsupportedOperationException();
		
	}
}