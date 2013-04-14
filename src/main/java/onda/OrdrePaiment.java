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

public class OrdrePaiment {
	public OrdrePaiment() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == onda.ORMConstants.KEY_ORDREPAIMENT_FACTURES) {
			return ORM_factures;
		}
		
		return null;
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	private int id_Op;
	
	private String obj;
	
	private java.util.Date date_Op;
	
	private java.util.Date date_Bc;
	
	private java.util.Date date_SignT;
	
	private java.util.Date date_Dg;
	
	private int num_Paie;
	
	private String nom_Benf;
	
	private Double deduc;
	
	private Double mt_Total;
	
	private Double mt_Op;
	
	private onda.Rejet rejet;
	
	private java.util.Set ORM_factures = new java.util.HashSet();
	
	private void setId_Op(int value) {
		this.id_Op = value;
	}
	
	public int getId_Op() {
		return id_Op;
	}
	
	public int getORMID() {
		return getId_Op();
	}
	
	public void setObj(String value) {
		this.obj = value;
	}
	
	public String getObj() {
		return obj;
	}
	
	public void setDate_Op(java.util.Date value) {
		this.date_Op = value;
	}
	
	public java.util.Date getDate_Op() {
		return date_Op;
	}
	
	public void setDate_Bc(java.util.Date value) {
		this.date_Bc = value;
	}
	
	public java.util.Date getDate_Bc() {
		return date_Bc;
	}
	
	public void setDate_SignT(java.util.Date value) {
		this.date_SignT = value;
	}
	
	public java.util.Date getDate_SignT() {
		return date_SignT;
	}
	
	public void setDate_Dg(java.util.Date value) {
		this.date_Dg = value;
	}
	
	public java.util.Date getDate_Dg() {
		return date_Dg;
	}
	
	public void setNum_Paie(int value) {
		this.num_Paie = value;
	}
	
	public int getNum_Paie() {
		return num_Paie;
	}
	
	public void setNom_Benf(String value) {
		this.nom_Benf = value;
	}
	
	public String getNom_Benf() {
		return nom_Benf;
	}
	
	public void setDeduc(double value) {
		setDeduc(new Double(value));
	}
	
	public void setDeduc(Double value) {
		this.deduc = value;
	}
	
	public Double getDeduc() {
		return deduc;
	}
	
	public void setMt_Total(double value) {
		setMt_Total(new Double(value));
	}
	
	public void setMt_Total(Double value) {
		this.mt_Total = value;
	}
	
	public Double getMt_Total() {
		return mt_Total;
	}
	
	public void setMt_Op(double value) {
		setMt_Op(new Double(value));
	}
	
	public void setMt_Op(Double value) {
		this.mt_Op = value;
	}
	
	public Double getMt_Op() {
		return mt_Op;
	}
	
	public void setRejet(onda.Rejet value) {
		if (this.rejet != value) {
			onda.Rejet lrejet = this.rejet;
			this.rejet = value;
			if (value != null) {
				rejet.setOp(this);
			}
			else {
				lrejet.setOp(null);
			}
		}
	}
	
	public onda.Rejet getRejet() {
		return rejet;
	}
	
	private void setORM_Factures(java.util.Set value) {
		this.ORM_factures = value;
	}
	
	private java.util.Set getORM_Factures() {
		return ORM_factures;
	}
	
	public final onda.FactureSetCollection factures = new onda.FactureSetCollection(this, _ormAdapter, onda.ORMConstants.KEY_ORDREPAIMENT_FACTURES, onda.ORMConstants.KEY_FACTURE_OP, onda.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getId_Op());
	}
	
}
