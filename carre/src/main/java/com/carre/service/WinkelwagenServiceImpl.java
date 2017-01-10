package com.carre.service;

import com.carre.dao.WinkelwagenDAO;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.carre.dao.WinkelwagenDAOImpl;
import com.carre.model.Winkelwagen;

@Service
@Transactional
public class WinkelwagenServiceImpl implements WinkelwagenService {

    private WinkelwagenDAO winkelwagenDAO;

    public void setWinkelwagenDAO(WinkelwagenDAO winkelwagenDAO) {
        this.winkelwagenDAO = winkelwagenDAO;
    }

    @Override
    public void addCart(Winkelwagen w, int voorstellingid, String voornaam, String achternaam, String email, String sessieid) {
        this.winkelwagenDAO.addCart(w, voorstellingid, voornaam, achternaam, email, sessieid);
    }

    @Override
    public void updateCart(Winkelwagen w) {
        this.winkelwagenDAO.updateCart(w);
    }

    @Override
    public List<Winkelwagen> listCartByDate(String beginDatum, String eindDatum) {
        return this.winkelwagenDAO.listCartByDate(beginDatum, eindDatum);
    }
    
        @Override
    public List<Winkelwagen> listCartByVoorstellingId(int id) {
        return this.winkelwagenDAO.listCartByVoorstellingId(id);
    }

    @Override
    public Winkelwagen getCartById(String id) {
        return this.winkelwagenDAO.getCartById(id);
    }
    public void updateCartStatus(Winkelwagen w, int status, int id){
        this.winkelwagenDAO.updateCartStatus(w, status, id);
    }
    
}   
    
