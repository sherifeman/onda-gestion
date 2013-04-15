package onda.metier;

import org.orm.*;
import onda.*;

public interface DirectionMetier {
	public Direction loadDirectionByORMID(int id_Direction) throws PersistentException;
	public Direction getDirectionByORMID(int id_Direction) throws PersistentException;
	public Direction loadDirectionByORMID(int id_Direction, org.hibernate.LockMode lockMode) throws PersistentException;
	public Direction getDirectionByORMID(int id_Direction, org.hibernate.LockMode lockMode) throws PersistentException;
	public Direction loadDirectionByORMID(PersistentSession session, int id_Direction) throws PersistentException;
	public Direction getDirectionByORMID(PersistentSession session, int id_Direction) throws PersistentException;
	public Direction loadDirectionByORMID(PersistentSession session, int id_Direction, org.hibernate.LockMode lockMode) throws PersistentException;
	public Direction getDirectionByORMID(PersistentSession session, int id_Direction, org.hibernate.LockMode lockMode) throws PersistentException;
	public Direction[] listDirectionByQuery(String condition, String orderBy) throws PersistentException;
	public Direction[] listDirectionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Direction[] listDirectionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Direction[] listDirectionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Direction loadDirectionByQuery(String condition, String orderBy) throws PersistentException;
	public Direction loadDirectionByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Direction loadDirectionByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Direction loadDirectionByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Direction createDirection();
	public boolean save(onda.Direction direction) throws PersistentException;
	public boolean delete(onda.Direction direction) throws PersistentException;
	public boolean refresh(onda.Direction direction) throws PersistentException;
	public boolean evict(onda.Direction direction) throws PersistentException;
}
