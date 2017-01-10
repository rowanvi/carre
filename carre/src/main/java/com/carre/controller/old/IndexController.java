/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carre.controller.old;

import com.carre.model.Categorie;
import com.carre.model.Product;
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

public class IndexController {

//    private ProductService productService;
//    
//    @Autowired(required = true)
//    @Qualifier(value = "productService")
//    public void setProductService(ProductService ps) {
//        this.productService = ps;
//    }
//
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String listProductIndex(Model model) {
//        model.addAttribute("product", new Product());
//        model.addAttribute("listProductIndex", this.productService.listProductIndex());
//        return "index";
//    }
}
