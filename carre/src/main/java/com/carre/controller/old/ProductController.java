package com.carre.controller.old;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.carre.model.Product;
import com.carre.service.ProductService;


public class ProductController {
	
	private ProductService productService;
	
	@Autowired(required=true)
	@Qualifier(value="productService")
	public void setProductService(ProductService ps){
		this.productService = ps;
	}
	
//	@RequestMapping(value = "/products", method = RequestMethod.GET)
//	public String listProduct(Model model) {
//		model.addAttribute("product", new Product());
//		model.addAttribute("listProduct", this.productService.listProduct());
//		return "product";
//	}
//	
//	//For add and update person both
//	@RequestMapping(value= "/products/add", method = RequestMethod.POST)
//	public String addProduct(@ModelAttribute("product") Product p){
//		
//		if(p.getId() == 0){
//			//new person, add it
//			this.productService.addProduct(p);
//		}else{
//			//existing person, call update
//			this.productService.updateProduct(p);
//		}
//		
//		return "redirect:/products";
//		
//	}
//
// 
//    @RequestMapping("products/update/{id}")
//    public String updateProduct(@PathVariable("id") int id, Model model){
//        model.addAttribute("product", this.productService.getProductById(id));
//        model.addAttribute("listProduct", this.productService.listProduct());
//        return "product";
//    }
//    
//        @RequestMapping("products/edit/{id}")
//    public String editProduct(@PathVariable("id") int id, Model model){
//        model.addAttribute("product", this.productService.getProductById(id));
//        model.addAttribute("listProduct", this.productService.listProduct());
//        return "product";
//    }
}
