/*
 * first controller  
 */
package controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/**
 *
 * @author pieterleek
 */

@Controller
public class welcomeController {
    
    @GetMapping("")
	
        public String hello(Model model) {

		model.addAttribute("message", "Welcome to Spring");

		return "welcome";
	}
    
}
