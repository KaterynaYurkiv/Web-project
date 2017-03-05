package ua.com.clothes_shop.controller.admin;

//import static org.springframework.web.bind.annotation.RequestMethod.POST;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import ua.com.clothes_shop.entity.TypeOfClothing;
import ua.com.clothes_shop.service.TypeOfClothingService;
import ua.com.clothes_shop.validator.TypeOfClothingValidator;

@Controller
@RequestMapping("/admin/toc")
@SessionAttributes("toc")
public class TypeOfClothingController {
	
	@Autowired
	private TypeOfClothingService typeOfClothingService;
	
	@InitBinder("toc")
	protected void bind(WebDataBinder binder){
		binder.setValidator(new TypeOfClothingValidator(typeOfClothingService));
	}
	
	@ModelAttribute("toc")
	public TypeOfClothing getForm(){
		return new TypeOfClothing();
	}
	
	@RequestMapping
	public String show(Model model){
		model.addAttribute("typesOfClothing", typeOfClothingService.findAll());
		return "admin-typeOfClothing";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable int id, Model model){
		model.addAttribute("toc", typeOfClothingService.findOne(id));
		return show(model);
	}

		@RequestMapping("/delete/{id}")
		public String delete(@PathVariable int id){
			typeOfClothingService.delete(id);
			return "redirect:/admin/toc";
		}
		
		@PostMapping
		public String save(@ModelAttribute("toc") @Valid TypeOfClothing typeOfClothing, BindingResult br, Model model, SessionStatus status){
			if(br.hasErrors()) return show(model);
			typeOfClothingService.save(typeOfClothing);
			status.setComplete();
			return "redirect:/admin/toc";
		}
		
//		@RequestMapping(method=POST)
//		public String save(@RequestParam String itemType){
//			typeOfClothingService.save(itemType);
//			return "redirect:/admin/toc";
//		}

}
