package com.receipt.hoppers;

import org.springframework.stereotype.Controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class Hoppers {
	@RequestMapping("/")
	public String index(Model model) {
		String name ="Grace Hopper";
		String itemname="Copper wire";
		double price =5.25;
		String description = "Metal strips, also an illustration of nanoseconds.";
		String vendor = "Little Things Corner Store";
		model.addAttribute("name_render", name);
		model.addAttribute("itemname_render", itemname);
		model.addAttribute("price_render", price);
		model.addAttribute("description_render", description);
		model.addAttribute("vendor_render", vendor);

		return "index.jsp";
				
}
	

}
