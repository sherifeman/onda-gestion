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

public class Journal {
	public Journal() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == onda.ORMConstants.KEY_JOURNAL_FACTURE) {
			this.facture = (onda.Facture) owner;
		}
		
		else if (key == onda.ORMConstants.KEY_JOURNAL_USER) {
			this.user = (onda.User) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id_Journal;
	
	private onda.User user;
	
	private onda.Facture facture;
	
	private java.util.Date date_Fct;
	
	private String libelle;
	
	private void setId_Journal(int value) {
		this.id_Journal = value;
	}
	
	public int getId_Journal() {
		return id_Journal;
	}
	
	public int getORMID() {
		return getId_Journal();
	}
	
	public void setDate_Fct(java.util.Date value) {
		this.date_Fct = value;
	}
	
	public java.util.Date getDate_Fct() {
		return date_Fct;
	}
	
	public void setLibelle(String value) {
		this.libelle = value;
	}
	
	public String getLibelle() {
		return libelle;
	}
	
	public void setFacture(onda.Facture value) {
		if (facture != null) {
			facture.journals.remove(this);
		}
		if (value != null) {
			value.journals.add(this);
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
	
	public void setUser(onda.User value) {
		this.user = value;
	}
	
	public onda.User getUser() {
		return user;
	}
	
	public String toString() {
		return String.valueOf(getId_Journal());
	}
	
}
