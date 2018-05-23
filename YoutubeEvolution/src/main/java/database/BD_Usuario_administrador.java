package database;

import java.util.Vector;
import database.Usuario_Administrador;

public class BD_Usuario_administrador {
	public BD_general _bd_principalAdministrador;
	public Vector<Usuario_Administrador> _contieneAdministradores = new Vector<Usuario_Administrador>();

	public Usuario_Administrador cargar_datos_admin(int aID_Admin) {
		throw new UnsupportedOperationException();
	}

	public void modificar_datos(String aNombre, String aApellido, String aApodo, String aAnio, String aEmail, String aContrasenia) {
		throw new UnsupportedOperationException();
	}

	public void eliminar_Usuario(int aIDUsuario) {
		throw new UnsupportedOperationException();
	}
}