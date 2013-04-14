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
package onda;

public class Service {
	public Service() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == onda.ORMConstants.KEY_SERVICE_USERS) {
			return ORM_users;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int id_Serv;
	
	private String libelle;
	
	private java.util.Set ORM_users = new java.util.HashSet();
	
	private void setId_Serv(int value) {
		this.id_Serv = value;
	}
	
	public int getId_Serv() {
		return id_Serv;
	}
	
	public int getORMID() {
		return getId_Serv();
	}
	
	public void setLibelle(String value) {
		this.libelle = value;
	}
	
	public String getLibelle() {
		return libelle;
	}
	
	private void setORM_Users(java.util.Set value) {
		this.ORM_users = value;
	}
	
	private java.util.Set getORM_Users() {
		return ORM_users;
	}
	
	public final onda.UserSetCollection users = new onda.UserSetCollection(this, _ormAdapter, onda.ORMConstants.KEY_SERVICE_USERS, onda.ORMConstants.KEY_USER_SERVICE, onda.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId_Serv());
	}
	
}
