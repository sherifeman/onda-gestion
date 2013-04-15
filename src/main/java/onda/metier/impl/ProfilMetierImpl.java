package onda.metier.impl;

import org.orm.*;
import org.hibernate.LockMode;
import onda.*;
import onda.dao.ProfilDAO;
import onda.dao.impl.ProfilDAOImpl;

public class ProfilMetierImpl implements onda.metier.ProfilMetier {
	
	ProfilDAO dao = new ProfilDAOImpl();

	public Profil loadProfilByORMID(int attribute) throws PersistentException {
		
		return dao.loadProfilByORMID(attribute);
	}

	public Profil getProfilByORMID(int attribute) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Profil loadProfilByORMID(int attribute, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Profil getProfilByORMID(int attribute, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Profil loadProfilByORMID(PersistentSession session, int attribute)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Profil getProfilByORMID(PersistentSession session, int attribute)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Profil loadProfilByORMID(PersistentSession session, int attribute,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Profil getProfilByORMID(PersistentSession session, int attribute,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Profil[] listProfilByQuery(String condition, String orderBy)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Profil[] listProfilByQuery(String condition, String orderBy,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Profil[] listProfilByQuery(PersistentSession session,
			String condition, String orderBy) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Profil[] listProfilByQuery(PersistentSession session,
			String condition, String orderBy, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Profil loadProfilByQuery(String condition, String orderBy)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Profil loadProfilByQuery(String condition, String orderBy,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Profil loadProfilByQuery(PersistentSession session,
			String condition, String orderBy) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Profil loadProfilByQuery(PersistentSession session,
			String condition, String orderBy, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Profil createProfil() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean save(Profil profil) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(Profil profil) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteAndDissociate(Profil profil)
			throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteAndDissociate(Profil profil, PersistentSession session)
			throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean refresh(Profil profil) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean evict(Profil profil) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
