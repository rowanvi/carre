/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carre.controller.old;

import com.carre.model.ProductOrder;
import com.carre.service.ProductService;
import com.carre.service.ProductorderService;
import com.carre.service.WinkelwagenService;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Rowan
 */

public class FinancienController {

    private ProductorderService productorderService;
    private ProductService productService;
    private WinkelwagenService WinkelwagenService;

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

//    @RequestMapping(value = "/financien", method = RequestMethod.GET)
//    public String listFinancien(Model model, HttpServletRequest request, HttpServletResponse response) {
//        Cookie[] cookies = request.getCookies();
//        String sessieid = cookies[0].getValue();
//        try {
//            model.addAttribute("winkelwagen", this.WinkelwagenService);
//        } catch (Exception e) {
//
//        }
//        model.addAttribute("productorder", this.productorderService);
//        model.addAttribute("order", new ProductOrder());
//        model.addAttribute("product", this.productService);
//        return "financien";
//    }
}
