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

public interface HistoriqueActionsDAO {
	public HistoriqueActions loadHistoriqueActionsByORMID(int id_Historique) throws PersistentException;
	public HistoriqueActions getHistoriqueActionsByORMID(int id_Historique) throws PersistentException;
	public HistoriqueActions loadHistoriqueActionsByORMID(int id_Historique, org.hibernate.LockMode lockMode) throws PersistentException;
	public HistoriqueActions getHistoriqueActionsByORMID(int id_Historique, org.hibernate.LockMode lockMode) throws PersistentException;
	public HistoriqueActions loadHistoriqueActionsByORMID(PersistentSession session, int id_Historique) throws PersistentException;
	public HistoriqueActions getHistoriqueActionsByORMID(PersistentSession session, int id_Historique) throws PersistentException;
	public HistoriqueActions loadHistoriqueActionsByORMID(PersistentSession session, int id_Historique, org.hibernate.LockMode lockMode) throws PersistentException;
	public HistoriqueActions getHistoriqueActionsByORMID(PersistentSession session, int id_Historique, org.hibernate.LockMode lockMode) throws PersistentException;
	public HistoriqueActions[] listHistoriqueActionsByQuery(String condition, String orderBy) throws PersistentException;
	public HistoriqueActions[] listHistoriqueActionsByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public HistoriqueActions[] listHistoriqueActionsByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public HistoriqueActions[] listHistoriqueActionsByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public HistoriqueActions loadHistoriqueActionsByQuery(String condition, String orderBy) throws PersistentException;
	public HistoriqueActions loadHistoriqueActionsByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public HistoriqueActions loadHistoriqueActionsByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public HistoriqueActions loadHistoriqueActionsByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public HistoriqueActions createHistoriqueActions();
	public boolean save(onda.HistoriqueActions historiqueActions) throws PersistentException;
	public boolean delete(onda.HistoriqueActions historiqueActions) throws PersistentException;
	public boolean deleteAndDissociate(onda.HistoriqueActions historiqueActions) throws PersistentException;
	public boolean deleteAndDissociate(onda.HistoriqueActions historiqueActions, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(onda.HistoriqueActions historiqueActions) throws PersistentException;
	public boolean evict(onda.HistoriqueActions historiqueActions) throws PersistentException;
}
