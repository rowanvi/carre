/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carre.controller.old;

import com.carre.model.Categorie;
import com.carre.model.Product;
import com.carre.model.ProductOrder;
import com.carre.service.CategorieService;
import com.carre.service.ProductService;
import com.carre.service.ProductorderService;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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

public class ShopController {

    private ProductService productService;
    private CategorieService CategorieService;
    private ProductorderService productorderService;
    private static boolean toegevoegd = false;

    @Autowired(required = true)
    @Qualifier(value = "productService")
    public void setProductService(ProductService ps) {
        this.productService = ps;
    }

    @Autowired(required = true)
    @Qualifier(value = "productorderService")
    public void setProductService(ProductorderService ps) {
        this.productorderService = ps;
    }

    @Autowired(required = true)
    @Qualifier(value = "CategorieService")
    public void setCategorieService(CategorieService cs) {
        this.CategorieService = cs;
    }

//    @RequestMapping(value = "/webshop", method = RequestMethod.GET)
//    public String listProduct(Model model, HttpServletRequest request, HttpServletResponse response) {
//        model.addAttribute("productorder", new ProductOrder());
//        model.addAttribute("product", new Product());
//        model.addAttribute("listProduct", this.productService.listProduct());
//        model.addAttribute("categorie", new Categorie());
//        model.addAttribute("listCategorie", this.CategorieService.listCategorie());
//        model.addAttribute("melding", toegevoegd);
//        this.toegevoegd = false;
//        return "shop";
//    }
//
//    @RequestMapping("webshop/{id}")
//    public String listProductByCategorie(@PathVariable("id") int id, Model model, Model categorie) {
//        model.addAttribute("product", new Product());
//        model.addAttribute("listProduct", this.productService.listProductByCategorie(id));
//        categorie.addAttribute("categorie", new Categorie());
//        categorie.addAttribute("listCategorie", this.CategorieService.listCategorie());
//        return "shop";
//    }
//
//    @RequestMapping(value = "webshop/addtocart/{id}")
//    public String addProductorder(@ModelAttribute("productorder") ProductOrder p, @PathVariable("id") int id, Product pr, HttpServletRequest request, HttpServletResponse response, Model model) throws Exception {
//
//        Cookie cookie = null;
//        Cookie[] cookies = null;
//        cookies = request.getCookies();
//        String sessieid = cookies[0].getValue();
//        try {
//            this.productorderService.addProductorder(p, id, sessieid);
//            
//            return "redirect:/webshop";
//        } catch (Exception e) {
//
//        }
//        this.toegevoegd = true;
//        return "redirect:/webshop";
//
//    }

}
