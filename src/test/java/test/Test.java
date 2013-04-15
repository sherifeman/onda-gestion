package test;

import onda.DAOFactory;
import onda.DAOFactoryImpl;
import onda.Statut;

import org.orm.PersistentException;

public class Test {

	/**
	 * @param args
	 * @throws PersistentException 
	 */ static void main(String[] args) throws PersistentException {
		 
		Statut s = new Statut();
		s.setLibelle("Certifier");
		DAOFactory f = new DAOFactoryImpl();
		f.getStatutDAO().save(s);
		System.out.println(">>>>>>");
		
	}

}