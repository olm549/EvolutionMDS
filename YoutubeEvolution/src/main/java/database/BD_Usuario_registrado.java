package database;

import java.util.List;
import java.util.Vector;
import database.Usuario_registrado;

public class BD_Usuario_registrado {
	public BD_general _bd_principalRegistrados;
	public Vector<Usuario_registrado> _contieneRegistrados = new Vector<Usuario_registrado>();

	public void Registrarse(String aNombre, String aApellidos, String aApodo, int aEdad, String aEmail, String aContrasenia, String aConfirmacion) {
		throw new UnsupportedOperationException();
	}

	public List buscar(String aTexto) {
		throw new UnsupportedOperationException();
	}

	public boolean Existe(String aEmail, String aApodo) {
		throw new UnsupportedOperationException();
	}

	public void iniciar_sesion(String aEmail, String aContrasenia) {
		throw new UnsupportedOperationException();
	}

	public void comprobar_inicio(String aEmail, String aContrasenia) {
		throw new UnsupportedOperationException();
	}

	public void recuperar_contrasenia(String aEmail) {
		throw new UnsupportedOperationException();
	}

	public void comprobar_email(String aEmail) {
		throw new UnsupportedOperationException();
	}

	public List cargar_Lista_Usuarios() {
		throw new UnsupportedOperationException();
	}

	public BD_Usuario_registrado cargar_Datos_Registrado(int aID_Registrado) {
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
}