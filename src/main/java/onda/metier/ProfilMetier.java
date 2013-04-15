package onda.metier;

import org.orm.*;
import onda.*;

public interface ProfilMetier {
	public Profil loadProfilByORMID(int id_Profil) throws PersistentException;
	public Profil getProfilByORMID(int id_Profil) throws PersistentException;
	public Profil loadProfilByORMID(int id_Profil, org.hibernate.LockMode lockMode) throws PersistentException;
	public Profil getProfilByORMID(int id_Profil, org.hibernate.LockMode lockMode) throws PersistentException;
	public Profil loadProfilByORMID(PersistentSession session, int id_Profil) throws PersistentException;
	public Profil getProfilByORMID(PersistentSession session, int id_Profil) throws PersistentException;
	public Profil loadProfilByORMID(PersistentSession session, int id_Profil, org.hibernate.LockMode lockMode) throws PersistentException;
	public Profil getProfilByORMID(PersistentSession session, int id_Profil, org.hibernate.LockMode lockMode) throws PersistentException;
	public Profil[] listProfilByQuery(String condition, String orderBy) throws PersistentException;
	public Profil[] listProfilByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Profil[] listProfilByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Profil[] listProfilByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Profil loadProfilByQuery(String condition, String orderBy) throws PersistentException;
	public Profil loadProfilByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Profil loadProfilByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Profil loadProfilByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Profil createProfil();
	public boolean save(onda.Profil profil) throws PersistentException;
	public boolean delete(onda.Profil profil) throws PersistentException;
	public boolean refresh(onda.Profil profil) throws PersistentException;
	public boolean evict(onda.Profil profil) throws PersistentException;
}
