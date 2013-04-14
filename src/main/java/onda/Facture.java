package onda;

public class Facture {
	public Facture() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == onda.ORMConstants.KEY_FACTURE_MOTIFS) {
			return ORM_motifs;
		}
		else if (key == onda.ORMConstants.KEY_FACTURE_JOURNALS) {
			return ORM_journals;
		}
		else if (key == onda.ORMConstants.KEY_FACTURE_HISTORIQUES) {
			return ORM_historiques;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == onda.ORMConstants.KEY_FACTURE_FOURNISSEUR) {
			this.fournisseur = (onda.Fournisseur) owner;
		}
		
		else if (key == onda.ORMConstants.KEY_FACTURE_OP) {
			this.op = (onda.OrdrePaiment) owner;
		}
		
		else if (key == onda.ORMConstants.KEY_FACTURE_DEVISE) {
			this.devise = (onda.Devise) owner;
		}
	}
	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	private int id_Fac;
	
	private onda.Devise devise;
	
	private onda.OrdrePaiment op;
	
	private onda.Fournisseur fournisseur;
	
	private String doceng;
	
	private int ref_Fac;
	
	private java.util.Date date_Fac;
	
	private Double mt_Fac;
	
	private java.util.Set ORM_motifs = new java.util.HashSet();
	
	private java.util.Set ORM_journals = new java.util.HashSet();
	
	private java.util.Set ORM_historiques = new java.util.HashSet();
	
	private void setId_Fac(int value) {
		this.id_Fac = value;
	}
	
	public int getId_Fac() {
		return id_Fac;
	}
	
	public int getORMID() {
		return getId_Fac();
	}
	
	public void setDoceng(String value) {
		this.doceng = value;
	}
	
	public String getDoceng() {
		return doceng;
	}
	
	public void setRef_Fac(int value) {
		this.ref_Fac = value;
	}
	
	public int getRef_Fac() {
		return ref_Fac;
	}
	
	public void setDate_Fac(java.util.Date value) {
		this.date_Fac = value;
	}
	
	public java.util.Date getDate_Fac() {
		return date_Fac;
	}
	
	public void setMt_Fac(double value) {
		setMt_Fac(new Double(value));
	}
	
	public void setMt_Fac(Double value) {
		this.mt_Fac = value;
	}
	
	public Double getMt_Fac() {
		return mt_Fac;
	}
	
	private void setORM_Motifs(java.util.Set value) {
		this.ORM_motifs = value;
	}
	
	private java.util.Set getORM_Motifs() {
		return ORM_motifs;
	}
	
	public final onda.MotifSetCollection motifs = new onda.MotifSetCollection(this, _ormAdapter, onda.ORMConstants.KEY_FACTURE_MOTIFS, onda.ORMConstants.KEY_MOTIF_FACTURE, onda.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setFournisseur(onda.Fournisseur value) {
		if (fournisseur != null) {
			fournisseur.factures.remove(this);
		}
		if (value != null) {
			value.factures.add(this);
		}
	}
	
	public onda.Fournisseur getFournisseur() {
		return fournisseur;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Fournisseur(onda.Fournisseur value) {
		this.fournisseur = value;
	}
	
	private onda.Fournisseur getORM_Fournisseur() {
		return fournisseur;
	}
	
	public void setOp(onda.OrdrePaiment value) {
		if (op != null) {
			op.factures.remove(this);
		}
		if (value != null) {
			value.factures.add(this);
		}
	}
	
	public onda.OrdrePaiment getOp() {
		return op;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Op(onda.OrdrePaiment value) {
		this.op = value;
	}
	
	private onda.OrdrePaiment getORM_Op() {
		return op;
	}
	
	private void setORM_Journals(java.util.Set value) {
		this.ORM_journals = value;
	}
	
	private java.util.Set getORM_Journals() {
		return ORM_journals;
	}
	
	public final onda.JournalSetCollection journals = new onda.JournalSetCollection(this, _ormAdapter, onda.ORMConstants.KEY_FACTURE_JOURNALS, onda.ORMConstants.KEY_JOURNAL_FACTURE, onda.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Historiques(java.util.Set value) {
		this.ORM_historiques = value;
	}
	
	private java.util.Set getORM_Historiques() {
		return ORM_historiques;
	}
	
	public final onda.HistoriqueActionsSetCollection historiques = new onda.HistoriqueActionsSetCollection(this, _ormAdapter, onda.ORMConstants.KEY_FACTURE_HISTORIQUES, onda.ORMConstants.KEY_HISTORIQUEACTIONS_FACTURE, onda.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setDevise(onda.Devise value) {
		this.devise = value;
	}
	
	public onda.Devise getDevise() {
		return devise;
	}
	
	public String toString() {
		return String.valueOf(getId_Fac());
	}
	
}
