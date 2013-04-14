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

import onda.dao.*;

public abstract class DAOFactory {
	private static DAOFactory _factory = new DAOFactoryImpl();
	
	public static DAOFactory getDAOFactory() {
		return _factory;
	}
	
	public abstract UserDAO getUserDAO();
	public abstract ServiceDAO getServiceDAO();
	public abstract FournisseurDAO getFournisseurDAO();
	public abstract ProfilDAO getProfilDAO();
	public abstract FonctionDAO getFonctionDAO();
	public abstract MotifDAO getMotifDAO();
	public abstract FactureDAO getFactureDAO();
	public abstract RejetDAO getRejetDAO();
	public abstract OrdrePaimentDAO getOrdrePaimentDAO();
	public abstract JournalDAO getJournalDAO();
	public abstract HistoriqueActionsDAO getHistoriqueActionsDAO();
	public abstract StatutDAO getStatutDAO();
	public abstract DeviseDAO getDeviseDAO();
	public abstract DirectionDAO getDirectionDAO();
}

