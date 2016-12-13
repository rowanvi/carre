package com.carre.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.carre.dao.VoorstellingDAO;
import com.carre.model.Voorstelling;

@Service
@Transactional
public class VoorstellingServiceImpl implements VoorstellingService {

    private VoorstellingDAO voorstellingDAO;

    public void setVoorstellingDAO(VoorstellingDAO voorstellingDAO) {
        this.voorstellingDAO = voorstellingDAO;
    }

    @Override
    public void addVoorstelling(Voorstelling p) {
        this.voorstellingDAO.addVoorstelling(p);
    }

    @Override
    public void updateVoorstelling(Voorstelling p) {
        this.voorstellingDAO.updateVoorstelling(p);
    }

    @Override
    public List<Voorstelling> listVoorstelling() {
        return this.voorstellingDAO.listVoorstelling();
    }

    @Override
    public Voorstelling getVoorstellingById(int id) {
        return this.voorstellingDAO.getVoorstellingById(id);
    }
    
}
