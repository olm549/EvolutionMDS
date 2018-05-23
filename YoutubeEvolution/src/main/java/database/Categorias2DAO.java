/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: OLM(University of Almeria)
 * License Type: Academic
 */
package database;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class Categorias2DAO {
	public static Categorias2 loadCategorias2ByORMID(int id_categoria) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return loadCategorias2ByORMID(session, id_categoria);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categorias2 getCategorias2ByORMID(int id_categoria) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return getCategorias2ByORMID(session, id_categoria);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categorias2 loadCategorias2ByORMID(int id_categoria, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return loadCategorias2ByORMID(session, id_categoria, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categorias2 getCategorias2ByORMID(int id_categoria, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return getCategorias2ByORMID(session, id_categoria, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categorias2 loadCategorias2ByORMID(PersistentSession session, int id_categoria) throws PersistentException {
		try {
			return (Categorias2) session.load(database.Categorias2.class, new Integer(id_categoria));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categorias2 getCategorias2ByORMID(PersistentSession session, int id_categoria) throws PersistentException {
		try {
			return (Categorias2) session.get(database.Categorias2.class, new Integer(id_categoria));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categorias2 loadCategorias2ByORMID(PersistentSession session, int id_categoria, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Categorias2) session.load(database.Categorias2.class, new Integer(id_categoria), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categorias2 getCategorias2ByORMID(PersistentSession session, int id_categoria, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Categorias2) session.get(database.Categorias2.class, new Integer(id_categoria), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCategorias2(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return queryCategorias2(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCategorias2(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return queryCategorias2(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categorias2[] listCategorias2ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return listCategorias2ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categorias2[] listCategorias2ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return listCategorias2ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCategorias2(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From database.Categorias2 as Categorias2");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCategorias2(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From database.Categorias2 as Categorias2");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Categorias2", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categorias2[] listCategorias2ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCategorias2(session, condition, orderBy);
			return (Categorias2[]) list.toArray(new Categorias2[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categorias2[] listCategorias2ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryCategorias2(session, condition, orderBy, lockMode);
			return (Categorias2[]) list.toArray(new Categorias2[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categorias2 loadCategorias2ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return loadCategorias2ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categorias2 loadCategorias2ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return loadCategorias2ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categorias2 loadCategorias2ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Categorias2[] categorias2s = listCategorias2ByQuery(session, condition, orderBy);
		if (categorias2s != null && categorias2s.length > 0)
			return categorias2s[0];
		else
			return null;
	}
	
	public static Categorias2 loadCategorias2ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Categorias2[] categorias2s = listCategorias2ByQuery(session, condition, orderBy, lockMode);
		if (categorias2s != null && categorias2s.length > 0)
			return categorias2s[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCategorias2ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return iterateCategorias2ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCategorias2ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return iterateCategorias2ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCategorias2ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From database.Categorias2 as Categorias2");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCategorias2ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From database.Categorias2 as Categorias2");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Categorias2", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categorias2 createCategorias2() {
		return new database.Categorias2();
	}
	
	public static boolean save(database.Categorias2 categorias2) throws PersistentException {
		try {
			ProyectoMDSPersistentManager.instance().saveObject(categorias2);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(database.Categorias2 categorias2) throws PersistentException {
		try {
			ProyectoMDSPersistentManager.instance().deleteObject(categorias2);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(database.Categorias2 categorias2)throws PersistentException {
		try {
			database.Videos[] lVideoss = categorias2.videos.toArray();
			for(int i = 0; i < lVideoss.length; i++) {
				lVideoss[i].setCategoria(null);
			}
			return delete(categorias2);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(database.Categorias2 categorias2, org.orm.PersistentSession session)throws PersistentException {
		try {
			database.Videos[] lVideoss = categorias2.videos.toArray();
			for(int i = 0; i < lVideoss.length; i++) {
				lVideoss[i].setCategoria(null);
			}
			try {
				session.delete(categorias2);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(database.Categorias2 categorias2) throws PersistentException {
		try {
			ProyectoMDSPersistentManager.instance().getSession().refresh(categorias2);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(database.Categorias2 categorias2) throws PersistentException {
		try {
			ProyectoMDSPersistentManager.instance().getSession().evict(categorias2);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Categorias2 loadCategorias2ByCriteria(Categorias2Criteria categorias2Criteria) {
		Categorias2[] categorias2s = listCategorias2ByCriteria(categorias2Criteria);
		if(categorias2s == null || categorias2s.length == 0) {
			return null;
		}
		return categorias2s[0];
	}
	
	public static Categorias2[] listCategorias2ByCriteria(Categorias2Criteria categorias2Criteria) {
		return categorias2Criteria.listCategorias2();
	}
}
