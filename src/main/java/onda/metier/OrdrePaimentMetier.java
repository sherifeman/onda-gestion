package onda.metier;

import org.orm.*;
import onda.*;

public interface OrdrePaimentMetier {
	public OrdrePaiment loadOrdrePaimentByORMID(int id_Op) throws PersistentException;
	public OrdrePaiment getOrdrePaimentByORMID(int id_Op) throws PersistentException;
	public OrdrePaiment loadOrdrePaimentByORMID(int id_Op, org.hibernate.LockMode lockMode) throws PersistentException;
	public OrdrePaiment getOrdrePaimentByORMID(int id_Op, org.hibernate.LockMode lockMode) throws PersistentException;
	public OrdrePaiment loadOrdrePaimentByORMID(PersistentSession session, int id_Op) throws PersistentException;
	public OrdrePaiment getOrdrePaimentByORMID(PersistentSession session, int id_Op) throws PersistentException;
	public OrdrePaiment loadOrdrePaimentByORMID(PersistentSession session, int id_Op, org.hibernate.LockMode lockMode) throws PersistentException;
	public OrdrePaiment getOrdrePaimentByORMID(PersistentSession session, int id_Op, org.hibernate.LockMode lockMode) throws PersistentException;
	public OrdrePaiment[] listOrdrePaimentByQuery(String condition, String orderBy) throws PersistentException;
	public OrdrePaiment[] listOrdrePaimentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public OrdrePaiment[] listOrdrePaimentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public OrdrePaiment[] listOrdrePaimentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public OrdrePaiment loadOrdrePaimentByQuery(String condition, String orderBy) throws PersistentException;
	public OrdrePaiment loadOrdrePaimentByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public OrdrePaiment loadOrdrePaimentByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public OrdrePaiment loadOrdrePaimentByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public OrdrePaiment createOrdrePaiment();
	public boolean save(onda.OrdrePaiment ordrePaiment) throws PersistentException;
	public boolean delete(onda.OrdrePaiment ordrePaiment) throws PersistentException;
	public boolean deleteAndDissociate(onda.OrdrePaiment ordrePaiment) throws PersistentException;
	public boolean deleteAndDissociate(onda.OrdrePaiment ordrePaiment, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(onda.OrdrePaiment ordrePaiment) throws PersistentException;
	public boolean evict(onda.OrdrePaiment ordrePaiment) throws PersistentException;
}
