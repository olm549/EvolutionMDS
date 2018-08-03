package database;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import database.Categorias2;

public class BD_Categorias {
	public BD_general _bd_principalCategorias;
	public Vector<Categorias2> _contieneCategorias = new Vector<Categorias2>();

	public List Cargar_Categorias() throws PersistentException {
		Categorias2[] lista = null;
		ArrayList<Categorias2> listaCateg = new ArrayList();
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
			Categorias2Criteria crit = new Categorias2Criteria();
			crit.id_categoria.ge(0);
			lista = Categorias2DAO.listCategorias2ByCriteria(crit);
			for(Categorias2 cat : lista) {
				listaCateg.add(cat);
			}
			
		} catch(Exception e) {
			transaccion.rollback();			
		}
		return listaCateg;
	}

	public void crear_categoria(int idAdmin, String aNombre, String aContrasenia, int aEdad, String aImagen, boolean aConfirmacion) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try {
		if(aConfirmacion == false) {
			throw new RuntimeException("No se ha confirmado.");
		}
		Usuario_Administrador user = database.Usuario_AdministradorDAO.getUsuario_AdministradorByORMID(idAdmin);
		if(!user.getContrasenia().equals(aContrasenia)) {
			throw new RuntimeException("Contrasenia no coincide");
		}
		Categorias2 categ = database.Categorias2DAO.createCategorias2();
		categ.setEdad(aEdad);
		categ.setIcono(aImagen);
		categ.setNombre(aNombre);
		transaccion.commit();
			
		} catch (Exception e) {
			transaccion.rollback();
			e.printStackTrace();
		}
	}

	public void eliminar_categoria(int aId_categoria) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try{
			Categorias2 cat = database.Categorias2DAO.getCategorias2ByORMID(aId_categoria);
			if(cat==null) {
				throw new RuntimeException("NO SE ENCONTRÓ EL ID");
			}
			database.Categorias2DAO.delete(cat);
			transaccion.commit();
		}catch(Exception e) {
			transaccion.rollback();
			e.printStackTrace();
		}
	}

	public void editarCategoria(int id_Categoria, String aNombre_categoria, String aIcono_categoria, int aEdad_categoria) throws PersistentException {
		PersistentTransaction transaccion = ProyectoMDSPersistentManager.instance().getSession().beginTransaction();
		try{
			Categorias2 cat = database.Categorias2DAO.getCategorias2ByORMID(id_Categoria);
		cat.setNombre(aNombre_categoria);
		cat.setIcono(aIcono_categoria);
		cat.setEdad(aEdad_categoria);
		transaccion.commit();
		}catch(Exception e ) {
			transaccion.rollback();
			e.printStackTrace();
		}
		
	}
}