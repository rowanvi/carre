package com.carre.dao;

import java.util.List;

import com.carre.model.Categorie;

public interface CategorieDAO {

	public void addCategorie(Categorie c);
	public void updateCategorie(Categorie c);
	public List<Categorie> listCategorie();
	public Categorie getCategorieById(int id);

}
