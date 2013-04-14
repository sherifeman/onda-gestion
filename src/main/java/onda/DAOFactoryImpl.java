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
import onda.dao.impl.*;

public class DAOFactoryImpl extends DAOFactory {
	private UserDAO _userDAO = new UserDAOImpl();
	public UserDAO getUserDAO() {
		return _userDAO;
	}
	
	private ServiceDAO _serviceDAO = new ServiceDAOImpl();
	public ServiceDAO getServiceDAO() {
		return _serviceDAO;
	}
	
	private FournisseurDAO _fournisseurDAO = new FournisseurDAOImpl();
	public FournisseurDAO getFournisseurDAO() {
		return _fournisseurDAO;
	}
	
	private ProfilDAO _profilDAO = new ProfilDAOImpl();
	public ProfilDAO getProfilDAO() {
		return _profilDAO;
	}
	
	private FonctionDAO _fonctionDAO = new FonctionDAOImpl();
	public FonctionDAO getFonctionDAO() {
		return _fonctionDAO;
	}
	
	private MotifDAO _motifDAO = new MotifDAOImpl();
	public MotifDAO getMotifDAO() {
		return _motifDAO;
	}
	
	private FactureDAO _factureDAO = new FactureDAOImpl();
	public FactureDAO getFactureDAO() {
		return _factureDAO;
	}
	
	private RejetDAO _rejetDAO = new RejetDAOImpl();
	public RejetDAO getRejetDAO() {
		return _rejetDAO;
	}
	
	private OrdrePaimentDAO _ordrePaimentDAO = new OrdrePaimentDAOImpl();
	public OrdrePaimentDAO getOrdrePaimentDAO() {
		return _ordrePaimentDAO;
	}
	
	private JournalDAO _journalDAO = new JournalDAOImpl();
	public JournalDAO getJournalDAO() {
		return _journalDAO;
	}
	
	private HistoriqueActionsDAO _historiqueActionsDAO = new HistoriqueActionsDAOImpl();
	public HistoriqueActionsDAO getHistoriqueActionsDAO() {
		return _historiqueActionsDAO;
	}
	
	private StatutDAO _statutDAO = new StatutDAOImpl();
	public StatutDAO getStatutDAO() {
		return _statutDAO;
	}
	
	private DeviseDAO _deviseDAO = new DeviseDAOImpl();
	public DeviseDAO getDeviseDAO() {
		return _deviseDAO;
	}
	
	private DirectionDAO _directionDAO = new DirectionDAOImpl();
	public DirectionDAO getDirectionDAO() {
		return _directionDAO;
	}
	
}

