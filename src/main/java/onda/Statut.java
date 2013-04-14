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

public class Statut {
	public Statut() {
	}
	
	private int id_Statu;
	
	private String libelle;
	
	private void setId_Statu(int value) {
		this.id_Statu = value;
	}
	
	public int getId_Statu() {
		return id_Statu;
	}
	
	public int getORMID() {
		return getId_Statu();
	}
	
	public void setLibelle(String value) {
		this.libelle = value;
	}
	
	public String getLibelle() {
		return libelle;
	}
	
	public String toString() {
		return String.valueOf(getId_Statu());
	}
	
}
