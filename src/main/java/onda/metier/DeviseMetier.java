package onda.metier;

import org.orm.*;
import onda.*;

public interface DeviseMetier {
	public Devise loadDeviseByORMID(int id_Devise) throws PersistentException;
	public Devise getDeviseByORMID(int id_Devise) throws PersistentException;
	public Devise loadDeviseByORMID(int id_Devise, org.hibernate.LockMode lockMode) throws PersistentException;
	public Devise getDeviseByORMID(int id_Devise, org.hibernate.LockMode lockMode) throws PersistentException;
	public Devise loadDeviseByORMID(PersistentSession session, int id_Devise) throws PersistentException;
	public Devise getDeviseByORMID(PersistentSession session, int id_Devise) throws PersistentException;
	public Devise loadDeviseByORMID(PersistentSession session, int id_Devise, org.hibernate.LockMode lockMode) throws PersistentException;
	public Devise getDeviseByORMID(PersistentSession session, int id_Devise, org.hibernate.LockMode lockMode) throws PersistentException;
	public Devise[] listDeviseByQuery(String condition, String orderBy) throws PersistentException;
	public Devise[] listDeviseByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Devise[] listDeviseByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Devise[] listDeviseByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Devise loadDeviseByQuery(String condition, String orderBy) throws PersistentException;
	public Devise loadDeviseByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Devise loadDeviseByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Devise loadDeviseByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Devise createDevise();
	public boolean save(onda.Devise devise) throws PersistentException;
	public boolean delete(onda.Devise devise) throws PersistentException;
	public boolean refresh(onda.Devise devise) throws PersistentException;
	public boolean evict(onda.Devise devise) throws PersistentException;
}
