/*
 * first controller  
 */
package Carre.controller;


import Carre.model.Gebruiker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import Carre.DAO.GebruikerDao;


/**
 *
 * @author pieterleek
 */

@Controller
public class welcomeController {
    
    @Autowired
    GebruikerDao Gebruiker;
    
    @RequestMapping("/")
	
        public ModelAndView hello() {

            Gebruiker.persist(new Gebruiker());
		//model.addAttribute("message", "Welcome to Spring");
                //model.addAttribute("test", "Welcome test");

            ModelAndView model = new ModelAndView("index");
            
            model.addObject("user", Gebruiker.getALL());
            return model;

	}
    
}
