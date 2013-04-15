package onda.metier.impl;

import onda.OrdrePaiment;
import onda.dao.OrdrePaimentDAO;
import onda.dao.impl.OrdrePaimentDAOImpl;
import onda.metier.OrdrePaimentMetier;

import org.hibernate.LockMode;
import org.orm.PersistentException;
import org.orm.PersistentSession;

public class OrdrePaiementMetierImpl implements OrdrePaimentMetier {
	
	OrdrePaimentDAO dao = new OrdrePaimentDAOImpl();

	public OrdrePaiment loadOrdrePaimentByORMID(int attribute) throws PersistentException {
		
		return dao.loadOrdrePaimentByORMID(attribute);
	}

	public OrdrePaiment getOrdrePaimentByORMID(int attribute) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public OrdrePaiment loadOrdrePaimentByORMID(int attribute, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public OrdrePaiment getOrdrePaimentByORMID(int attribute, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public OrdrePaiment loadOrdrePaimentByORMID(PersistentSession session, int attribute)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public OrdrePaiment getOrdrePaimentByORMID(PersistentSession session, int attribute)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public OrdrePaiment loadOrdrePaimentByORMID(PersistentSession session, int attribute,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public OrdrePaiment getOrdrePaimentByORMID(PersistentSession session, int attribute,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public OrdrePaiment[] listOrdrePaimentByQuery(String condition, String orderBy)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public OrdrePaiment[] listOrdrePaimentByQuery(String condition, String orderBy,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public OrdrePaiment[] listOrdrePaimentByQuery(PersistentSession session,
			String condition, String orderBy) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public OrdrePaiment[] listOrdrePaimentByQuery(PersistentSession session,
			String condition, String orderBy, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public OrdrePaiment loadOrdrePaimentByQuery(String condition, String orderBy)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public OrdrePaiment loadOrdrePaimentByQuery(String condition, String orderBy,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public OrdrePaiment loadOrdrePaimentByQuery(PersistentSession session,
			String condition, String orderBy) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public OrdrePaiment loadOrdrePaimentByQuery(PersistentSession session,
			String condition, String orderBy, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public OrdrePaiment createOrdrePaiment() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean save(OrdrePaiment ordrePaiment) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(OrdrePaiment ordrePaiment) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteAndDissociate(OrdrePaiment ordrePaiment)
			throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteAndDissociate(OrdrePaiment ordrePaiment, PersistentSession session)
			throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean refresh(OrdrePaiment ordrePaiment) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean evict(OrdrePaiment ordrePaiment) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
