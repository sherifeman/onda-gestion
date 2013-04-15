package onda.metier;

import org.orm.*;
import onda.*;

public interface JournalMetier {
	public Journal loadJournalByORMID(int id_Journal) throws PersistentException;
	public Journal getJournalByORMID(int id_Journal) throws PersistentException;
	public Journal loadJournalByORMID(int id_Journal, org.hibernate.LockMode lockMode) throws PersistentException;
	public Journal getJournalByORMID(int id_Journal, org.hibernate.LockMode lockMode) throws PersistentException;
	public Journal loadJournalByORMID(PersistentSession session, int id_Journal) throws PersistentException;
	public Journal getJournalByORMID(PersistentSession session, int id_Journal) throws PersistentException;
	public Journal loadJournalByORMID(PersistentSession session, int id_Journal, org.hibernate.LockMode lockMode) throws PersistentException;
	public Journal getJournalByORMID(PersistentSession session, int id_Journal, org.hibernate.LockMode lockMode) throws PersistentException;
	public Journal[] listJournalByQuery(String condition, String orderBy) throws PersistentException;
	public Journal[] listJournalByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Journal[] listJournalByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Journal[] listJournalByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Journal loadJournalByQuery(String condition, String orderBy) throws PersistentException;
	public Journal loadJournalByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Journal loadJournalByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Journal loadJournalByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Journal createJournal();
	public boolean save(onda.Journal journal) throws PersistentException;
	public boolean delete(onda.Journal journal) throws PersistentException;
	public boolean deleteAndDissociate(onda.Journal journal) throws PersistentException;
	public boolean deleteAndDissociate(onda.Journal journal, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(onda.Journal journal) throws PersistentException;
	public boolean evict(onda.Journal journal) throws PersistentException;
}
