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

public class Direction {
	public Direction() {
	}
	
	private int id_Direction;
	
	private String nom_Direction;
	
	private void setId_Direction(int value) {
		this.id_Direction = value;
	}
	
	public int getId_Direction() {
		return id_Direction;
	}
	
	public int getORMID() {
		return getId_Direction();
	}
	
	public void setNom_Direction(String value) {
		this.nom_Direction = value;
	}
	
	public String getNom_Direction() {
		return nom_Direction;
	}
	
	public String toString() {
		return String.valueOf(getId_Direction());
	}
	
}
