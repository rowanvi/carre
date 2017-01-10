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
public class WebshopController {

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
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String listProductIndex(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("listProductIndex", this.productService.listProductIndex());
        return "index";
    }

    //Cart controllers
    @RequestMapping(value = "/cart", method = RequestMethod.GET)
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
        return "cart";
    }

    @RequestMapping(value = "cart/update/{id}")
    public String updateProductorderAantal(@ModelAttribute("productorder") ProductOrder p, @PathVariable("id") int id) throws Exception {
        try {
            this.productorderService.updateProductorderAantal(p, 5, id);
            return "redirect:/cart";
        } catch (Exception e) {

        }
        return "redirect:/cart";

    }

    @RequestMapping(value = "cart/delete/{id}")
    public String deleteProductorderAantal(@ModelAttribute("productorder") ProductOrder p, @PathVariable("id") int id) throws Exception {
        try {
            this.productorderService.removeProductorder(p, id);
            return "redirect:/cart";
        } catch (Exception e) {

        }
        return "redirect:/cart";

    }

    //Order informatie klant
    @RequestMapping(value = "/orderinfo", method = RequestMethod.GET)
    public String listOrderinfo(Model model, HttpServletRequest request, HttpServletResponse response) {
        model.addAttribute("winkelwagen", new Winkelwagen());
        model.addAttribute("voorstelling", new Voorstelling());
        model.addAttribute("voorstellingen", this.VoorstellingService);
        model.addAttribute("listVoorstelling", this.VoorstellingService.listVoorstelling());
        return "cartinfo";
    }

    @RequestMapping(value = "/orderinfo/post", method = RequestMethod.POST)
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
            return "betaling";
        } catch (Exception e) {

        }
        return "betaling";

    }

    //Shop controller
    private boolean toegevoegd = false;

    @RequestMapping(value = "/webshop", method = RequestMethod.GET)
    public String listProduct(Model model, HttpServletRequest request, HttpServletResponse response) {
        model.addAttribute("productorder", new ProductOrder());
        model.addAttribute("product", new Product());
        model.addAttribute("listProduct", this.productService.listProduct());
        model.addAttribute("categorie", new Categorie());
        model.addAttribute("listCategorie", this.CategorieService.listCategorie());
        model.addAttribute("melding", toegevoegd);
        this.toegevoegd = false;
        return "shop";
    }

    @RequestMapping("webshop/{id}")
    public String listProductByCategorie(@PathVariable("id") int id, Model model, Model categorie) {
        model.addAttribute("product", new Product());
        model.addAttribute("listProduct", this.productService.listProductByCategorie(id));
        categorie.addAttribute("categorie", new Categorie());
        categorie.addAttribute("listCategorie", this.CategorieService.listCategorie());
        return "shop";
    }

    @RequestMapping(value = "webshop/addtocart/{id}")
    public String addProductorder(@ModelAttribute("productorder") ProductOrder p, @PathVariable("id") int id, Product pr, HttpServletRequest request, HttpServletResponse response, Model model) throws Exception {

        Cookie cookie = null;
        Cookie[] cookies = null;
        cookies = request.getCookies();
        String sessieid = cookies[0].getValue();
        try {
            this.productorderService.addProductorder(p, id, sessieid);

            return "redirect:/webshop";
        } catch (Exception e) {

        }
        this.toegevoegd = true;
        return "redirect:/webshop";

    }

    //Contact pagina controller
    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String contactView() {
        return "contact";
    }

    //Betaald pagina controller
    @RequestMapping(value = "/betaling", method = RequestMethod.GET)
    public String betalingController() {
        return "betaling";
    }
}
