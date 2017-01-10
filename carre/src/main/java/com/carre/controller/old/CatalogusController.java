
package com.carre.controller.old;
import com.carre.model.Catalogus;
import com.carre.service.CatalogusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




public class CatalogusController {
	
//	private CatalogusService CatalogusService;
//	
//	@Autowired(required=true)
//	@Qualifier(value="CatalogusService")
//	public void setCategorieService(CatalogusService cs){
//		this.CatalogusService = cs;
//	}
//	
//	@RequestMapping(value = "/catalogus", method = RequestMethod.GET)
//	public String listCatalogus(Model model) {
//		model.addAttribute("catalogus", new Catalogus ());
//		model.addAttribute("listCatalogus", this.CatalogusService.listCatalogus());
//		return "catalogus";
//	}
//	
//	//For add and update categorie both
//	@RequestMapping(value= "/catalogus/add", method = RequestMethod.POST)
//	public String addCatalogus(@ModelAttribute("catalogus") Catalogus c){
//		
//		if(c.getId() == 0){
//			//new categorie, add it
//			this.CatalogusService.addCatalogus(c);
//		}else{
//			//existing categorie, call update
//			this.CatalogusService.updateCatalogus(c);
//		}
//		
//		return "redirect:/catalogus";
//		
//	}
//	
// 
//    @RequestMapping("catalogus/edit/{id}")
//    public String editCatalogus(@PathVariable("id") int id, Model model){
//        model.addAttribute("catalogus", this.CatalogusService.getCatalogusById(id));
//        model.addAttribute("listCatalogus", this.CatalogusService.listCatalogus());
//        return "catalogus";
//    }
	
}