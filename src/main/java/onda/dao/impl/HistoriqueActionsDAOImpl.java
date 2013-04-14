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

public class HistoriqueActionsDAOImpl implements onda.dao.HistoriqueActionsDAO {
	public HistoriqueActions loadHistoriqueActionsByORMID(int id_Historique) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return loadHistoriqueActionsByORMID(session, id_Historique);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public HistoriqueActions getHistoriqueActionsByORMID(int id_Historique) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return getHistoriqueActionsByORMID(session, id_Historique);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public HistoriqueActions loadHistoriqueActionsByORMID(int id_Historique, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return loadHistoriqueActionsByORMID(session, id_Historique, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public HistoriqueActions getHistoriqueActionsByORMID(int id_Historique, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return getHistoriqueActionsByORMID(session, id_Historique, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public HistoriqueActions loadHistoriqueActionsByORMID(PersistentSession session, int id_Historique) throws PersistentException {
		try {
			return (HistoriqueActions) session.load(onda.HistoriqueActions.class, new Integer(id_Historique));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public HistoriqueActions getHistoriqueActionsByORMID(PersistentSession session, int id_Historique) throws PersistentException {
		try {
			return (HistoriqueActions) session.get(onda.HistoriqueActions.class, new Integer(id_Historique));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public HistoriqueActions loadHistoriqueActionsByORMID(PersistentSession session, int id_Historique, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (HistoriqueActions) session.load(onda.HistoriqueActions.class, new Integer(id_Historique), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public HistoriqueActions getHistoriqueActionsByORMID(PersistentSession session, int id_Historique, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (HistoriqueActions) session.get(onda.HistoriqueActions.class, new Integer(id_Historique), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public HistoriqueActions[] listHistoriqueActionsByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return listHistoriqueActionsByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public HistoriqueActions[] listHistoriqueActionsByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return listHistoriqueActionsByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public HistoriqueActions[] listHistoriqueActionsByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From onda.HistoriqueActions as HistoriqueActions");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (HistoriqueActions[]) list.toArray(new HistoriqueActions[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public HistoriqueActions[] listHistoriqueActionsByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From onda.HistoriqueActions as HistoriqueActions");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (HistoriqueActions[]) list.toArray(new HistoriqueActions[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public HistoriqueActions loadHistoriqueActionsByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return loadHistoriqueActionsByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public HistoriqueActions loadHistoriqueActionsByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return loadHistoriqueActionsByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public HistoriqueActions loadHistoriqueActionsByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		HistoriqueActions[] historiqueActionses = listHistoriqueActionsByQuery(session, condition, orderBy);
		if (historiqueActionses != null && historiqueActionses.length > 0)
			return historiqueActionses[0];
		else
			return null;
	}
	
	public HistoriqueActions loadHistoriqueActionsByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		HistoriqueActions[] historiqueActionses = listHistoriqueActionsByQuery(session, condition, orderBy, lockMode);
		if (historiqueActionses != null && historiqueActionses.length > 0)
			return historiqueActionses[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateHistoriqueActionsByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return iterateHistoriqueActionsByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHistoriqueActionsByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return iterateHistoriqueActionsByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateHistoriqueActionsByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From onda.HistoriqueActions as HistoriqueActions");
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
	
	public static java.util.Iterator iterateHistoriqueActionsByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From onda.HistoriqueActions as HistoriqueActions");
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
	
	public HistoriqueActions createHistoriqueActions() {
		return new onda.HistoriqueActions();
	}
	
	public boolean save(onda.HistoriqueActions historiqueActions) throws PersistentException {
		try {
			onda.ONDAPersistentManager.instance().saveObject(historiqueActions);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(onda.HistoriqueActions historiqueActions) throws PersistentException {
		try {
			onda.ONDAPersistentManager.instance().deleteObject(historiqueActions);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(onda.HistoriqueActions historiqueActions)throws PersistentException {
		try {
			if(historiqueActions.getFacture() != null) {
				historiqueActions.getFacture().historiques.remove(historiqueActions);
			}
			
			return delete(historiqueActions);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(onda.HistoriqueActions historiqueActions, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(historiqueActions.getFacture() != null) {
				historiqueActions.getFacture().historiques.remove(historiqueActions);
			}
			
			try {
				session.delete(historiqueActions);
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
	
	public boolean refresh(onda.HistoriqueActions historiqueActions) throws PersistentException {
		try {
			onda.ONDAPersistentManager.instance().getSession().refresh(historiqueActions);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(onda.HistoriqueActions historiqueActions) throws PersistentException {
		try {
			onda.ONDAPersistentManager.instance().getSession().evict(historiqueActions);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
