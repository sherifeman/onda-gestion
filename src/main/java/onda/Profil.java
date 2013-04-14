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

public class Profil {
	public Profil() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == onda.ORMConstants.KEY_PROFIL_FONCTIONS) {
			return ORM_fonctions;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int id_Profil;
	
	private String nom_Profil;
	
	private java.util.Set ORM_fonctions = new java.util.HashSet();
	
	private void setId_Profil(int value) {
		this.id_Profil = value;
	}
	
	public int getId_Profil() {
		return id_Profil;
	}
	
	public int getORMID() {
		return getId_Profil();
	}
	
	public void setNom_Profil(String value) {
		this.nom_Profil = value;
	}
	
	public String getNom_Profil() {
		return nom_Profil;
	}
	
	private void setORM_Fonctions(java.util.Set value) {
		this.ORM_fonctions = value;
	}
	
	private java.util.Set getORM_Fonctions() {
		return ORM_fonctions;
	}
	
	public final onda.FonctionSetCollection fonctions = new onda.FonctionSetCollection(this, _ormAdapter, onda.ORMConstants.KEY_PROFIL_FONCTIONS, onda.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId_Profil());
	}
	
}
