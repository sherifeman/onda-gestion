package onda.metier.impl;

import onda.Motif;
import onda.dao.MotifDAO;
import onda.dao.impl.MotifDAOImpl;

import org.hibernate.LockMode;
import org.orm.PersistentException;
import org.orm.PersistentSession;

public class MotifMetierImpl implements onda.metier.MotifMetier {
	
	MotifDAO dao = new MotifDAOImpl();

	public Motif loadMotifByORMID(int attribute) throws PersistentException {
		
		return dao.loadMotifByORMID(attribute);
	}

	public Motif getMotifByORMID(int attribute) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Motif loadMotifByORMID(int attribute, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Motif getMotifByORMID(int attribute, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Motif loadMotifByORMID(PersistentSession session, int attribute)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Motif getMotifByORMID(PersistentSession session, int attribute)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Motif loadMotifByORMID(PersistentSession session, int attribute,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Motif getMotifByORMID(PersistentSession session, int attribute,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Motif[] listMotifByQuery(String condition, String orderBy)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Motif[] listMotifByQuery(String condition, String orderBy,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Motif[] listMotifByQuery(PersistentSession session,
			String condition, String orderBy) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Motif[] listMotifByQuery(PersistentSession session,
			String condition, String orderBy, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Motif loadMotifByQuery(String condition, String orderBy)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Motif loadMotifByQuery(String condition, String orderBy,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Motif loadMotifByQuery(PersistentSession session,
			String condition, String orderBy) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Motif loadMotifByQuery(PersistentSession session,
			String condition, String orderBy, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Motif createMotif() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean save(Motif motif) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(Motif motif) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteAndDissociate(Motif motif)
			throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteAndDissociate(Motif motif, PersistentSession session)
			throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean refresh(Motif motif) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean evict(Motif motif) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
