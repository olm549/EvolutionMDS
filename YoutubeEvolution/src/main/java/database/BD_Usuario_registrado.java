package database;

import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import database.Usuario_registrado;

public class BD_Usuario_registrado {
	public BD_general _bd_principalRegistrados;
	public Vector<Usuario_registrado> _contieneRegistrados = new Vector<Usuario_registrado>();

	public void Registrarse(String aNombre, String aApellidos, String aApodo, int aEdad, String aEmail, String aContrasenia, String aConfirmacion) throws PersistentException {
		Usuario_registradoCriteria criteria = new Usuario_registradoCriteria();
		criteria.email.eq(aEmail);
		if(criteria.uniqueUsuario_registrado()!=null) throw new RuntimeException("Email en uso");
		criteria.apodo.eq(aApodo);
		if(criteria.uniqueUsuario_registrado()!=null) throw new RuntimeException("Apodo en uso");
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_registrado registrado = database.Usuario_registradoDAO.createUsuario_registrado();
			registrado.setNombre(aNombre);
			registrado.setApellido(aApellidos);
			registrado.setApodo(aApodo);
			registrado.setEdad(aEdad);
			registrado.setEmail(aEmail);
			registrado.setContrasenia(aContrasenia);
			registrado.setNumeroVisitas(0);
			Listas_de_reproduccion2 lrd = database.Listas_de_reproduccion2DAO.createListas_de_reproduccion2();
			lrd.setUsuario_registrado(registrado);
			lrd.setUsuario_que_consulta_historial(registrado);
			Usuario_registradoDAO.save(registrado);
			Listas_de_reproduccion2DAO.save(lrd);
			transaccion.commit();
		} catch(Exception e) {
			transaccion.rollback();			
		}
	}

	public List buscar(String aTexto) {
		throw new UnsupportedOperationException();
	}

	public boolean Existe(String aEmail, String aApodo) {
		throw new UnsupportedOperationException();
	}

	public void iniciar_sesion(String aEmail, String aContrasenia) {
		comprobar_inicio(aEmail,aContrasenia);
	}

	public boolean comprobar_inicio(String aEmail, String aContrasenia) {
		return true;
	}

	public void recuperar_contrasenia(String aEmail) {
		comprobar_email(aEmail);
	}

	public void comprobar_email(String aEmail) {
		
	}

	public List cargar_Lista_Usuarios() {
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
}