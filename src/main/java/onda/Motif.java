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

public class Motif {
	public Motif() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == onda.ORMConstants.KEY_MOTIF_REJET) {
			this.rejet = (onda.Rejet) owner;
		}
		
		else if (key == onda.ORMConstants.KEY_MOTIF_FACTURE) {
			this.facture = (onda.Facture) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id_Motif;
	
	private onda.Rejet rejet;
	
	private onda.Facture facture;
	
	private String nom_Motif;
	
	private void setId_Motif(int value) {
		this.id_Motif = value;
	}
	
	public int getId_Motif() {
		return id_Motif;
	}
	
	public int getORMID() {
		return getId_Motif();
	}
	
	public void setNom_Motif(String value) {
		this.nom_Motif = value;
	}
	
	public String getNom_Motif() {
		return nom_Motif;
	}
	
	public void setRejet(onda.Rejet value) {
		if (rejet != null) {
			rejet.motifs.remove(this);
		}
		if (value != null) {
			value.motifs.add(this);
		}
	}
	
	public onda.Rejet getRejet() {
		return rejet;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Rejet(onda.Rejet value) {
		this.rejet = value;
	}
	
	private onda.Rejet getORM_Rejet() {
		return rejet;
	}
	
	public void setFacture(onda.Facture value) {
		if (facture != null) {
			facture.motifs.remove(this);
		}
		if (value != null) {
			value.motifs.add(this);
		}
	}
	
	public onda.Facture getFacture() {
		return facture;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Facture(onda.Facture value) {
		this.facture = value;
	}
	
	private onda.Facture getORM_Facture() {
		return facture;
	}
	
	public String toString() {
		return String.valueOf(getId_Motif());
	}
	
}
