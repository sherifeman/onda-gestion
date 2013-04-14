/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package onda.dao.impl;

import org.orm.*;
import org.hibernate.Query;
import java.util.List;
import onda.*;

public class OrdrePaimentDAOImpl implements onda.dao.OrdrePaimentDAO {
	public OrdrePaiment loadOrdrePaimentByORMID(int id_Op) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return loadOrdrePaimentByORMID(session, id_Op);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrdrePaiment getOrdrePaimentByORMID(int id_Op) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return getOrdrePaimentByORMID(session, id_Op);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrdrePaiment loadOrdrePaimentByORMID(int id_Op, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return loadOrdrePaimentByORMID(session, id_Op, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrdrePaiment getOrdrePaimentByORMID(int id_Op, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return getOrdrePaimentByORMID(session, id_Op, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrdrePaiment loadOrdrePaimentByORMID(PersistentSession session, int id_Op) throws PersistentException {
		try {
			return (OrdrePaiment) session.load(onda.OrdrePaiment.class, new Integer(id_Op));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrdrePaiment getOrdrePaimentByORMID(PersistentSession session, int id_Op) throws PersistentException {
		try {
			return (OrdrePaiment) session.get(onda.OrdrePaiment.class, new Integer(id_Op));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrdrePaiment loadOrdrePaimentByORMID(PersistentSession session, int id_Op, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (OrdrePaiment) session.load(onda.OrdrePaiment.class, new Integer(id_Op), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrdrePaiment getOrdrePaimentByORMID(PersistentSession session, int id_Op, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (OrdrePaiment) session.get(onda.OrdrePaiment.class, new Integer(id_Op), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrdrePaiment[] listOrdrePaimentByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return listOrdrePaimentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrdrePaiment[] listOrdrePaimentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return listOrdrePaimentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrdrePaiment[] listOrdrePaimentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From onda.OrdrePaiment as OrdrePaiment");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (OrdrePaiment[]) list.toArray(new OrdrePaiment[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrdrePaiment[] listOrdrePaimentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From onda.OrdrePaiment as OrdrePaiment");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (OrdrePaiment[]) list.toArray(new OrdrePaiment[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrdrePaiment loadOrdrePaimentByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return loadOrdrePaimentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrdrePaiment loadOrdrePaimentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return loadOrdrePaimentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrdrePaiment loadOrdrePaimentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		OrdrePaiment[] ordrePaiments = listOrdrePaimentByQuery(session, condition, orderBy);
		if (ordrePaiments != null && ordrePaiments.length > 0)
			return ordrePaiments[0];
		else
			return null;
	}
	
	public OrdrePaiment loadOrdrePaimentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		OrdrePaiment[] ordrePaiments = listOrdrePaimentByQuery(session, condition, orderBy, lockMode);
		if (ordrePaiments != null && ordrePaiments.length > 0)
			return ordrePaiments[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateOrdrePaimentByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return iterateOrdrePaimentByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateOrdrePaimentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return iterateOrdrePaimentByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateOrdrePaimentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From onda.OrdrePaiment as OrdrePaiment");
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
	
	public static java.util.Iterator iterateOrdrePaimentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From onda.OrdrePaiment as OrdrePaiment");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public OrdrePaiment createOrdrePaiment() {
		return new onda.OrdrePaiment();
	}
	
	public boolean save(onda.OrdrePaiment ordrePaiment) throws PersistentException {
		try {
			onda.ONDAPersistentManager.instance().saveObject(ordrePaiment);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(onda.OrdrePaiment ordrePaiment) throws PersistentException {
		try {
			onda.ONDAPersistentManager.instance().deleteObject(ordrePaiment);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(onda.OrdrePaiment ordrePaiment)throws PersistentException {
		try {
			if(ordrePaiment.getRejet() != null) {
				ordrePaiment.getRejet().setOp(null);
			}
			
			onda.Facture[] lFacturess = ordrePaiment.factures.toArray();
			for(int i = 0; i < lFacturess.length; i++) {
				lFacturess[i].setOp(null);
			}
			return delete(ordrePaiment);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(onda.OrdrePaiment ordrePaiment, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(ordrePaiment.getRejet() != null) {
				ordrePaiment.getRejet().setOp(null);
			}
			
			onda.Facture[] lFacturess = ordrePaiment.factures.toArray();
			for(int i = 0; i < lFacturess.length; i++) {
				lFacturess[i].setOp(null);
			}
			try {
				session.delete(ordrePaiment);
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
	
	public boolean refresh(onda.OrdrePaiment ordrePaiment) throws PersistentException {
		try {
			onda.ONDAPersistentManager.instance().getSession().refresh(ordrePaiment);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(onda.OrdrePaiment ordrePaiment) throws PersistentException {
		try {
			onda.ONDAPersistentManager.instance().getSession().evict(ordrePaiment);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
