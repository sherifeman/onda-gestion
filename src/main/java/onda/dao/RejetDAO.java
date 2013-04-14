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

public interface RejetDAO {
	public Rejet loadRejetByORMID(int id_Rejet) throws PersistentException;
	public Rejet getRejetByORMID(int id_Rejet) throws PersistentException;
	public Rejet loadRejetByORMID(int id_Rejet, org.hibernate.LockMode lockMode) throws PersistentException;
	public Rejet getRejetByORMID(int id_Rejet, org.hibernate.LockMode lockMode) throws PersistentException;
	public Rejet loadRejetByORMID(PersistentSession session, int id_Rejet) throws PersistentException;
	public Rejet getRejetByORMID(PersistentSession session, int id_Rejet) throws PersistentException;
	public Rejet loadRejetByORMID(PersistentSession session, int id_Rejet, org.hibernate.LockMode lockMode) throws PersistentException;
	public Rejet getRejetByORMID(PersistentSession session, int id_Rejet, org.hibernate.LockMode lockMode) throws PersistentException;
	public Rejet[] listRejetByQuery(String condition, String orderBy) throws PersistentException;
	public Rejet[] listRejetByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Rejet[] listRejetByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Rejet[] listRejetByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Rejet loadRejetByQuery(String condition, String orderBy) throws PersistentException;
	public Rejet loadRejetByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Rejet loadRejetByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Rejet loadRejetByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Rejet createRejet();
	public boolean save(onda.Rejet rejet) throws PersistentException;
	public boolean delete(onda.Rejet rejet) throws PersistentException;
	public boolean deleteAndDissociate(onda.Rejet rejet) throws PersistentException;
	public boolean deleteAndDissociate(onda.Rejet rejet, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(onda.Rejet rejet) throws PersistentException;
	public boolean evict(onda.Rejet rejet) throws PersistentException;
}
