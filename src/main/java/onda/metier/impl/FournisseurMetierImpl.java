package onda.metier.impl;

import onda.Fournisseur;
import onda.dao.FournisseurDAO;
import onda.dao.impl.FournisseurDAOImpl;

import org.hibernate.LockMode;
import org.orm.PersistentException;
import org.orm.PersistentSession;

public class FournisseurMetierImpl implements onda.metier.FournisseurMetier {
	
	FournisseurDAO dao = new FournisseurDAOImpl();

	public Fournisseur loadFournisseurByORMID(int attribute) throws PersistentException {
		
		return dao.loadFournisseurByORMID(attribute);
	}

	public Fournisseur getFournisseurByORMID(int attribute) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Fournisseur loadFournisseurByORMID(int attribute, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Fournisseur getFournisseurByORMID(int attribute, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Fournisseur loadFournisseurByORMID(PersistentSession session, int attribute)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Fournisseur getFournisseurByORMID(PersistentSession session, int attribute)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Fournisseur loadFournisseurByORMID(PersistentSession session, int attribute,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Fournisseur getFournisseurByORMID(PersistentSession session, int attribute,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Fournisseur[] listFournisseurByQuery(String condition, String orderBy)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Fournisseur[] listFournisseurByQuery(String condition, String orderBy,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Fournisseur[] listFournisseurByQuery(PersistentSession session,
			String condition, String orderBy) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Fournisseur[] listFournisseurByQuery(PersistentSession session,
			String condition, String orderBy, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Fournisseur loadFournisseurByQuery(String condition, String orderBy)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Fournisseur loadFournisseurByQuery(String condition, String orderBy,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Fournisseur loadFournisseurByQuery(PersistentSession session,
			String condition, String orderBy) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Fournisseur loadFournisseurByQuery(PersistentSession session,
			String condition, String orderBy, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Fournisseur createFournisseur() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean save(Fournisseur fournisseur) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(Fournisseur fournisseur) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteAndDissociate(Fournisseur fournisseur)
			throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteAndDissociate(Fournisseur fournisseur, PersistentSession session)
			throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean refresh(Fournisseur fournisseur) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean evict(Fournisseur fournisseur) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
