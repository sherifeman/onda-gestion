package onda.metier.impl;

import onda.Devise;
import onda.dao.DeviseDAO;
import onda.dao.impl.DeviseDAOImpl;

import org.hibernate.LockMode;
import org.orm.PersistentException;
import org.orm.PersistentSession;

public class DeviseMetierImpl implements onda.metier.DeviseMetier {
	
	DeviseDAO dao = new DeviseDAOImpl();

	public Devise loadDeviseByORMID(int attribute) throws PersistentException {
		
		return dao.loadDeviseByORMID(attribute);
	}

	public Devise getDeviseByORMID(int attribute) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Devise loadDeviseByORMID(int attribute, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Devise getDeviseByORMID(int attribute, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Devise loadDeviseByORMID(PersistentSession session, int attribute)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Devise getDeviseByORMID(PersistentSession session, int attribute)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Devise loadDeviseByORMID(PersistentSession session, int attribute,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Devise getDeviseByORMID(PersistentSession session, int attribute,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Devise[] listDeviseByQuery(String condition, String orderBy)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Devise[] listDeviseByQuery(String condition, String orderBy,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Devise[] listDeviseByQuery(PersistentSession session,
			String condition, String orderBy) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Devise[] listDeviseByQuery(PersistentSession session,
			String condition, String orderBy, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Devise loadDeviseByQuery(String condition, String orderBy)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Devise loadDeviseByQuery(String condition, String orderBy,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Devise loadDeviseByQuery(PersistentSession session,
			String condition, String orderBy) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Devise loadDeviseByQuery(PersistentSession session,
			String condition, String orderBy, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Devise createDevise() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean save(Devise devise) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(Devise devise) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteAndDissociate(Devise devise)
			throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteAndDissociate(Devise devise, PersistentSession session)
			throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean refresh(Devise devise) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean evict(Devise devise) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
