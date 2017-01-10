package com.carre.controller.old;

import com.carre.model.ProductOrder;
import com.carre.model.Voorstelling;
import com.carre.model.Winkelwagen;
import com.carre.service.ProductService;
import com.carre.service.ProductorderService;
import com.carre.service.VoorstellingService;
import com.carre.service.WinkelwagenService;
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

public class OrderController {

    private ProductorderService productorderService;
    private ProductService productService;
    private VoorstellingService voorstellingService;
    private WinkelwagenService WinkelwagenService;

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
    @Qualifier(value = "VoorstellingService")
    public void setVoorstellingService(VoorstellingService ps) {
        this.voorstellingService = ps;
    }

    @Autowired(required = true)
    @Qualifier(value = "WinkelwagenService")
    public void setWinkelwagenService(WinkelwagenService ps) {
        this.WinkelwagenService = ps;
    }

//    @RequestMapping(value = "/orders", method = RequestMethod.GET)
//    public String listOrders(Model model) {
//        model.addAttribute("productOrder", new ProductOrder());
//        model.addAttribute("listProductorder", this.productorderService.listProductorder());
//        model.addAttribute("product", this.productService);
//        return "orders";
//    }
//
//    @RequestMapping(value = "/orderlist", method = RequestMethod.GET)
//    public String listOrderShow(Model model) {
//        model.addAttribute("voorstelling", new Voorstelling());
//        model.addAttribute("listVoorstelling", this.voorstellingService.listVoorstellingAdmin());
//        return "orderlist";
//    }
//
//    @RequestMapping("/orderlist/shows/{id}")
//    public String orderInformatie(@PathVariable("id") int id, Model model) {
//        model.addAttribute("voorstelling", this.voorstellingService.getVoorstellingById(id));
//        model.addAttribute("listWinkelwagen", this.WinkelwagenService.listCartByVoorstellingId(id));
//        model.addAttribute("productorder", this.productorderService);
//        model.addAttribute("product", this.productService);
//        return "orderinfo";
//    }
//
//    @RequestMapping("/orderlist/shows/{id}/{wwid}/1")
//    public String editVoorstellingStatusOpgehaald(@ModelAttribute("winkelwagen") Winkelwagen ww, @PathVariable("id") int id, @PathVariable("wwid") int winkelwagen, Model model) {
//        try {
//            this.WinkelwagenService.updateCartStatus(ww, 2, winkelwagen);
//        } catch (Exception e) {
//
//        }
//        return "redirect:/orderlist/shows/{id}";
//
//    }
//
//    @RequestMapping("/orderlist/shows/{id}/{wwid}/2")
//    public String editVoorstellingStatusBetaald(@ModelAttribute("winkelwagen") Winkelwagen ww, @PathVariable("id") int id, @PathVariable("wwid") int winkelwagen, Model model) {
//        try {
//            this.WinkelwagenService.updateCartStatus(ww, 1, winkelwagen);
//        } catch (Exception e) {
//
//        }
//        return "redirect:/orderlist/shows/{id}";
//
//    }
}
