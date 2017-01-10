package com.carre.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.carre.dao.CategorieDAO;
import com.carre.model.Categorie;

@Service
@Transactional
public class CategorieServiceImpl implements CategorieService {

    private CategorieDAO categorieDAO;

    public void setCategorieDAO(CategorieDAO categorieDAO) {
        this.categorieDAO = categorieDAO;
    }

    @Override
    public void addCategorie(Categorie p) {
        this.categorieDAO.addCategorie(p);
    }

    @Override
    public void updateCategorie(Categorie p) {
        this.categorieDAO.updateCategorie(p);
    }

    @Override
    public List<Categorie> listCategorie() {
        return this.categorieDAO.listCategorie();
    }

    @Override
    public Categorie getCategorieById(int id) {
        return this.categorieDAO.getCategorieById(id);
    }
    
}
