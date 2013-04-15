package onda.metier;

import org.orm.*;
import onda.*;

public interface MotifMetier {
	public Motif loadMotifByORMID(int id_Motif) throws PersistentException;
	public Motif getMotifByORMID(int id_Motif) throws PersistentException;
	public Motif loadMotifByORMID(int id_Motif, org.hibernate.LockMode lockMode) throws PersistentException;
	public Motif getMotifByORMID(int id_Motif, org.hibernate.LockMode lockMode) throws PersistentException;
	public Motif loadMotifByORMID(PersistentSession session, int id_Motif) throws PersistentException;
	public Motif getMotifByORMID(PersistentSession session, int id_Motif) throws PersistentException;
	public Motif loadMotifByORMID(PersistentSession session, int id_Motif, org.hibernate.LockMode lockMode) throws PersistentException;
	public Motif getMotifByORMID(PersistentSession session, int id_Motif, org.hibernate.LockMode lockMode) throws PersistentException;
	public Motif[] listMotifByQuery(String condition, String orderBy) throws PersistentException;
	public Motif[] listMotifByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Motif[] listMotifByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Motif[] listMotifByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Motif loadMotifByQuery(String condition, String orderBy) throws PersistentException;
	public Motif loadMotifByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Motif loadMotifByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Motif loadMotifByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Motif createMotif();
	public boolean save(onda.Motif motif) throws PersistentException;
	public boolean delete(onda.Motif motif) throws PersistentException;
	public boolean deleteAndDissociate(onda.Motif motif) throws PersistentException;
	public boolean deleteAndDissociate(onda.Motif motif, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(onda.Motif motif) throws PersistentException;
	public boolean evict(onda.Motif motif) throws PersistentException;
}
