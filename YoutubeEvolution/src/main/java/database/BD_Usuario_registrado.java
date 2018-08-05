package database;

import java.util.ArrayList;
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
			registrado.listas_de_reproduccion.add(lrd);
			Usuario_registradoDAO.save(registrado);
			Listas_de_reproduccion2DAO.save(lrd);
			transaccion.commit();
		} catch(Exception e) {
			transaccion.rollback();			
		}
	}

	public List<Usuario_registrado> buscar(String aTexto) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		ArrayList<Usuario_registrado> lista = new ArrayList<Usuario_registrado>();
		try {
			Usuario_registrado[] listaUsers = Usuario_registradoDAO.listUsuario_registradoByQuery("apodo LIKE %"+aTexto+"%", "1");
			for(Usuario_registrado user : listaUsers) {
				lista.add(user);
		}
		}catch(Exception e) {
			transaccion.rollback();
			e.printStackTrace();
		}
		return lista;
	}

	public boolean Existe(String aEmail, String aApodo) throws PersistentException {
		if(Usuario_registradoDAO.queryUsuario_registrado("email = "+aEmail, "1").isEmpty()&&Usuario_registradoDAO.queryUsuario_registrado("apodo = "+aApodo, "1").isEmpty()) {
			return false;
		}
		return true;
	}

	public void iniciar_sesion(String aEmail, String aContrasenia) throws PersistentException {
		if(comprobar_inicio(aEmail,aContrasenia) == true) {
			
		}else {
			
		}
		
	}

	public boolean comprobar_inicio(String aEmail, String aContrasenia) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_registrado user = Usuario_registradoDAO.loadUsuario_registradoByQuery("email = "+aEmail, "1");
			if(user.getContrasenia().equals(aContrasenia)) {
				return true;
			}
			return false;
		}catch(Exception e) {
			transaccion.rollback();
			e.printStackTrace();
			return false;
		}
	}

	public void recuperar_contrasenia(String aEmail) throws PersistentException {
		if(comprobar_email(aEmail)==false) return;
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try{
			Usuario_registrado user = Usuario_registradoDAO.loadUsuario_registradoByQuery("aEmail "+aEmail, "1");
			user.setContrasenia("2345");
			Usuario_registradoDAO.save(user);
			transaccion.commit();
		}catch(Exception e) {
			e.printStackTrace();
			transaccion.rollback();
		}
	}

	public boolean comprobar_email(String aEmail) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_registrado user = Usuario_registradoDAO.loadUsuario_registradoByQuery("email = "+aEmail, "1");
			if(user==null) {
				return false;
			}
			return true;
		}catch(Exception e) {
			transaccion.rollback();
			e.printStackTrace();
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Usuario_registrado> cargar_Lista_Usuarios() throws PersistentException {
		List<Usuario_registrado> listaUsers=null;
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			
	      listaUsers=Usuario_registradoDAO.queryUsuario_registrado("ID > 0", "1");
		} catch(Exception e) {
			transaccion.rollback();			
		}
		return listaUsers;
	}

	public Usuario_registrado cargar_Datos_Registrado(int aID_Registrado) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		Usuario_registrado user = null;
		try {
			user = database.Usuario_registradoDAO.loadUsuario_registradoByQuery("ID = "+aID_Registrado, "1");
		}catch(Exception e ) {
			transaccion.rollback();
			e.printStackTrace();
		}
		return user;
	}

	public void editar_avatar(int aID_Usuario, String avatar) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_registrado user = Usuario_registradoDAO.loadUsuario_registradoByQuery("ID = "+aID_Usuario, "1");
			user.setAvatar(avatar);
			Usuario_registradoDAO.save(user);
			transaccion.commit();
		}catch(Exception e ) {
			e.printStackTrace();
			transaccion.rollback();
		}
	}

	public void modificar_datos(int id, String aNombre, String aApellido, String aApodo, String aAnio, String aEmail, String aContrasenia) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			Usuario_registrado user = database.Usuario_registradoDAO.loadUsuario_registradoByQuery("ID ="+id, "1");
			user.setNombre(aNombre);
			user.setApellido(aApellido);
			user.setContrasenia(aContrasenia);
			user.setEmail(aEmail);
			user.setApodo(aApodo);
			Usuario_registradoDAO.save(user);
			transaccion.commit();
		}catch(Exception e) {
			transaccion.rollback();
			e.printStackTrace();
		}
	}

	public void dejar_de_seguir(int aID_Usuario, int ID_Usuarioseguido) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try{
			Usuario_registrado user = Usuario_registradoDAO.loadUsuario_registradoByQuery("ID = "+aID_Usuario, "1");
			Usuario_registrado seguido = Usuario_registradoDAO.loadUsuario_registradoByQuery("ID = "+ID_Usuarioseguido, "1");
			user.suscriptor.remove(seguido);
			seguido.suscripcion.remove(user);
			Usuario_registradoDAO.save(user);
			Usuario_registradoDAO.save(seguido);
			transaccion.commit();
		}catch(Exception e ) {
			transaccion.rollback();
			e.printStackTrace();
		}
	}

	public List<Usuario_registrado> cargar_Seguidores(int aID_Usuario) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		ArrayList<Usuario_registrado> listaSeguidores=new ArrayList<Usuario_registrado>();
		try {
			
	      Usuario_registrado user = Usuario_registradoDAO.loadUsuario_registradoByQuery("ID = "+aID_Usuario, "1");
	      for(Usuario_registrado foo : user.suscriptor.toArray()) {
	    	  listaSeguidores.add(foo);
	      }
		} catch(Exception e) {
			transaccion.rollback();			
		}
		return listaSeguidores;
	}

	public List<Usuario_registrado> cargar_Suscripciones(int aID_Usuario) throws PersistentException {
		
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		ArrayList<Usuario_registrado> listaSeguidos=new ArrayList<Usuario_registrado>();
		try {
			
	      Usuario_registrado user = Usuario_registradoDAO.loadUsuario_registradoByQuery("ID = "+aID_Usuario, "1");
	      for(Usuario_registrado foo : user.suscripcion.toArray()) {
	    	  listaSeguidos.add(foo);
	      }
		} catch(Exception e) {
			transaccion.rollback();			
		}
		return listaSeguidos;
		
	}

	public void suscribirse(int aID_Usuario, int ID_Usuariosusc) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try{
			Usuario_registrado user = Usuario_registradoDAO.loadUsuario_registradoByQuery("ID = "+aID_Usuario, "1");
			Usuario_registrado seguido = Usuario_registradoDAO.loadUsuario_registradoByQuery("ID = "+ID_Usuariosusc, "1");
			user.suscriptor.add(seguido);
			seguido.suscripcion.add(user);
			Usuario_registradoDAO.save(user);
			Usuario_registradoDAO.save(seguido);
			transaccion.commit();
		}catch(Exception e ) {
			transaccion.rollback();
			e.printStackTrace();
		}
	}
}