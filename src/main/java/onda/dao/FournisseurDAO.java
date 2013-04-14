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

public interface FournisseurDAO {
	public Fournisseur loadFournisseurByORMID(int id_Frs) throws PersistentException;
	public Fournisseur getFournisseurByORMID(int id_Frs) throws PersistentException;
	public Fournisseur loadFournisseurByORMID(int id_Frs, org.hibernate.LockMode lockMode) throws PersistentException;
	public Fournisseur getFournisseurByORMID(int id_Frs, org.hibernate.LockMode lockMode) throws PersistentException;
	public Fournisseur loadFournisseurByORMID(PersistentSession session, int id_Frs) throws PersistentException;
	public Fournisseur getFournisseurByORMID(PersistentSession session, int id_Frs) throws PersistentException;
	public Fournisseur loadFournisseurByORMID(PersistentSession session, int id_Frs, org.hibernate.LockMode lockMode) throws PersistentException;
	public Fournisseur getFournisseurByORMID(PersistentSession session, int id_Frs, org.hibernate.LockMode lockMode) throws PersistentException;
	public Fournisseur[] listFournisseurByQuery(String condition, String orderBy) throws PersistentException;
	public Fournisseur[] listFournisseurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Fournisseur[] listFournisseurByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Fournisseur[] listFournisseurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Fournisseur loadFournisseurByQuery(String condition, String orderBy) throws PersistentException;
	public Fournisseur loadFournisseurByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Fournisseur loadFournisseurByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Fournisseur loadFournisseurByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Fournisseur createFournisseur();
	public boolean save(onda.Fournisseur fournisseur) throws PersistentException;
	public boolean delete(onda.Fournisseur fournisseur) throws PersistentException;
	public boolean deleteAndDissociate(onda.Fournisseur fournisseur) throws PersistentException;
	public boolean deleteAndDissociate(onda.Fournisseur fournisseur, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(onda.Fournisseur fournisseur) throws PersistentException;
	public boolean evict(onda.Fournisseur fournisseur) throws PersistentException;
}
