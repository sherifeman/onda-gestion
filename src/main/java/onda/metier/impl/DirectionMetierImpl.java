package onda.metier.impl;

import org.orm.*;
import org.hibernate.LockMode;
import onda.*;
import onda.dao.DirectionDAO;
import onda.dao.impl.DirectionDAOImpl;

public class DirectionMetierImpl implements onda.metier.DirectionMetier {
	
	DirectionDAO dao = new DirectionDAOImpl();

	public Direction loadDirectionByORMID(int attribute) throws PersistentException {
		
		return dao.loadDirectionByORMID(attribute);
	}

	public Direction getDirectionByORMID(int attribute) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Direction loadDirectionByORMID(int attribute, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Direction getDirectionByORMID(int attribute, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Direction loadDirectionByORMID(PersistentSession session, int attribute)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Direction getDirectionByORMID(PersistentSession session, int attribute)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Direction loadDirectionByORMID(PersistentSession session, int attribute,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Direction getDirectionByORMID(PersistentSession session, int attribute,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Direction[] listDirectionByQuery(String condition, String orderBy)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Direction[] listDirectionByQuery(String condition, String orderBy,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Direction[] listDirectionByQuery(PersistentSession session,
			String condition, String orderBy) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Direction[] listDirectionByQuery(PersistentSession session,
			String condition, String orderBy, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Direction loadDirectionByQuery(String condition, String orderBy)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Direction loadDirectionByQuery(String condition, String orderBy,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Direction loadDirectionByQuery(PersistentSession session,
			String condition, String orderBy) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Direction loadDirectionByQuery(PersistentSession session,
			String condition, String orderBy, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Direction createDirection() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean save(Direction direction) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(Direction direction) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteAndDissociate(Direction direction)
			throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteAndDissociate(Direction direction, PersistentSession session)
			throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean refresh(Direction direction) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean evict(Direction direction) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
