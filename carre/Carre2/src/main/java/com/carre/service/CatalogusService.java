
package com.carre.service;

import java.util.List;

import com.carre.model.Catalogus;

public interface CatalogusService {
    	public void addCatalogus(Catalogus p);
	public void updateCatalogus(Catalogus p);     
	public List<Catalogus> listCatalogus();
	public Catalogus getCatalogusById(int id);
}
