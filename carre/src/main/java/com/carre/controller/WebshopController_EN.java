/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carre.controller;

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

/**
 *
 * @author Rowan
 */
@Controller
public class WebshopController_EN {

    private ProductorderService productorderService;
    private ProductService productService;
    private VoorstellingService VoorstellingService;
    private WinkelwagenService WinkelwagenService;
    private CategorieService CategorieService;

    @Autowired(required = true)
    @Qualifier(value = "VoorstellingService")
    public void setVoorstellingService(VoorstellingService cs) {
        this.VoorstellingService = cs;
    }

    @Autowired(required = true)
    @Qualifier(value = "WinkelwagenService")
    public void setWinkelwagenService(WinkelwagenService ps) {
        this.WinkelwagenService = ps;
    }

    @Autowired(required = true)
    @Qualifier(value = "productorderService")
    public void setProductorderService(ProductorderService ps) {
        this.productorderService = ps;
    }

    @Autowired(required = true)
    @Qualifier(value = "productService")
    public void setProductService(ProductService ps) {
        this.productService = ps;
    }

    @Autowired(required = true)
    @Qualifier(value = "CategorieService")
    public void setCategorieService(CategorieService cs) {
        this.CategorieService = cs;
    }

    //Homepage controller
    @RequestMapping(value = "/Webshop_engels", method = RequestMethod.GET)
    public String listProductIndex(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("listProductIndex", this.productService.listProductIndex());
        return "Webshop_engels/index";
    }

    //Cart controllers
    @RequestMapping(value = "/Webshop_engels/cart", method = RequestMethod.GET)
    public String listProductorder(Model model, HttpServletRequest request, HttpServletResponse response) {
        Cookie[] cookies = request.getCookies();
        String sessieid = cookies[0].getValue();
        try {
            model.addAttribute("winkelwagen", this.WinkelwagenService.getCartById(sessieid));
        } catch (Exception e) {

        }
        model.addAttribute("listProductorderNieuw", this.productorderService.listProductorderNieuw(sessieid));
        model.addAttribute("productorder", new ProductOrder());
        model.addAttribute("product", this.productService);
        return "Webshop_engels/cart";
    }

    @RequestMapping(value = "Webshop_engels/cart/update/{id}")
    public String updateProductorderAantal(HttpServletRequest request, @ModelAttribute("productorder") ProductOrder p, @PathVariable("id") int id) throws Exception {
        try {
            this.productorderService.updateProductorderAantal(p, 5, id);
            return "redirect:Webshop_engels/cart";
        } catch (Exception e) {

        }
        String referer = request.getHeader("Referer");
        return "redirect:" + referer;

    }

    @RequestMapping(value = "Webshop_engels/cart/delete/{id}")
    public String deleteProductorderAantal(HttpServletRequest request, @ModelAttribute("productorder") ProductOrder p, @PathVariable("id") int id) throws Exception {
        try {
            this.productorderService.removeProductorder(p, id);
            return "redirect:Webshop_engels/cart";
        } catch (Exception e) {

        }
        String referer = request.getHeader("Referer");
        return "redirect:" + referer;

    }

    //Order informatie klant
    @RequestMapping(value = "Webshop_engels/orderinfo", method = RequestMethod.GET)
    public String listOrderinfo(Model model, HttpServletRequest request, HttpServletResponse response) {
        model.addAttribute("winkelwagen", new Winkelwagen());
        model.addAttribute("voorstelling", new Voorstelling());
        model.addAttribute("voorstellingen", this.VoorstellingService);
        model.addAttribute("listVoorstelling", this.VoorstellingService.listVoorstelling());
        return "Webshop_engels/cartinfo";
    }

    @RequestMapping(value = "Webshop_engels/orderinfo/post", method = RequestMethod.POST)
    public String addProductorder(@ModelAttribute("winkelwagen") Winkelwagen w, HttpServletRequest request, HttpServletResponse response) throws Exception {
        HttpSession session = request.getSession(false);
        Cookie cookie = null;
        Cookie[] cookies = null;
        cookies = request.getCookies();
        String sessieid = cookies[0].getValue();
        String voornaam = w.getVoornaam();
        String achternaam = w.getAchternaam();
        String email = w.getEmail();
        int voorstellingid = w.getVoorstellingid();
        if (session != null && !session.isNew()) {
            session.invalidate();
        }
        request.getSession(true);

        try {
            this.WinkelwagenService.addCart(w, voorstellingid, voornaam, achternaam, email, sessieid);
            return "Webshop_engels/betaling";
        } catch (Exception e) {

        }
        return "Webshop_engels/betaling";

    }

    //Shop controller
    private boolean toegevoegd = false;

    @RequestMapping(value = "Webshop_engels/webshop", method = RequestMethod.GET)
    public String listProduct(Model model, HttpServletRequest request, HttpServletResponse response) {
        model.addAttribute("productorder", new ProductOrder());
        model.addAttribute("product", new Product());
        model.addAttribute("listProduct", this.productService.listProduct());
        model.addAttribute("categorie", new Categorie());
        model.addAttribute("listCategorie", this.CategorieService.listCategorie());
        model.addAttribute("melding", toegevoegd);
        this.toegevoegd = false;
        return "Webshop_engels/shop";
    }

    @RequestMapping("Webshop_engels/webshop/{id}")
    public String listProductByCategorie(@PathVariable("id") int id, Model model, Model categorie) {
        model.addAttribute("product", new Product());
        model.addAttribute("listProduct", this.productService.listProductByCategorie(id));
        categorie.addAttribute("categorie", new Categorie());
        categorie.addAttribute("listCategorie", this.CategorieService.listCategorie());
        return "Webshop_engels/shop";
    }

    @RequestMapping(value = "Webshop_engels/webshop/addtocart/{id}")
    public String addProductorder(@ModelAttribute("productorder") ProductOrder p, @PathVariable("id") int id, Product pr, HttpServletRequest request, HttpServletResponse response, Model model) throws Exception {

        Cookie cookie = null;
        Cookie[] cookies = null;
        cookies = request.getCookies();
        String sessieid = cookies[0].getValue();
        String referer = request.getHeader("Referer");

        try {
            this.productorderService.addProductorder(p, id, sessieid);

            return "redirect:" + referer;
        } catch (Exception e) {

        }
        this.toegevoegd = true;
        return "redirect:" + referer;

    }

    //Contact pagina controller
    @RequestMapping(value = "Webshop_engels/contact", method = RequestMethod.GET)
    public String contactView() {
        return "Webshop_engels/contact";
    }

    //Betaald pagina controller
    @RequestMapping(value = "Webshop_engels/betaling", method = RequestMethod.GET)
    public String betalingController() {
        return "Webshop_engels/betaling";
    }
}
