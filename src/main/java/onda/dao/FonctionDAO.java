/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: DuKe TeAm
 * License Type: Purchased
 */
package onda.dao;

import org.orm.*;
import onda.*;

public interface FonctionDAO {
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
