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

public class Fonction {
	public Fonction() {
	}
	
	private int id_Fonction;
	
	private String nom_Fonction;
	
	private void setId_Fonction(int value) {
		this.id_Fonction = value;
	}
	
	public int getId_Fonction() {
		return id_Fonction;
	}
	
	public int getORMID() {
		return getId_Fonction();
	}
	
	public void setNom_Fonction(String value) {
		this.nom_Fonction = value;
	}
	
	public String getNom_Fonction() {
		return nom_Fonction;
	}
	
	public String toString() {
		return String.valueOf(getId_Fonction());
	}
	
}
