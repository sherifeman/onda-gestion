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
package onda.dao.impl;

import org.orm.*;
import org.hibernate.Query;
import java.util.List;
import onda.*;

public class DirectionDAOImpl implements onda.dao.DirectionDAO {
	public Direction loadDirectionByORMID(int id_Direction) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return loadDirectionByORMID(session, id_Direction);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Direction getDirectionByORMID(int id_Direction) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return getDirectionByORMID(session, id_Direction);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Direction loadDirectionByORMID(int id_Direction, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return loadDirectionByORMID(session, id_Direction, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Direction getDirectionByORMID(int id_Direction, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return getDirectionByORMID(session, id_Direction, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Direction loadDirectionByORMID(PersistentSession session, int id_Direction) throws PersistentException {
		try {
			return (Direction) session.load(onda.Direction.class, new Integer(id_Direction));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Direction getDirectionByORMID(PersistentSession session, int id_Direction) throws PersistentException {
		try {
			return (Direction) session.get(onda.Direction.class, new Integer(id_Direction));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Direction loadDirectionByORMID(PersistentSession session, int id_Direction, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Direction) session.load(onda.Direction.class, new Integer(id_Direction), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Direction getDirectionByORMID(PersistentSession session, int id_Direction, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Direction) session.get(onda.Direction.class, new Integer(id_Direction), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Direction[] listDirectionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return listDirectionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Direction[] listDirectionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return listDirectionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Direction[] listDirectionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From onda.Direction as Direction");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			List list = query.list();
			return (Direction[]) list.toArray(new Direction[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Direction[] listDirectionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From onda.Direction as Direction");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			List list = query.list();
			return (Direction[]) list.toArray(new Direction[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Direction loadDirectionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return loadDirectionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Direction loadDirectionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return loadDirectionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Direction loadDirectionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Direction[] directions = listDirectionByQuery(session, condition, orderBy);
		if (directions != null && directions.length > 0)
			return directions[0];
		else
			return null;
	}
	
	public Direction loadDirectionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Direction[] directions = listDirectionByQuery(session, condition, orderBy, lockMode);
		if (directions != null && directions.length > 0)
			return directions[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateDirectionByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return iterateDirectionByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDirectionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = onda.ONDAPersistentManager.instance().getSession();
			return iterateDirectionByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDirectionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From onda.Direction as Direction");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateDirectionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From onda.Direction as Direction");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("this", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public Direction createDirection() {
		return new onda.Direction();
	}
	
	public boolean save(onda.Direction direction) throws PersistentException {
		try {
			onda.ONDAPersistentManager.instance().saveObject(direction);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean delete(onda.Direction direction) throws PersistentException {
		try {
			onda.ONDAPersistentManager.instance().deleteObject(direction);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean refresh(onda.Direction direction) throws PersistentException {
		try {
			onda.ONDAPersistentManager.instance().getSession().refresh(direction);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public boolean evict(onda.Direction direction) throws PersistentException {
		try {
			onda.ONDAPersistentManager.instance().getSession().evict(direction);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
