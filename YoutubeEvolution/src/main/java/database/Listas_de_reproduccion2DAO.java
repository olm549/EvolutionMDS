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

public class Listas_de_reproduccion2DAO {
	public static Listas_de_reproduccion2 loadListas_de_reproduccion2ByORMID(int id_lista) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return loadListas_de_reproduccion2ByORMID(session, id_lista);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Listas_de_reproduccion2 getListas_de_reproduccion2ByORMID(int id_lista) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return getListas_de_reproduccion2ByORMID(session, id_lista);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Listas_de_reproduccion2 loadListas_de_reproduccion2ByORMID(int id_lista, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return loadListas_de_reproduccion2ByORMID(session, id_lista, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Listas_de_reproduccion2 getListas_de_reproduccion2ByORMID(int id_lista, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return getListas_de_reproduccion2ByORMID(session, id_lista, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Listas_de_reproduccion2 loadListas_de_reproduccion2ByORMID(PersistentSession session, int id_lista) throws PersistentException {
		try {
			return (Listas_de_reproduccion2) session.load(database.Listas_de_reproduccion2.class, new Integer(id_lista));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Listas_de_reproduccion2 getListas_de_reproduccion2ByORMID(PersistentSession session, int id_lista) throws PersistentException {
		try {
			return (Listas_de_reproduccion2) session.get(database.Listas_de_reproduccion2.class, new Integer(id_lista));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Listas_de_reproduccion2 loadListas_de_reproduccion2ByORMID(PersistentSession session, int id_lista, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Listas_de_reproduccion2) session.load(database.Listas_de_reproduccion2.class, new Integer(id_lista), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Listas_de_reproduccion2 getListas_de_reproduccion2ByORMID(PersistentSession session, int id_lista, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Listas_de_reproduccion2) session.get(database.Listas_de_reproduccion2.class, new Integer(id_lista), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryListas_de_reproduccion2(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return queryListas_de_reproduccion2(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryListas_de_reproduccion2(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return queryListas_de_reproduccion2(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Listas_de_reproduccion2[] listListas_de_reproduccion2ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return listListas_de_reproduccion2ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Listas_de_reproduccion2[] listListas_de_reproduccion2ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return listListas_de_reproduccion2ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryListas_de_reproduccion2(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From database.Listas_de_reproduccion2 as Listas_de_reproduccion2");
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
	
	public static List queryListas_de_reproduccion2(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From database.Listas_de_reproduccion2 as Listas_de_reproduccion2");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Listas_de_reproduccion2", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Listas_de_reproduccion2[] listListas_de_reproduccion2ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryListas_de_reproduccion2(session, condition, orderBy);
			return (Listas_de_reproduccion2[]) list.toArray(new Listas_de_reproduccion2[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Listas_de_reproduccion2[] listListas_de_reproduccion2ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryListas_de_reproduccion2(session, condition, orderBy, lockMode);
			return (Listas_de_reproduccion2[]) list.toArray(new Listas_de_reproduccion2[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Listas_de_reproduccion2 loadListas_de_reproduccion2ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return loadListas_de_reproduccion2ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Listas_de_reproduccion2 loadListas_de_reproduccion2ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return loadListas_de_reproduccion2ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Listas_de_reproduccion2 loadListas_de_reproduccion2ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Listas_de_reproduccion2[] listas_de_reproduccion2s = listListas_de_reproduccion2ByQuery(session, condition, orderBy);
		if (listas_de_reproduccion2s != null && listas_de_reproduccion2s.length > 0)
			return listas_de_reproduccion2s[0];
		else
			return null;
	}
	
	public static Listas_de_reproduccion2 loadListas_de_reproduccion2ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Listas_de_reproduccion2[] listas_de_reproduccion2s = listListas_de_reproduccion2ByQuery(session, condition, orderBy, lockMode);
		if (listas_de_reproduccion2s != null && listas_de_reproduccion2s.length > 0)
			return listas_de_reproduccion2s[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateListas_de_reproduccion2ByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return iterateListas_de_reproduccion2ByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateListas_de_reproduccion2ByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = ProyectoMDSPersistentManager.instance().getSession();
			return iterateListas_de_reproduccion2ByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateListas_de_reproduccion2ByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From database.Listas_de_reproduccion2 as Listas_de_reproduccion2");
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
	
	public static java.util.Iterator iterateListas_de_reproduccion2ByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From database.Listas_de_reproduccion2 as Listas_de_reproduccion2");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Listas_de_reproduccion2", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Listas_de_reproduccion2 createListas_de_reproduccion2() {
		return new database.Listas_de_reproduccion2();
	}
	
	public static boolean save(database.Listas_de_reproduccion2 listas_de_reproduccion2) throws PersistentException {
		try {
			ProyectoMDSPersistentManager.instance().saveObject(listas_de_reproduccion2);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(database.Listas_de_reproduccion2 listas_de_reproduccion2) throws PersistentException {
		try {
			ProyectoMDSPersistentManager.instance().deleteObject(listas_de_reproduccion2);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(database.Listas_de_reproduccion2 listas_de_reproduccion2)throws PersistentException {
		try {
			if (listas_de_reproduccion2.getUsuario_que_consulta_historial() != null) {
				listas_de_reproduccion2.getUsuario_que_consulta_historial().setHistorial_usuario(null);
			}
			
			if (listas_de_reproduccion2.getUsuario_registrado() != null) {
				listas_de_reproduccion2.getUsuario_registrado().listas_de_reproduccion.remove(listas_de_reproduccion2);
			}
			
			database.Videos[] lVideos_en_listas = listas_de_reproduccion2.videos_en_lista.toArray();
			for(int i = 0; i < lVideos_en_listas.length; i++) {
				lVideos_en_listas[i].listas_de_videos.remove(listas_de_reproduccion2);
			}
			return delete(listas_de_reproduccion2);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(database.Listas_de_reproduccion2 listas_de_reproduccion2, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (listas_de_reproduccion2.getUsuario_que_consulta_historial() != null) {
				listas_de_reproduccion2.getUsuario_que_consulta_historial().setHistorial_usuario(null);
			}
			
			if (listas_de_reproduccion2.getUsuario_registrado() != null) {
				listas_de_reproduccion2.getUsuario_registrado().listas_de_reproduccion.remove(listas_de_reproduccion2);
			}
			
			database.Videos[] lVideos_en_listas = listas_de_reproduccion2.videos_en_lista.toArray();
			for(int i = 0; i < lVideos_en_listas.length; i++) {
				lVideos_en_listas[i].listas_de_videos.remove(listas_de_reproduccion2);
			}
			try {
				session.delete(listas_de_reproduccion2);
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
	
	public static boolean refresh(database.Listas_de_reproduccion2 listas_de_reproduccion2) throws PersistentException {
		try {
			ProyectoMDSPersistentManager.instance().getSession().refresh(listas_de_reproduccion2);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(database.Listas_de_reproduccion2 listas_de_reproduccion2) throws PersistentException {
		try {
			ProyectoMDSPersistentManager.instance().getSession().evict(listas_de_reproduccion2);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Listas_de_reproduccion2 loadListas_de_reproduccion2ByCriteria(Listas_de_reproduccion2Criteria listas_de_reproduccion2Criteria) {
		Listas_de_reproduccion2[] listas_de_reproduccion2s = listListas_de_reproduccion2ByCriteria(listas_de_reproduccion2Criteria);
		if(listas_de_reproduccion2s == null || listas_de_reproduccion2s.length == 0) {
			return null;
		}
		return listas_de_reproduccion2s[0];
	}
	
	public static Listas_de_reproduccion2[] listListas_de_reproduccion2ByCriteria(Listas_de_reproduccion2Criteria listas_de_reproduccion2Criteria) {
		return listas_de_reproduccion2Criteria.listListas_de_reproduccion2();
	}
}
