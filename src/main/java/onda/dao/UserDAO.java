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

public interface UserDAO {
	public User loadUserByORMID(int id_User) throws PersistentException;
	public User getUserByORMID(int id_User) throws PersistentException;
	public User loadUserByORMID(int id_User, org.hibernate.LockMode lockMode) throws PersistentException;
	public User getUserByORMID(int id_User, org.hibernate.LockMode lockMode) throws PersistentException;
	public User loadUserByORMID(PersistentSession session, int id_User) throws PersistentException;
	public User getUserByORMID(PersistentSession session, int id_User) throws PersistentException;
	public User loadUserByORMID(PersistentSession session, int id_User, org.hibernate.LockMode lockMode) throws PersistentException;
	public User getUserByORMID(PersistentSession session, int id_User, org.hibernate.LockMode lockMode) throws PersistentException;
	public User[] listUserByQuery(String condition, String orderBy) throws PersistentException;
	public User[] listUserByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public User[] listUserByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public User[] listUserByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public User loadUserByQuery(String condition, String orderBy) throws PersistentException;
	public User loadUserByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public User loadUserByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public User loadUserByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public User createUser();
	public boolean save(onda.User user) throws PersistentException;
	public boolean delete(onda.User user) throws PersistentException;
	public boolean deleteAndDissociate(onda.User user) throws PersistentException;
	public boolean deleteAndDissociate(onda.User user, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(onda.User user) throws PersistentException;
	public boolean evict(onda.User user) throws PersistentException;
}
