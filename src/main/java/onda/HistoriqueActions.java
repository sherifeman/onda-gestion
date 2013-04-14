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

public class HistoriqueActions {
	public HistoriqueActions() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == onda.ORMConstants.KEY_HISTORIQUEACTIONS_FACTURE) {
			this.facture = (onda.Facture) owner;
		}
		
		else if (key == onda.ORMConstants.KEY_HISTORIQUEACTIONS_SERVICE) {
			this.service = (onda.Service) owner;
		}
		
		else if (key == onda.ORMConstants.KEY_HISTORIQUEACTIONS_STATUT) {
			this.statut = (onda.Statut) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id_Historique;
	
	private onda.Statut statut;
	
	private onda.Service service;
	
	private onda.Facture facture;
	
	private java.util.Date date_Recp;
	
	private java.util.Date date_Envoi;
	
	private void setId_Historique(int value) {
		this.id_Historique = value;
	}
	
	public int getId_Historique() {
		return id_Historique;
	}
	
	public int getORMID() {
		return getId_Historique();
	}
	
	public void setDate_Recp(java.util.Date value) {
		this.date_Recp = value;
	}
	
	public java.util.Date getDate_Recp() {
		return date_Recp;
	}
	
	public void setDate_Envoi(java.util.Date value) {
		this.date_Envoi = value;
	}
	
	public java.util.Date getDate_Envoi() {
		return date_Envoi;
	}
	
	public void setFacture(onda.Facture value) {
		if (facture != null) {
			facture.historiques.remove(this);
		}
		if (value != null) {
			value.historiques.add(this);
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
	
	public void setService(onda.Service value) {
		this.service = value;
	}
	
	public onda.Service getService() {
		return service;
	}
	
	public void setStatut(onda.Statut value) {
		this.statut = value;
	}
	
	public onda.Statut getStatut() {
		return statut;
	}
	
	public String toString() {
		return String.valueOf(getId_Historique());
	}
	
}
