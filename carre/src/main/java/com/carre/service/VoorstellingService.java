
package com.carre.service;

import java.util.List;

import com.carre.model.Voorstelling;

public interface VoorstellingService {
    	public void addVoorstelling(Voorstelling p);
	public void updateVoorstelling(Voorstelling p);     
	public List<Voorstelling> listVoorstelling();
        public List<Voorstelling> listVoorstellingAdmin();
	public Voorstelling getVoorstellingById(int id);
}
