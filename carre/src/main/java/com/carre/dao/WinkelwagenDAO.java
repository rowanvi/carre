/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carre.dao;

import com.carre.model.Winkelwagen;
import java.util.List;

/**
 *
 * @author Rowan
 */
public interface WinkelwagenDAO {

	public void addCart(Winkelwagen w, int voorstellingid, String voornaam, String achternaam, String email, String sessieid);
        public void updateCart(Winkelwagen w);
	public List<Winkelwagen> listCartByDate(String beginDatum, String eindDatum);
        public List<Winkelwagen> listCartByVoorstellingId(int id);
	public Winkelwagen getCartById(String id);
        public void updateCartStatus(Winkelwagen w, int status, int id);
        

}
