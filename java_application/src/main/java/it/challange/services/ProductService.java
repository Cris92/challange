package it.challange.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.challange.models.Product;
import it.challange.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public void delete(long id) {
		productRepository.deleteById(id);
		
	}

	public Product update(Product product) {
		return productRepository.save(product);
	}

	public Product create(Product product) {
		return productRepository.save(product);
	}

	public Optional<Product> getById(long id) {
		return productRepository.findById(id);
	}

	public List<Product> getList() {
		return (List<Product>) productRepository.findAll();
	}

}
