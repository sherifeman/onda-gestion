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

public class FactureDAOImpl implements onda.dao.FactureDAO {
	public Facture loadFactureByORMID(int id_Fac) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return loadFactureByORMID(session, id_Fac);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Facture getFactureByORMID(int id_Fac) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return getFactureByORMID(session, id_Fac);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Facture loadFactureByORMID(int id_Fac, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return loadFactureByORMID(session, id_Fac, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Facture getFactureByORMID(int id_Fac, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return getFactureByORMID(session, id_Fac, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Facture loadFactureByORMID(PersistentSession session, int id_Fac) throws PersistentException {
		try {
			return (Facture) session.load(onda.Facture.class, new Integer(id_Fac));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Facture getFactureByORMID(PersistentSession session, int id_Fac) throws PersistentException {
		try {
			return (Facture) session.get(onda.Facture.class, new Integer(id_Fac));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Facture loadFactureByORMID(PersistentSession session, int id_Fac, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Facture) session.load(onda.Facture.class, new Integer(id_Fac), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Facture getFactureByORMID(PersistentSession session, int id_Fac, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Facture) session.get(onda.Facture.class, new Integer(id_Fac), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Facture[] listFactureByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return listFactureByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Facture[] listFactureByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return listFactureByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Facture[] listFactureByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From onda.Facture as Facture");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Facture[]) list.toArray(new Facture[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Facture[] listFactureByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From onda.Facture as Facture");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Facture[]) list.toArray(new Facture[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Facture loadFactureByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return loadFactureByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Facture loadFactureByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return loadFactureByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Facture loadFactureByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Facture[] factures = listFactureByQuery(session, condition, orderBy);
		if (factures != null && factures.length > 0)
			return factures[0];
		else
			return null;
	}
	
	public Facture loadFactureByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Facture[] factures = listFactureByQuery(session, condition, orderBy, lockMode);
		if (factures != null && factures.length > 0)
			return factures[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateFactureByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return iterateFactureByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFactureByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return iterateFactureByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFactureByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From onda.Facture as Facture");
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
	
	public static java.util.Iterator iterateFactureByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From onda.Facture as Facture");
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
	
	public Facture createFacture() {
		return new onda.Facture();
	}
	
	public boolean save(onda.Facture facture) throws PersistentException {
		try {
			onda.ONDAPersistentManager.instance().saveObject(facture);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(onda.Facture facture) throws PersistentException {
		try {
			onda.ONDAPersistentManager.instance().deleteObject(facture);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(onda.Facture facture)throws PersistentException {
		try {
			if(facture.getOp() != null) {
				facture.getOp().factures.remove(facture);
			}
			
			if(facture.getFournisseur() != null) {
				facture.getFournisseur().factures.remove(facture);
			}
			
			onda.Motif[] lMotifss = facture.motifs.toArray();
			for(int i = 0; i < lMotifss.length; i++) {
				lMotifss[i].setFacture(null);
			}
			onda.Journal[] lJournalss = facture.journals.toArray();
			for(int i = 0; i < lJournalss.length; i++) {
				lJournalss[i].setFacture(null);
			}
			onda.HistoriqueActions[] lHistoriquess = facture.historiques.toArray();
			for(int i = 0; i < lHistoriquess.length; i++) {
				lHistoriquess[i].setFacture(null);
			}
			return delete(facture);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean deleteAndDissociate(onda.Facture facture, org.orm.PersistentSession session)throws PersistentException {
		try {
			if(facture.getOp() != null) {
				facture.getOp().factures.remove(facture);
			}
			
			if(facture.getFournisseur() != null) {
				facture.getFournisseur().factures.remove(facture);
			}
			
			onda.Motif[] lMotifss = facture.motifs.toArray();
			for(int i = 0; i < lMotifss.length; i++) {
				lMotifss[i].setFacture(null);
			}
			onda.Journal[] lJournalss = facture.journals.toArray();
			for(int i = 0; i < lJournalss.length; i++) {
				lJournalss[i].setFacture(null);
			}
			onda.HistoriqueActions[] lHistoriquess = facture.historiques.toArray();
			for(int i = 0; i < lHistoriquess.length; i++) {
				lHistoriquess[i].setFacture(null);
			}
			try {
				session.delete(facture);
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
	
	public boolean refresh(onda.Facture facture) throws PersistentException {
		try {
			onda.ONDAPersistentManager.instance().getSession().refresh(facture);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(onda.Facture facture) throws PersistentException {
		try {
			onda.ONDAPersistentManager.instance().getSession().evict(facture);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
