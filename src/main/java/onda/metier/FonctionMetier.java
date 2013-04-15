package onda.metier;

import org.orm.*;
import onda.*;

public interface FonctionMetier {
	public Fonction loadFonctionByORMID(int id_Fonction) throws PersistentException;
	public Fonction getFonctionByORMID(int id_Fonction) throws PersistentException;
	public Fonction loadFonctionByORMID(int id_Fonction, org.hibernate.LockMode lockMode) throws PersistentException;
	public Fonction getFonctionByORMID(int id_Fonction, org.hibernate.LockMode lockMode) throws PersistentException;
	public Fonction loadFonctionByORMID(PersistentSession session, int id_Fonction) throws PersistentException;
	public Fonction getFonctionByORMID(PersistentSession session, int id_Fonction) throws PersistentException;
	public Fonction loadFonctionByORMID(PersistentSession session, int id_Fonction, org.hibernate.LockMode lockMode) throws PersistentException;
	public Fonction getFonctionByORMID(PersistentSession session, int id_Fonction, org.hibernate.LockMode lockMode) throws PersistentException;
	public Fonction[] listFonctionByQuery(String condition, String orderBy) throws PersistentException;
	public Fonction[] listFonctionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Fonction[] listFonctionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Fonction[] listFonctionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Fonction loadFonctionByQuery(String condition, String orderBy) throws PersistentException;
	public Fonction loadFonctionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Fonction loadFonctionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Fonction loadFonctionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Fonction createFonction();
	public boolean save(onda.Fonction fonction) throws PersistentException;
	public boolean delete(onda.Fonction fonction) throws PersistentException;
	public boolean refresh(onda.Fonction fonction) throws PersistentException;
	public boolean evict(onda.Fonction fonction) throws PersistentException;
}
