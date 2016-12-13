
package com.carre.controller;
import com.carre.model.Voorstelling;
import com.carre.service.VoorstellingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class VoorstellingController {
	
	private VoorstellingService VoorstellingService;
	
	@Autowired(required=true)
	@Qualifier(value="VoorstellingService")
	public void setVoorstellingService(VoorstellingService cs){
		this.VoorstellingService = cs;
	}
	
	@RequestMapping(value = "/voorstelling", method = RequestMethod.GET)
	public String listVoorstelling(Model model) {
		model.addAttribute("voorstelling", new Voorstelling ());
		model.addAttribute("listVoorstelling", this.VoorstellingService.listVoorstelling());
		return "voorstelling";
	}
	
	//For add and update categorie both
	@RequestMapping(value= "/voorstelling/add", method = RequestMethod.POST)
	public String addVoorstelling(@ModelAttribute("voorstelling") Voorstelling c){
		
		if(c.getId() == 0){
			//new categorie, add it
			this.VoorstellingService.addVoorstelling(c);
		}else{
			//existing categorie, call update
			this.VoorstellingService.updateVoorstelling(c);
		}
		
		return "redirect:/voorstelling";
		
	}
	
 
    @RequestMapping("voorstelling/edit/{id}")
    public String editVoorstelling(@PathVariable("id") int id, Model model){
        model.addAttribute("voorstelling", this.VoorstellingService.getVoorstellingById(id));
        model.addAttribute("listVoorstelling", this.VoorstellingService.listVoorstelling());
        return "voorstelling";
    }
	
}