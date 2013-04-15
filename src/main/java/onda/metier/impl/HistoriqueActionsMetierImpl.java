package onda.metier.impl;

import onda.Devise;
import onda.HistoriqueActions;
import onda.dao.HistoriqueActionsDAO;
import onda.dao.impl.HistoriqueActionsDAOImpl;

import org.hibernate.LockMode;
import org.orm.PersistentException;
import org.orm.PersistentSession;

public class HistoriqueActionsMetierImpl implements onda.metier.HistoriqueActionsMetier {
	
	HistoriqueActionsDAO dao = new HistoriqueActionsDAOImpl();

	public HistoriqueActions loadHistoriqueActionsByORMID(int attribute) throws PersistentException {
		
		return dao.loadHistoriqueActionsByORMID(attribute);
	}

	public HistoriqueActions getHistoriqueActionsByORMID(int attribute) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public HistoriqueActions loadHistoriqueActionsByORMID(int attribute, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public HistoriqueActions getHistoriqueActionsByORMID(int attribute, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public HistoriqueActions loadHistoriqueActionsByORMID(PersistentSession session, int attribute)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public HistoriqueActions getHistoriqueActionsByORMID(PersistentSession session, int attribute)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public HistoriqueActions loadHistoriqueActionsByORMID(PersistentSession session, int attribute,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public HistoriqueActions getHistoriqueActionsByORMID(PersistentSession session, int attribute,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public HistoriqueActions[] listHistoriqueActionsByQuery(String condition, String orderBy)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public HistoriqueActions[] listHistoriqueActionsByQuery(String condition, String orderBy,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public HistoriqueActions[] listHistoriqueActionsByQuery(PersistentSession session,
			String condition, String orderBy) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public HistoriqueActions[] listHistoriqueActionsByQuery(PersistentSession session,
			String condition, String orderBy, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public HistoriqueActions loadHistoriqueActionsByQuery(String condition, String orderBy)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public HistoriqueActions loadHistoriqueActionsByQuery(String condition, String orderBy,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public HistoriqueActions loadHistoriqueActionsByQuery(PersistentSession session,
			String condition, String orderBy) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public HistoriqueActions loadHistoriqueActionsByQuery(PersistentSession session,
			String condition, String orderBy, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public HistoriqueActions createHistoriqueActions() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean save(HistoriqueActions historiqueActions) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(HistoriqueActions historiqueActions) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteAndDissociate(HistoriqueActions historiqueActions)
			throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteAndDissociate(HistoriqueActions historiqueActions, PersistentSession session)
			throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean refresh(HistoriqueActions historiqueActions) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean evict(Devise devise) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean evict(HistoriqueActions historiqueActions)
			throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
