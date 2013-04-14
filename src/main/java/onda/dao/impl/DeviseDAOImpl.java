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

public class DeviseDAOImpl implements onda.dao.DeviseDAO {
	public Devise loadDeviseByORMID(int id_Devise) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return loadDeviseByORMID(session, id_Devise);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Devise getDeviseByORMID(int id_Devise) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return getDeviseByORMID(session, id_Devise);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Devise loadDeviseByORMID(int id_Devise, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return loadDeviseByORMID(session, id_Devise, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Devise getDeviseByORMID(int id_Devise, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return getDeviseByORMID(session, id_Devise, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Devise loadDeviseByORMID(PersistentSession session, int id_Devise) throws PersistentException {
		try {
			return (Devise) session.load(onda.Devise.class, new Integer(id_Devise));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Devise getDeviseByORMID(PersistentSession session, int id_Devise) throws PersistentException {
		try {
			return (Devise) session.get(onda.Devise.class, new Integer(id_Devise));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Devise loadDeviseByORMID(PersistentSession session, int id_Devise, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Devise) session.load(onda.Devise.class, new Integer(id_Devise), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Devise getDeviseByORMID(PersistentSession session, int id_Devise, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Devise) session.get(onda.Devise.class, new Integer(id_Devise), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Devise[] listDeviseByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return listDeviseByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Devise[] listDeviseByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return listDeviseByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Devise[] listDeviseByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From onda.Devise as Devise");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Devise[]) list.toArray(new Devise[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Devise[] listDeviseByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From onda.Devise as Devise");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Devise[]) list.toArray(new Devise[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Devise loadDeviseByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return loadDeviseByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Devise loadDeviseByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return loadDeviseByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Devise loadDeviseByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Devise[] devises = listDeviseByQuery(session, condition, orderBy);
		if (devises != null && devises.length > 0)
			return devises[0];
		else
			return null;
	}
	
	public Devise loadDeviseByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Devise[] devises = listDeviseByQuery(session, condition, orderBy, lockMode);
		if (devises != null && devises.length > 0)
			return devises[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateDeviseByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return iterateDeviseByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDeviseByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return iterateDeviseByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDeviseByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From onda.Devise as Devise");
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
	
	public static java.util.Iterator iterateDeviseByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From onda.Devise as Devise");
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
	
	public Devise createDevise() {
		return new onda.Devise();
	}
	
	public boolean save(onda.Devise devise) throws PersistentException {
		try {
			onda.ONDAPersistentManager.instance().saveObject(devise);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(onda.Devise devise) throws PersistentException {
		try {
			onda.ONDAPersistentManager.instance().deleteObject(devise);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh(onda.Devise devise) throws PersistentException {
		try {
			onda.ONDAPersistentManager.instance().getSession().refresh(devise);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(onda.Devise devise) throws PersistentException {
		try {
			onda.ONDAPersistentManager.instance().getSession().evict(devise);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
