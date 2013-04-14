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

public class Devise {
	public Devise() {
	}
	
	private int id_Devise;
	
	private String libelle;
	
	private void setId_Devise(int value) {
		this.id_Devise = value;
	}
	
	public int getId_Devise() {
		return id_Devise;
	}
	
	public int getORMID() {
		return getId_Devise();
	}
	
	public void setLibelle(String value) {
		this.libelle = value;
	}
	
	public String getLibelle() {
		return libelle;
	}
	
	public String toString() {
		return String.valueOf(getId_Devise());
	}
	
}
