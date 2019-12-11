package it.challange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.fasterxml.jackson.core.JsonProcessingException;

import it.challange.model.Product;
import it.challange.service.ProductService;

@Controller
public class WebController {

	@Autowired
	ProductService productService;

	@GetMapping("/products")
	public String listPage(Model model) {
		model.addAttribute("products", productService.getAllProducts());
		return "products/list";
	}

	@GetMapping("/products/add/page")
	public String addPage(Model model) {
		model.addAttribute("product", new Product());
		return "products/add";
	}

	@PostMapping("/products/add/action")
	public String addPageAction(@ModelAttribute("product") Product product, Model model) {
		try {
			productService.addProduct(product);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		model.addAttribute("products", productService.getAllProducts());
		return "products/list";
	}
}
