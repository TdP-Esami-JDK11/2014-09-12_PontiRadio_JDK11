package it.polito.tdp.pontiradio.db;

import java.util.List;

import it.polito.tdp.pontiradio.model.Citta;
import it.polito.tdp.pontiradio.model.Ponte;

public class TestDAO {

public static void main(String[] args) {
		
		RadioDAO dao = new RadioDAO() ;
		
		List<Citta> citta = dao.getAllCitta() ;
		
		for( Citta c: citta ) {
			System.out.format("%4d %s %s\n", c.getIdCitta(), c.getCall(), c.getCity()) ;
		}
		
		List<Ponte> ponti = dao.getAllPonte() ;

		for( Ponte p : ponti ) {
			System.out.format("%4d %s %s\n", p.getIdPonte(), p.getCall(), p.getComments()) ;
		}
		
	}

}
