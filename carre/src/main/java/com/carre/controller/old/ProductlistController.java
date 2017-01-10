/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carre.controller.old;

import com.carre.model.Catalogus;
import com.carre.model.Categorie;
import com.carre.model.Product;
import com.carre.service.CatalogusService;
import com.carre.service.CategorieService;
import com.carre.service.ProductService;
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

public class ProductlistController {

    private ProductService productService;
    private CategorieService CategorieService;
    private CatalogusService CatalogusService;

    @Autowired(required = true)
    @Qualifier(value = "productService")
    public void setProductService(ProductService ps) {
        this.productService = ps;
    }
        @Autowired(required = true)
    @Qualifier(value = "CatalogusService")
    public void setCatalogusService(CatalogusService cas) {
        this.CatalogusService = cas;
    }

        @Autowired(required = true)
    @Qualifier(value = "CategorieService")
    public void setCategorieService(CategorieService cs) {
        this.CategorieService = cs;
    }


//    @RequestMapping(value = "/productlist", method = RequestMethod.GET)
//    public String listProduct(Model model) {
//        model.addAttribute("catalogus", this.CatalogusService);
//        model.addAttribute("categorie", this.CategorieService);
//        model.addAttribute("product", new Product());
//        model.addAttribute("listProduct", this.productService.listProductAdmin());
//        return "productlist";
//    }

}
