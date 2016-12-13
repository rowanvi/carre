
package com.carre.service;

import java.util.List;

import com.carre.model.Categorie;

public interface CategorieService {
    	public void addCategorie(Categorie p);
	public void updateCategorie(Categorie p);     
	public List<Categorie> listCategorie();
	public Categorie getCategorieById(int id);
}
