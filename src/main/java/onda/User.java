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

public class User {
	public User() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == onda.ORMConstants.KEY_USER_SERVICE) {
			this.service = (onda.Service) owner;
		}
		
		else if (key == onda.ORMConstants.KEY_USER_PROFIL) {
			this.profil = (onda.Profil) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id_User;
	
	private onda.Profil profil;
	
	private onda.Service service;
	
	private int login;
	
	private String pass;
	
	private String nom_User;
	
	private String prenom_User;
	
	private void setId_User(int value) {
		this.id_User = value;
	}
	
	public int getId_User() {
		return id_User;
	}
	
	public int getORMID() {
		return getId_User();
	}
	
	public void setLogin(int value) {
		this.login = value;
	}
	
	public int getLogin() {
		return login;
	}
	
	public void setPass(String value) {
		this.pass = value;
	}
	
	public String getPass() {
		return pass;
	}
	
	public void setNom_User(String value) {
		this.nom_User = value;
	}
	
	public String getNom_User() {
		return nom_User;
	}
	
	public void setPrenom_User(String value) {
		this.prenom_User = value;
	}
	
	public String getPrenom_User() {
		return prenom_User;
	}
	
	public void setService(onda.Service value) {
		if (service != null) {
			service.users.remove(this);
		}
		if (value != null) {
			value.users.add(this);
		}
	}
	
	public onda.Service getService() {
		return service;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Service(onda.Service value) {
		this.service = value;
	}
	
	private onda.Service getORM_Service() {
		return service;
	}
	
	public void setProfil(onda.Profil value) {
		this.profil = value;
	}
	
	public onda.Profil getProfil() {
		return profil;
	}
	
	public String toString() {
		return String.valueOf(getId_User());
	}
	
}
