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

public class RejetDAOImpl implements onda.dao.RejetDAO {
	public Rejet loadRejetByORMID(int id_Rejet) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return loadRejetByORMID(session, id_Rejet);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Rejet getRejetByORMID(int id_Rejet) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return getRejetByORMID(session, id_Rejet);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Rejet loadRejetByORMID(int id_Rejet, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return loadRejetByORMID(session, id_Rejet, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Rejet getRejetByORMID(int id_Rejet, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return getRejetByORMID(session, id_Rejet, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Rejet loadRejetByORMID(PersistentSession session, int id_Rejet) throws PersistentException {
		try {
			return (Rejet) session.load(onda.Rejet.class, new Integer(id_Rejet));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Rejet getRejetByORMID(PersistentSession session, int id_Rejet) throws PersistentException {
		try {
			return (Rejet) session.get(onda.Rejet.class, new Integer(id_Rejet));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Rejet loadRejetByORMID(PersistentSession session, int id_Rejet, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Rejet) session.load(onda.Rejet.class, new Integer(id_Rejet), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Rejet getRejetByORMID(PersistentSession session, int id_Rejet, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Rejet) session.get(onda.Rejet.class, new Integer(id_Rejet), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Rejet[] listRejetByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return listRejetByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Rejet[] listRejetByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return listRejetByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Rejet[] listRejetByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From onda.Rejet as Rejet");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Rejet[]) list.toArray(new Rejet[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Rejet[] listRejetByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From onda.Rejet as Rejet");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Rejet[]) list.toArray(new Rejet[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Rejet loadRejetByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return loadRejetByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Rejet loadRejetByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return loadRejetByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Rejet loadRejetByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Rejet[] rejets = listRejetByQuery(session, condition, orderBy);
		if (rejets != null && rejets.length > 0)
			return rejets[0];
		else
			return null;
	}
	
	public Rejet loadRejetByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Rejet[] rejets = listRejetByQuery(session, condition, orderBy, lockMode);
		if (rejets != null && rejets.length > 0)
			return rejets[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateRejetByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return iterateRejetByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateRejetByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return iterateRejetByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateRejetByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From onda.Rejet as Rejet");
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
	
	public static java.util.Iterator iterateRejetByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From onda.Rejet as Rejet");
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
	
	public Rejet createRejet() {
		return new onda.Rejet();
	}
	
	public boolean save(onda.Rejet rejet) throws PersistentException {
		try {
			onda.ONDAPersistentManager.instance().saveObject(rejet);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(onda.Rejet rejet) throws PersistentException {
		try {
			onda.ONDAPersistentManager.instance().deleteObject(rejet);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(onda.Rejet rejet)throws PersistentException {
		try {
			if(rejet.getOp() != null) {
				rejet.getOp().setRejet(null);
			}
			
			onda.Motif[] lMotifss = rejet.motifs.toArray();
			for(int i = 0; i < lMotifss.length; i++) {
				lMotifss[i].setRejet(null);
			}
			return delete(rejet);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(onda.Rejet rejet, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(rejet.getOp() != null) {
				rejet.getOp().setRejet(null);
			}
			
			onda.Motif[] lMotifss = rejet.motifs.toArray();
			for(int i = 0; i < lMotifss.length; i++) {
				lMotifss[i].setRejet(null);
			}
			try {
				session.delete(rejet);
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
	
	public boolean refresh(onda.Rejet rejet) throws PersistentException {
		try {
			onda.ONDAPersistentManager.instance().getSession().refresh(rejet);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(onda.Rejet rejet) throws PersistentException {
		try {
			onda.ONDAPersistentManager.instance().getSession().evict(rejet);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
