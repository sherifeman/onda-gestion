package onda.metier.impl;

import onda.Journal;
import onda.dao.JournalDAO;
import onda.dao.impl.JournalDAOImpl;

import org.hibernate.LockMode;
import org.orm.PersistentException;
import org.orm.PersistentSession;

public class JournalMetierImpl implements onda.metier.JournalMetier {
	
	JournalDAO dao = new JournalDAOImpl();

	public Journal loadJournalByORMID(int attribute) throws PersistentException {
		
		return dao.loadJournalByORMID(attribute);
	}

	public Journal getJournalByORMID(int attribute) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Journal loadJournalByORMID(int attribute, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Journal getJournalByORMID(int attribute, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Journal loadJournalByORMID(PersistentSession session, int attribute)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Journal getJournalByORMID(PersistentSession session, int attribute)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Journal loadJournaleByORMID(PersistentSession session, int attribute,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Journal getJournalByORMID(PersistentSession session, int attribute,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Journal[] listJournalByQuery(String condition, String orderBy)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Journal[] listJournalByQuery(String condition, String orderBy,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Journal[] listJournalByQuery(PersistentSession session,
			String condition, String orderBy) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Journal[] listJournalByQuery(PersistentSession session,
			String condition, String orderBy, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Journal loadJournalByQuery(String condition, String orderBy)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Journal loadJournalByQuery(String condition, String orderBy,
			LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Journal loadJournalByQuery(PersistentSession session,
			String condition, String orderBy) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Journal loadJournalByQuery(PersistentSession session,
			String condition, String orderBy, LockMode lockMode)
			throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}

	public Journal createJournal() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean save(Journal journal) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(Journal journal) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteAndDissociate(Journal journal)
			throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteAndDissociate(Journal journal, PersistentSession session)
			throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean refresh(Journal journal) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean evict(Journal journal) throws PersistentException {
		// TODO Auto-generated method stub
		return false;
	}

	public Journal loadJournalByORMID(PersistentSession session,
			int id_Journal, LockMode lockMode) throws PersistentException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
