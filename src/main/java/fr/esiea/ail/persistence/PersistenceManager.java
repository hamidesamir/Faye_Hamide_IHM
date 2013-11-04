package fr.esiea.ail.persistence;

import java.util.HashMap;

import fr.esiea.ail.model.Adresse;

public class PersistenceManager {
	
	private static HashMap<String,Adresse> adresses=new HashMap<String,Adresse>();
	
	
	
	public static void saveAdresse(Adresse adresse){
		
		adresses.put(adresse.getAlias(), adresse);
		
	}
	
	public static Adresse getAdresse(String alias){
		
		return adresses.get(alias);
		
	}

	public static HashMap<String,Adresse> getAdresses() {
		// TODO Auto-generated method stub
		
		return adresses;
	}
	

}
