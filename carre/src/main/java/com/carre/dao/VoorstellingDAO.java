package com.carre.dao;

import java.util.List;

import com.carre.model.Voorstelling;

public interface VoorstellingDAO {

	public void addVoorstelling(Voorstelling c);
	public void updateVoorstelling(Voorstelling c);
	public List<Voorstelling> listVoorstelling();
        public List<Voorstelling> listVoorstellingAdmin();
	public Voorstelling getVoorstellingById(int id);

}
