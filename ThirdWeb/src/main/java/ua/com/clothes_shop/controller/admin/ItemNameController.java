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

import ua.com.clothes_shop.entity.ItemName;
import ua.com.clothes_shop.service.ItemNameService;
import ua.com.clothes_shop.validator.ItemNameValidator;

@Controller
@RequestMapping("/admin/itemName")
@SessionAttributes("itemName")
public class ItemNameController {
	
	@Autowired
	private ItemNameService itemNameService;
	
	@InitBinder("itemName")
	protected void bind(WebDataBinder binder){
		binder.setValidator(new ItemNameValidator(itemNameService));
	}
	
	@ModelAttribute("itemName")
	public ItemName getForm(){
		return new ItemName();
	}
	
	@RequestMapping
	public String show(Model model){
		model.addAttribute("itemNames", itemNameService.findAll());
		return "admin-itemName";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable int id, Model model){
		model.addAttribute("itemName", itemNameService.findOne(id));
		return show(model);
	}

		@RequestMapping("/delete/{id}")
		public String delete(@PathVariable int id){
			itemNameService.delete(id);
			return "redirect:/admin/itemName";
		}
		
		
		@PostMapping
		public String save(@ModelAttribute("itemName")  @Valid ItemName itemName, BindingResult br, Model model, SessionStatus status){
			if(br.hasErrors()) return show(model);
			itemNameService.save(itemName);
			status.setComplete();
			return "redirect:/admin/itemName";
		}
		
//				@RequestMapping(method=POST)
//				public String save(@RequestParam String name){
//					ItemName itemName = new ItemName();
//					itemName.setName(name);
//					itemNameService.save(itemName);
//					return "redirect:/admin/itemName";
//				}



}
