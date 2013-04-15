package onda.metier.impl;

import onda.Rejet;
import onda.dao.RejetDAO;
import onda.dao.impl.RejetDAOImpl;

import org.hibernate.LockMode;
import org.orm.PersistentException;
import org.orm.PersistentSession;

public class RejetMetierImpl implements onda.metier.RejetMetier {
	
	RejetDAO dao = new RejetDAOImpl();

	public Rejet loadRejetByORMID(int attribute) throws PersistentException {
		
		return dao.loadRejetByORMID(attribute);
	}

	public Rejet getRejetByORMID(int attribute) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Rejet loadRejetByORMID(int attribute, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Rejet getRejetByORMID(int attribute, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Rejet loadRejetByORMID(PersistentSession session, int attribute)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Rejet getRejetByORMID(PersistentSession session, int attribute)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Rejet loadRejetByORMID(PersistentSession session, int attribute,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Rejet getRejetByORMID(PersistentSession session, int attribute,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Rejet[] listRejetByQuery(String condition, String orderBy)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Rejet[] listRejetByQuery(String condition, String orderBy,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Rejet[] listRejetByQuery(PersistentSession session,
			String condition, String orderBy) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Rejet[] listRejetByQuery(PersistentSession session,
			String condition, String orderBy, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Rejet Rejet(String condition, String orderBy)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Rejet loadRejetByQuery(String condition, String orderBy,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Rejet loadRejetByQuery(PersistentSession session,
			String condition, String orderBy) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Rejet loadRejetByQuery(PersistentSession session,
			String condition, String orderBy, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Rejet createRejet() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean save(Rejet rejet) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(Rejet rejet) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteAndDissociate(Rejet rejet)
			throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteAndDissociate(Rejet rejet, PersistentSession session)
			throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean refresh(Rejet rejet) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean evict(Rejet rejet) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public onda.Rejet loadRejetByQuery(String condition, String orderBy)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
