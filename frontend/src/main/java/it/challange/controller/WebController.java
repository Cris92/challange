package it.challange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import it.challange.service.ProductService;

@Controller
public class WebController {

	@Autowired
	ProductService productService;

	@GetMapping("/products")
	public String mainWithParam(Model model) {
		model.addAttribute("products", productService.getAllProducts());
		return "products/list";
	}

}
