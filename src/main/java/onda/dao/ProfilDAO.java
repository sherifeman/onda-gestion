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

public interface ProfilDAO {
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
