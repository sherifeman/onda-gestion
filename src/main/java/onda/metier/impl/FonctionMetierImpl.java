package onda.metier.impl;

import org.orm.*;
import org.hibernate.LockMode;
import onda.*;
import onda.dao.FonctionDAO;
import onda.dao.impl.FonctionDAOImpl;

public class FonctionMetierImpl implements onda.metier.FonctionMetier {
	
	FonctionDAO dao = new FonctionDAOImpl();

	public Fonction loadFonctionByORMID(int attribute) throws PersistentException {
		
		return dao.loadFonctionByORMID(attribute);
	}

	public Fonction getDeviseByORMID(int attribute) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Fonction loadFonctionByORMID(int attribute, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Fonction getFonctionByORMID(int attribute, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Fonction loadFonctionByORMID(PersistentSession session, int attribute)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Fonction getFonctionByORMID(PersistentSession session, int attribute)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Fonction loadFonctionByORMID(PersistentSession session, int attribute,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Fonction getFonctionByORMID(PersistentSession session, int attribute,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Fonction[] listFonctionByQuery(String condition, String orderBy)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Fonction[] listFonctionByQuery(String condition, String orderBy,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Fonction[] listFonctionByQuery(PersistentSession session,
			String condition, String orderBy) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Fonction[] listFonctionByQuery(PersistentSession session,
			String condition, String orderBy, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Fonction loadFonctionByQuery(String condition, String orderBy)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Fonction loadFonctionByQuery(String condition, String orderBy,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Fonction loadFonctionByQuery(PersistentSession session,
			String condition, String orderBy) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Fonction loadFonctionByQuery(PersistentSession session,
			String condition, String orderBy, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Fonction createFonction() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean save(Fonction fonction) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(Fonction fonction) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteAndDissociate(Fonction fonction)
			throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteAndDissociate(Fonction fonction, PersistentSession session)
			throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean refresh(Fonction fonction) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean evict(Fonction fonction) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public Fonction getFonctionByORMID(int id_Fonction)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
