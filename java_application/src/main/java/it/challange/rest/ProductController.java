package it.challange.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.challange.models.Product;
import it.challange.repositories.ProductRepository;
import it.challange.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService ProductService;

	@GetMapping
	public List<Product> getAll() {
		return ProductService.getList();
	}

	@GetMapping("/{id}")
	public Product getById(@PathVariable("id") long id) {
		Optional<Product> p = ProductService.getById(id);
		if (p.isPresent()) {
			return p.get();
		} else {
			return null;
		}
	}

	@PostMapping
	public Product create(@RequestBody Product product) {
		return ProductService.create(product);
	}

	@PutMapping("/{id}")
	public Product update(@PathVariable("id") long id, @RequestBody Product product) {
		return ProductService.update(product);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") long id) {
		ProductService.delete(id);
	}

}
