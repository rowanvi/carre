package com.carre.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.carre.dao.CatalogusDAO;
import com.carre.model.Catalogus;

@Service
@Transactional
public class CatalogusServiceImpl implements CatalogusService {

    private CatalogusDAO catalogusDAO;

    public void setCatalogusDAO(CatalogusDAO productDAO) {
        this.catalogusDAO = productDAO;
    }

    @Override
    public void addCatalogus(Catalogus p) {
        this.catalogusDAO.addCatalogus(p);
    }

    @Override
    public void updateCatalogus(Catalogus p) {
        this.catalogusDAO.updateCatalogus(p);
    }

    @Override
    public List<Catalogus> listCatalogus() {
        return this.catalogusDAO.listCatalogus();
    }

    @Override
    public Catalogus getCatalogusById(int id) {
        return this.catalogusDAO.getCatalogusById(id);
    }
    
}
