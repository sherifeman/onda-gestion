package onda.metier;

import org.orm.*;
import onda.*;

public interface StatutMetier {
	public Statut loadStatutByORMID(int id_Statu) throws PersistentException;
	public Statut getStatutByORMID(int id_Statu) throws PersistentException;
	public Statut loadStatutByORMID(int id_Statu, org.hibernate.LockMode lockMode) throws PersistentException;
	public Statut getStatutByORMID(int id_Statu, org.hibernate.LockMode lockMode) throws PersistentException;
	public Statut loadStatutByORMID(PersistentSession session, int id_Statu) throws PersistentException;
	public Statut getStatutByORMID(PersistentSession session, int id_Statu) throws PersistentException;
	public Statut loadStatutByORMID(PersistentSession session, int id_Statu, org.hibernate.LockMode lockMode) throws PersistentException;
	public Statut getStatutByORMID(PersistentSession session, int id_Statu, org.hibernate.LockMode lockMode) throws PersistentException;
	public Statut[] listStatutByQuery(String condition, String orderBy) throws PersistentException;
	public Statut[] listStatutByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Statut[] listStatutByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Statut[] listStatutByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Statut loadStatutByQuery(String condition, String orderBy) throws PersistentException;
	public Statut loadStatutByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Statut loadStatutByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Statut loadStatutByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Statut createStatut();
	public boolean save(onda.Statut statut) throws PersistentException;
	public boolean delete(onda.Statut statut) throws PersistentException;
	public boolean refresh(onda.Statut statut) throws PersistentException;
	public boolean evict(onda.Statut statut) throws PersistentException;
}
