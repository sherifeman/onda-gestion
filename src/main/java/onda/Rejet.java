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

public class Rejet {
	public Rejet() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == onda.ORMConstants.KEY_REJET_DIRECTIONS) {
			return ORM_directions;
		}
		else if (key == onda.ORMConstants.KEY_REJET_MOTIFS) {
			return ORM_motifs;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int id_Rejet;
	
	private onda.OrdrePaiment op;
	
	private java.util.Date date_Rejet;
	
	private java.util.Set ORM_directions = new java.util.HashSet();
	
	private java.util.Set ORM_motifs = new java.util.HashSet();
	
	private void setId_Rejet(int value) {
		this.id_Rejet = value;
	}
	
	public int getId_Rejet() {
		return id_Rejet;
	}
	
	public int getORMID() {
		return getId_Rejet();
	}
	
	public void setDate_Rejet(java.util.Date value) {
		this.date_Rejet = value;
	}
	
	public java.util.Date getDate_Rejet() {
		return date_Rejet;
	}
	
	public void setOp(onda.OrdrePaiment value) {
		if (this.op != value) {
			onda.OrdrePaiment lop = this.op;
			this.op = value;
			if (value != null) {
				op.setRejet(this);
			}
			else {
				lop.setRejet(null);
			}
		}
	}
	
	public onda.OrdrePaiment getOp() {
		return op;
	}
	
	private void setORM_Directions(java.util.Set value) {
		this.ORM_directions = value;
	}
	
	private java.util.Set getORM_Directions() {
		return ORM_directions;
	}
	
	public final onda.DirectionSetCollection directions = new onda.DirectionSetCollection(this, _ormAdapter, onda.ORMConstants.KEY_REJET_DIRECTIONS, onda.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Motifs(java.util.Set value) {
		this.ORM_motifs = value;
	}
	
	private java.util.Set getORM_Motifs() {
		return ORM_motifs;
	}
	
	public final onda.MotifSetCollection motifs = new onda.MotifSetCollection(this, _ormAdapter, onda.ORMConstants.KEY_REJET_MOTIFS, onda.ORMConstants.KEY_MOTIF_REJET, onda.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId_Rejet());
	}
	
}
