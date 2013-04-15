package onda.metier.impl;

import org.orm.*;
import org.hibernate.LockMode;
import onda.*;
import onda.dao.FactureDAO;
import onda.dao.impl.FactureDAOImpl;

public class FactureMetierImpl implements onda.metier.FactureMetier {
	
	FactureDAO dao = new FactureDAOImpl();

	public Facture loadFactureByORMID(int attribute) throws PersistentException {
		
		return dao.loadFactureByORMID(attribute);
	}

	public Facture getFactureByORMID(int attribute) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Facture loadFactureByORMID(int attribute, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Facture getFactureByORMID(int attribute, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Facture loadFactureByORMID(PersistentSession session, int attribute)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Facture getFactureByORMID(PersistentSession session, int attribute)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Facture loadFactureByORMID(PersistentSession session, int attribute,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Facture getFactureByORMID(PersistentSession session, int attribute,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Facture[] listFactureByQuery(String condition, String orderBy)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Facture[] listFactureByQuery(String condition, String orderBy,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Facture[] listFactureByQuery(PersistentSession session,
			String condition, String orderBy) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Facture[] listFactureByQuery(PersistentSession session,
			String condition, String orderBy, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Facture loadFactureByQuery(String condition, String orderBy)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Facture loadFactureByQuery(String condition, String orderBy,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Facture loadFactureByQuery(PersistentSession session,
			String condition, String orderBy) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Facture loadFactureByQuery(PersistentSession session,
			String condition, String orderBy, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Facture createFacture() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean save(Facture facture) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(Facture facture) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteAndDissociate(Facture facture)
			throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteAndDissociate(Facture facture, PersistentSession session)
			throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean refresh(Facture facture) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean evict(Facture facture) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
