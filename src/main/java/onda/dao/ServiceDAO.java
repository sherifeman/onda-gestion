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

public interface ServiceDAO {
	public Service loadServiceByORMID(int id_Serv) throws PersistentException;
	public Service getServiceByORMID(int id_Serv) throws PersistentException;
	public Service loadServiceByORMID(int id_Serv, org.hibernate.LockMode lockMode) throws PersistentException;
	public Service getServiceByORMID(int id_Serv, org.hibernate.LockMode lockMode) throws PersistentException;
	public Service loadServiceByORMID(PersistentSession session, int id_Serv) throws PersistentException;
	public Service getServiceByORMID(PersistentSession session, int id_Serv) throws PersistentException;
	public Service loadServiceByORMID(PersistentSession session, int id_Serv, org.hibernate.LockMode lockMode) throws PersistentException;
	public Service getServiceByORMID(PersistentSession session, int id_Serv, org.hibernate.LockMode lockMode) throws PersistentException;
	public Service[] listServiceByQuery(String condition, String orderBy) throws PersistentException;
	public Service[] listServiceByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Service[] listServiceByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Service[] listServiceByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Service loadServiceByQuery(String condition, String orderBy) throws PersistentException;
	public Service loadServiceByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Service loadServiceByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Service loadServiceByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Service createService();
	public boolean save(onda.Service service) throws PersistentException;
	public boolean delete(onda.Service service) throws PersistentException;
	public boolean deleteAndDissociate(onda.Service service) throws PersistentException;
	public boolean deleteAndDissociate(onda.Service service, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(onda.Service service) throws PersistentException;
	public boolean evict(onda.Service service) throws PersistentException;
}
