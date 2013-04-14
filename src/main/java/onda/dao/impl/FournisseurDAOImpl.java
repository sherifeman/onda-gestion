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

public class FournisseurDAOImpl implements onda.dao.FournisseurDAO {
	public Fournisseur loadFournisseurByORMID(int id_Frs) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return loadFournisseurByORMID(session, id_Frs);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Fournisseur getFournisseurByORMID(int id_Frs) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return getFournisseurByORMID(session, id_Frs);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Fournisseur loadFournisseurByORMID(int id_Frs, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return loadFournisseurByORMID(session, id_Frs, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Fournisseur getFournisseurByORMID(int id_Frs, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return getFournisseurByORMID(session, id_Frs, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Fournisseur loadFournisseurByORMID(PersistentSession session, int id_Frs) throws PersistentException {
		try {
			return (Fournisseur) session.load(onda.Fournisseur.class, new Integer(id_Frs));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Fournisseur getFournisseurByORMID(PersistentSession session, int id_Frs) throws PersistentException {
		try {
			return (Fournisseur) session.get(onda.Fournisseur.class, new Integer(id_Frs));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Fournisseur loadFournisseurByORMID(PersistentSession session, int id_Frs, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Fournisseur) session.load(onda.Fournisseur.class, new Integer(id_Frs), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Fournisseur getFournisseurByORMID(PersistentSession session, int id_Frs, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Fournisseur) session.get(onda.Fournisseur.class, new Integer(id_Frs), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Fournisseur[] listFournisseurByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return listFournisseurByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Fournisseur[] listFournisseurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return listFournisseurByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Fournisseur[] listFournisseurByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From onda.Fournisseur as Fournisseur");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Fournisseur[]) list.toArray(new Fournisseur[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Fournisseur[] listFournisseurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From onda.Fournisseur as Fournisseur");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Fournisseur[]) list.toArray(new Fournisseur[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Fournisseur loadFournisseurByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return loadFournisseurByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Fournisseur loadFournisseurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return loadFournisseurByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Fournisseur loadFournisseurByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Fournisseur[] fournisseurs = listFournisseurByQuery(session, condition, orderBy);
		if (fournisseurs != null && fournisseurs.length > 0)
			return fournisseurs[0];
		else
			return null;
	}
	
	public Fournisseur loadFournisseurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Fournisseur[] fournisseurs = listFournisseurByQuery(session, condition, orderBy, lockMode);
		if (fournisseurs != null && fournisseurs.length > 0)
			return fournisseurs[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateFournisseurByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return iterateFournisseurByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFournisseurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return iterateFournisseurByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFournisseurByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From onda.Fournisseur as Fournisseur");
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
	
	public static java.util.Iterator iterateFournisseurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From onda.Fournisseur as Fournisseur");
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
	
	public Fournisseur createFournisseur() {
		return new onda.Fournisseur();
	}
	
	public boolean save(onda.Fournisseur fournisseur) throws PersistentException {
		try {
			onda.ONDAPersistentManager.instance().saveObject(fournisseur);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(onda.Fournisseur fournisseur) throws PersistentException {
		try {
			onda.ONDAPersistentManager.instance().deleteObject(fournisseur);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(onda.Fournisseur fournisseur)throws PersistentException {
		try {
			onda.Facture[] lFacturess = fournisseur.factures.toArray();
			for(int i = 0; i < lFacturess.length; i++) {
				lFacturess[i].setFournisseur(null);
			}
			return delete(fournisseur);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(onda.Fournisseur fournisseur, org.orm.PersistentSession session)throws PersistentException {
		try {
			onda.Facture[] lFacturess = fournisseur.factures.toArray();
			for(int i = 0; i < lFacturess.length; i++) {
				lFacturess[i].setFournisseur(null);
			}
			try {
				session.delete(fournisseur);
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
	
	public boolean refresh(onda.Fournisseur fournisseur) throws PersistentException {
		try {
			onda.ONDAPersistentManager.instance().getSession().refresh(fournisseur);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(onda.Fournisseur fournisseur) throws PersistentException {
		try {
			onda.ONDAPersistentManager.instance().getSession().evict(fournisseur);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
