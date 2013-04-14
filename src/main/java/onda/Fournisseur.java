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

public class Fournisseur {
	public Fournisseur() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == onda.ORMConstants.KEY_FOURNISSEUR_FACTURES) {
			return ORM_factures;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int id_Frs;
	
	private String nom_Frs;
	
	private java.util.Set ORM_factures = new java.util.HashSet();
	
	private void setId_Frs(int value) {
		this.id_Frs = value;
	}
	
	public int getId_Frs() {
		return id_Frs;
	}
	
	public int getORMID() {
		return getId_Frs();
	}
	
	public void setNom_Frs(String value) {
		this.nom_Frs = value;
	}
	
	public String getNom_Frs() {
		return nom_Frs;
	}
	
	private void setORM_Factures(java.util.Set value) {
		this.ORM_factures = value;
	}
	
	private java.util.Set getORM_Factures() {
		return ORM_factures;
	}
	
	public final onda.FactureSetCollection factures = new onda.FactureSetCollection(this, _ormAdapter, onda.ORMConstants.KEY_FOURNISSEUR_FACTURES, onda.ORMConstants.KEY_FACTURE_FOURNISSEUR, onda.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId_Frs());
	}
	
}
