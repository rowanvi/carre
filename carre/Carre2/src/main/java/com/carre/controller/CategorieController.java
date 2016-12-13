
package com.carre.controller;
import com.carre.model.Categorie;
import com.carre.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class CategorieController {
	
	private CategorieService CategorieService;
	
	@Autowired(required=true)
	@Qualifier(value="CategorieService")
	public void setCategorieService(CategorieService cs){
		this.CategorieService = cs;
	}
	
	@RequestMapping(value = "/categorie", method = RequestMethod.GET)
	public String listCategorie(Model model) {
		model.addAttribute("categorie", new Categorie ());
		model.addAttribute("listCategorie", this.CategorieService.listCategorie());
		return "categorie";
	}
	
	//For add and update categorie both
	@RequestMapping(value= "/categorie/add", method = RequestMethod.POST)
	public String addCategorie(@ModelAttribute("categorie") Categorie c){
		
		if(c.getId() == 0){
			//new categorie, add it
			this.CategorieService.addCategorie(c);
		}else{
			//existing categorie, call update
			this.CategorieService.updateCategorie(c);
		}
		
		return "redirect:/categorie";
		
	}
	
 
    @RequestMapping("categorie/edit/{id}")
    public String editCategorie(@PathVariable("id") int id, Model model){
        model.addAttribute("categorie", this.CategorieService.getCategorieById(id));
        model.addAttribute("listCategorie", this.CategorieService.listCategorie());
        return "categorie";
    }
	
}