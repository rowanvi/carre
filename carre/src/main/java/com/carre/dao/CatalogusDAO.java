package com.carre.dao;

import java.util.List;

import com.carre.model.Catalogus;

public interface CatalogusDAO {

	public void addCatalogus(Catalogus c);
	public void updateCatalogus(Catalogus c);
	public List<Catalogus> listCatalogus();
	public Catalogus getCatalogusById(int id);

}
