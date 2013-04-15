package onda.metier;

import org.orm.*;
import onda.*;

public interface FactureMetier {
	public Facture loadFactureByORMID(int id_Fac) throws PersistentException;
	public Facture getFactureByORMID(int id_Fac) throws PersistentException;
	public Facture loadFactureByORMID(int id_Fac, org.hibernate.LockMode lockMode) throws PersistentException;
	public Facture getFactureByORMID(int id_Fac, org.hibernate.LockMode lockMode) throws PersistentException;
	public Facture loadFactureByORMID(PersistentSession session, int id_Fac) throws PersistentException;
	public Facture getFactureByORMID(PersistentSession session, int id_Fac) throws PersistentException;
	public Facture loadFactureByORMID(PersistentSession session, int id_Fac, org.hibernate.LockMode lockMode) throws PersistentException;
	public Facture getFactureByORMID(PersistentSession session, int id_Fac, org.hibernate.LockMode lockMode) throws PersistentException;
	public Facture[] listFactureByQuery(String condition, String orderBy) throws PersistentException;
	public Facture[] listFactureByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Facture[] listFactureByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Facture[] listFactureByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Facture loadFactureByQuery(String condition, String orderBy) throws PersistentException;
	public Facture loadFactureByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Facture loadFactureByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException;
	public Facture loadFactureByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException;
	public Facture createFacture();
	public boolean save(onda.Facture facture) throws PersistentException;
	public boolean delete(onda.Facture facture) throws PersistentException;
	public boolean deleteAndDissociate(onda.Facture facture) throws PersistentException;
	public boolean deleteAndDissociate(onda.Facture facture, org.orm.PersistentSession session) throws PersistentException;
	public boolean refresh(onda.Facture facture) throws PersistentException;
	public boolean evict(onda.Facture facture) throws PersistentException;
}
