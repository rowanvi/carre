/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carre.controller.old;

import com.carre.model.Categorie;
import com.carre.model.Product;
import com.carre.model.ProductOrder;
import com.carre.model.Voorstelling;
import com.carre.model.Winkelwagen;
import com.carre.service.CategorieService;
import com.carre.service.ProductService;
import com.carre.service.ProductorderService;
import com.carre.service.VoorstellingService;
import com.carre.service.WinkelwagenService;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Rowan
 */

public class CartInfoController {
//
//    private VoorstellingService VoorstellingService;
//    private WinkelwagenService WinkelwagenService;
//
//    @Autowired(required = true)
//    @Qualifier(value = "VoorstellingService")
//    public void setVoorstellingService(VoorstellingService cs) {
//        this.VoorstellingService = cs;
//    }
//
//    @Autowired(required = true)
//    @Qualifier(value = "WinkelwagenService")
//    public void setWinkelwagenService(WinkelwagenService ps) {
//        this.WinkelwagenService = ps;
//    }

//    @RequestMapping(value = "/orderinfo", method = RequestMethod.GET)
//    public String listProduct(Model model, HttpServletRequest request, HttpServletResponse response) {
//        model.addAttribute("winkelwagen", new Winkelwagen());
//        model.addAttribute("voorstelling", new Voorstelling());
//        model.addAttribute("voorstellingen", this.VoorstellingService);
//        model.addAttribute("listVoorstelling", this.VoorstellingService.listVoorstelling());
//        return "cartinfo";
//    }
//
//    @RequestMapping(value = "/orderinfo/post", method = RequestMethod.POST)
//    public String addProductorder(@ModelAttribute("winkelwagen") Winkelwagen w, HttpServletRequest request, HttpServletResponse response) throws Exception {
//        HttpSession session = request.getSession(false);
//        Cookie cookie = null;
//        Cookie[] cookies = null;
//        cookies = request.getCookies();
//        String sessieid = cookies[0].getValue();
//        String voornaam = w.getVoornaam();
//        String achternaam = w.getAchternaam();
//        String email = w.getEmail();
//        int voorstellingid = w.getVoorstellingid();
//        if (session != null && !session.isNew()) {
//            session.invalidate();
//        }
//        request.getSession(true);
//
//        try {
//            this.WinkelwagenService.addCart(w, voorstellingid, voornaam, achternaam, email, sessieid);
//            return "betaling";
//        } catch (Exception e) {
//
//        }
//        return "betaling";
//
//    }

}
