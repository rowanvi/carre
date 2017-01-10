/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carre.controller;

import com.carre.model.Catalogus;
import com.carre.model.Categorie;
import com.carre.model.Product;
import com.carre.model.ProductOrder;
import com.carre.model.Users;
import com.carre.model.Voorstelling;
import com.carre.model.Winkelwagen;
import com.carre.service.CatalogusService;
import com.carre.service.CategorieService;
import com.carre.service.ProductService;
import com.carre.service.ProductorderService;
import com.carre.service.UsersService;
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
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Rowan
 */
@Controller
public class AdminController {

    private ProductService productService;
    private CategorieService CategorieService;
    private CatalogusService CatalogusService;
    private ProductorderService productorderService;
    private WinkelwagenService WinkelwagenService;
    private VoorstellingService VoorstellingService;
    private UsersService UsersService;

    @Autowired(required = true)
    @Qualifier(value = "VoorstellingService")
    public void setVoorstellingService(VoorstellingService cs) {
        this.VoorstellingService = cs;
    }

    @Autowired(required = true)
    @Qualifier(value = "UsersService")
    public void setUsersService(UsersService cs) {
        this.UsersService = cs;
    }

    @Autowired(required = true)
    @Qualifier(value = "productorderService")
    public void setProductorderService(ProductorderService ps) {
        this.productorderService = ps;
    }

    @Autowired(required = true)
    @Qualifier(value = "WinkelwagenService")
    public void setWinkelwagenService(WinkelwagenService ps) {
        this.WinkelwagenService = ps;
    }

    @Autowired(required = true)
    @Qualifier(value = "CatalogusService")
    public void setCategorieService(CatalogusService cs) {
        this.CatalogusService = cs;
    }

    @Autowired(required = true)
    @Qualifier(value = "productService")
    public void setProductService(ProductService ps) {
        this.productService = ps;
    }

    @Autowired(required = true)
    @Qualifier(value = "CategorieService")
    public void setCategorieService(CategorieService ps) {
        this.CategorieService = ps;
    }

    //Login controller
    @RequestMapping(value = "/adminpaneel", method = RequestMethod.GET)
    public String dashboardRedirect(Model model, Users u) {
        model.addAttribute("users", new Users());
        return "admin/login";
    }

    //Login check controller
    @RequestMapping(value = "/admin/check", method = RequestMethod.POST)
    public String checkRedirect(HttpServletRequest request, @ModelAttribute("username") String username, @ModelAttribute("password") String password) {
        if (this.UsersService.userValidate(username, password)) {
            System.out.println("JA");
            return "admin/dashboard";
        } else {
            System.out.println("NEE");
            String referer = request.getHeader("Referer");
            return "redirect:" + referer;
        }

    }

    //Dashboard controller
    @RequestMapping(value = "admin/dashboard", method = RequestMethod.GET)
    public String dashboardController() {
        return "admin/dashboard";
    }

    //Lijst van producten
    @RequestMapping(value = "admin/productlist", method = RequestMethod.GET)
    public String listProductlist(Model model) {
        model.addAttribute("catalogus", this.CatalogusService);
        model.addAttribute("categorie", this.CategorieService);
        model.addAttribute("product", new Product());
        model.addAttribute("listProduct", this.productService.listProductAdmin());
        return "admin/productlist";
    }

    //Producten toevoegen en wijzigen
    @RequestMapping(value = "admin/addproduct", method = RequestMethod.GET)
    public String listProduct(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("listProduct", this.productService.listProduct());
        model.addAttribute("categorie", new Categorie());
        model.addAttribute("listCategorie", this.CategorieService.listCategorie());
        return "admin/addproduct";
    }

    //For add and update person both
    @RequestMapping(value = "admin/addproduct/add", method = RequestMethod.POST)
    public String addProduct(@ModelAttribute("product") Product p, Model model) {

        if (p.getId() == 0) {
            //new person, add it
            this.productService.addProduct(p);
        } else {
            //existing person, call update
            this.productService.updateProduct(p);
        }
        model.addAttribute("catalogus", this.CatalogusService);
        model.addAttribute("categorie", this.CategorieService);
        model.addAttribute("product", new Product());
        model.addAttribute("listProduct", this.productService.listProductAdmin());
        return "admin/productlist";

    }

    @RequestMapping("admin/addproduct/update/{id}")
    public String updateProduct(@PathVariable("id") int id, Model model) {
        model.addAttribute("product", this.productService.getProductById(id));
        model.addAttribute("listProduct", this.productService.listProduct());
        model.addAttribute("categorie", new Categorie());
        model.addAttribute("listCategorie", this.CategorieService.listCategorie());
        return "redirect: admin/productlist";
    }

    @RequestMapping("admin/addproduct/edit/{id}")
    public String editProduct(@PathVariable("id") int id, Model model) {
        model.addAttribute("product", this.productService.getProductById(id));
        model.addAttribute("listProduct", this.productService.listProduct());
        model.addAttribute("categorie", new Categorie());
        model.addAttribute("listCategorie", this.CategorieService.listCategorie());
        return "admin/addproduct";
    }

    //Catalogus controller
    @RequestMapping(value = "admin/catalogus", method = RequestMethod.GET)
    public String listCatalogus(Model model) {
        model.addAttribute("catalogus", new Catalogus());
        model.addAttribute("listCatalogus", this.CatalogusService.listCatalogus());
        return "admin/catalogus";
    }

    @RequestMapping(value = "admin/catalogus/add", method = RequestMethod.POST)
    public String addCatalogus(@ModelAttribute("catalogus") Catalogus c) {

        if (c.getId() == 0) {
            //new categorie, add it
            this.CatalogusService.addCatalogus(c);
        } else {
            //existing categorie, call update
            this.CatalogusService.updateCatalogus(c);
        }

        return "redirect:admin/catalogus";

    }

    @RequestMapping("admin/catalogus/edit/{id}")
    public String editCatalogus(@PathVariable("id") int id, Model model) {
        model.addAttribute("catalogus", this.CatalogusService.getCatalogusById(id));
        model.addAttribute("listCatalogus", this.CatalogusService.listCatalogus());
        return "admin/catalogus";
    }

    //Categorie controller
    @RequestMapping(value = "admin/categorie", method = RequestMethod.GET)
    public String listCategorie(Model model) {
        model.addAttribute("categorie", new Categorie());
        model.addAttribute("listCategorie", this.CategorieService.listCategorie());
        return "admin/categorie";
    }

    //For add and update categorie both
    @RequestMapping(value = "admin/categorie/add", method = RequestMethod.POST)
    public String addCategorie(HttpServletRequest request, @ModelAttribute("categorie") Categorie c) {

        if (c.getId() == 0) {
            //new categorie, add it
            this.CategorieService.addCategorie(c);
        } else {
            //existing categorie, call update
            this.CategorieService.updateCategorie(c);
        }

        String referer = request.getHeader("Referer");
        return "redirect:" + referer;

    }

    @RequestMapping("admin/categorie/edit/{id}")
    public String editCategorie(@PathVariable("id") int id, Model model) {
        model.addAttribute("categorie", this.CategorieService.getCategorieById(id));
        model.addAttribute("listCategorie", this.CategorieService.listCategorie());
        return "admin/categorie";
    }

    //Financien controller
    @RequestMapping(value = "admin/financien", method = RequestMethod.GET)
    public String listFinancien(Model model, HttpServletRequest request, HttpServletResponse response) {
        Cookie[] cookies = request.getCookies();
        String sessieid = cookies[0].getValue();
        try {
            model.addAttribute("winkelwagen", this.WinkelwagenService);
        } catch (Exception e) {

        }
        model.addAttribute("productorder", this.productorderService);
        model.addAttribute("order", new ProductOrder());
        model.addAttribute("product", this.productService);
        return "admin/financien";
    }

    //Order controller
    @RequestMapping(value = "admin/orders", method = RequestMethod.GET)
    public String listOrders(Model model) {
        model.addAttribute("productOrder", new ProductOrder());
        model.addAttribute("listProductorder", this.productorderService.listProductorder());
        model.addAttribute("product", this.productService);
        return "admin/orders";
    }

    @RequestMapping(value = "admin/orderlist", method = RequestMethod.GET)
    public String listOrderShow(Model model) {
        model.addAttribute("voorstelling", new Voorstelling());
        model.addAttribute("listVoorstelling", this.VoorstellingService.listVoorstellingAdmin());
        return "admin/orderlist";
    }

    @RequestMapping("admin/orderlist/shows/{id}")
    public String orderInformatie(@PathVariable("id") int id, Model model) {
        model.addAttribute("voorstelling", this.VoorstellingService.getVoorstellingById(id));
        model.addAttribute("listWinkelwagen", this.WinkelwagenService.listCartByVoorstellingId(id));
        model.addAttribute("productorder", this.productorderService);
        model.addAttribute("product", this.productService);
        return "admin/orderinfo";
    }

    @RequestMapping("admin/orderlist/shows/{id}/{wwid}/1")
    public String editVoorstellingStatusOpgehaald(HttpServletRequest request, @ModelAttribute("winkelwagen") Winkelwagen ww, @PathVariable("id") int id, @PathVariable("wwid") int winkelwagen, Model model) {
        try {
            this.WinkelwagenService.updateCartStatus(ww, 2, winkelwagen);
        } catch (Exception e) {

        }
        String referer = request.getHeader("Referer");
        return "redirect:" + referer;

    }

    @RequestMapping("admin/orderlist/shows/{id}/{wwid}/2")
    public String editVoorstellingStatusBetaald(HttpServletRequest request, @ModelAttribute("winkelwagen") Winkelwagen ww, @PathVariable("id") int id, @PathVariable("wwid") int winkelwagen, Model model) {
        try {
            this.WinkelwagenService.updateCartStatus(ww, 1, winkelwagen);
        } catch (Exception e) {

        }
        String referer = request.getHeader("Referer");
        return "redirect:" + referer;

    }

    //Voorstelling controller
    @RequestMapping(value = "admin/voorstelling", method = RequestMethod.GET)
    public String listVoorstelling(Model model) {
        model.addAttribute("voorstelling", new Voorstelling());
        model.addAttribute("listVoorstelling", this.VoorstellingService.listVoorstelling());
        return "admin/voorstelling";
    }

    //For add and update categorie both
    @RequestMapping(value = "admin/voorstelling/add", method = RequestMethod.POST)
    public String addVoorstelling(@ModelAttribute("voorstelling") Voorstelling c) {

        if (c.getId() == 0) {
            //new categorie, add it
            this.VoorstellingService.addVoorstelling(c);
        } else {
            //existing categorie, call update
            this.VoorstellingService.updateVoorstelling(c);
        }

        return "redirect: /";

    }

    @RequestMapping("admin/voorstelling/edit/{id}")
    public String editVoorstelling(@PathVariable("id") int id, Model model) {
        model.addAttribute("voorstelling", this.VoorstellingService.getVoorstellingById(id));
        model.addAttribute("listVoorstelling", this.VoorstellingService.listVoorstelling());
        return "admin/voorstelling";
    }

    //users
    @RequestMapping(value = "admin/users", method = RequestMethod.GET)
    public String listUsers(Model model) {
        model.addAttribute("users", new Users());
        model.addAttribute("listUsers", this.UsersService.listUsers());
        return "admin/users";
    }

    //For add and update categorie both
    @RequestMapping(value = "admin/users/add", method = RequestMethod.POST)
    public String addUsers(HttpServletRequest request, @ModelAttribute("users") Users c) {

        if (c.getId() == 0) {
            //new categorie, add it
            this.UsersService.addUsers(c);
        } else {
            //existing categorie, call update
            this.UsersService.updateUsers(c);
        }

        String referer = request.getHeader("Referer");
        return "redirect:" + referer;

    }

    @RequestMapping("admin/users/edit/{id}")
    public String editUsers(@PathVariable("id") int id, Model model) {
        model.addAttribute("users", this.UsersService.getUsersById(id));
        model.addAttribute("listUsers", this.UsersService.listUsers());
        return "admin/users";
    }
}
