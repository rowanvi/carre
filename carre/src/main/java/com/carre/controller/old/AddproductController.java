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

public class AddproductController {

//    private ProductService productService;
//
//    private CategorieService CategorieService;
//
//    @Autowired(required = true)
//    @Qualifier(value = "productService")
//    public void setProductService(ProductService ps) {
//        this.productService = ps;
//    }
//
//    @Autowired(required = true)
//    @Qualifier(value = "CategorieService")
//    public void setCategorieService(CategorieService ps) {
//        this.CategorieService = ps;
//    }
//
//    @RequestMapping(value = "/addproduct", method = RequestMethod.GET)
//    public String listProduct(Model model) {
//        model.addAttribute("product", new Product());
//        model.addAttribute("listProduct", this.productService.listProduct());
//        model.addAttribute("categorie", new Categorie());
//        model.addAttribute("listCategorie", this.CategorieService.listCategorie());
//        return "addproduct";
//    }
//
//    //For add and update person both
//    @RequestMapping(value = "/addproduct/add", method = RequestMethod.POST)
//    public String addProduct(@ModelAttribute("product") Product p) {
//
//        if (p.getId() == 0) {
//            //new person, add it
//            this.productService.addProduct(p);
//        } else {
//            //existing person, call update
//            this.productService.updateProduct(p);
//        }
//
//        return "redirect:/productlist";
//
//    }
//
//    @RequestMapping("addproduct/update/{id}")
//    public String updateProduct(@PathVariable("id") int id, Model model) {
//        model.addAttribute("product", this.productService.getProductById(id));
//        model.addAttribute("listProduct", this.productService.listProduct());
//        model.addAttribute("categorie", new Categorie());
//        model.addAttribute("listCategorie", this.CategorieService.listCategorie());
//        return "productlist";
//    }
//
//    @RequestMapping("addproduct/edit/{id}")
//    public String editProduct(@PathVariable("id") int id, Model model) {
//        model.addAttribute("product", this.productService.getProductById(id));
//        model.addAttribute("listProduct", this.productService.listProduct());
//        model.addAttribute("categorie", new Categorie());
//        model.addAttribute("listCategorie", this.CategorieService.listCategorie());
//        return "addproduct";
//    }

}
