package it.challange.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import it.challange.model.Product;

@Service
public class ProductService {

	@Value("${host.default}")
	private String defaultHost;
	
//	private String restHost = StringUtils.isEmpty(System.getenv("REST_API_HOST")) ? defaultHost
//			: System.getenv("REST_API_HOST");

	@GetMapping("/products")
	public List<Product> getAllProducts() {
		String restHost="78.31.65.58:8020";
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<List<Product>> response = restTemplate.exchange("http://" + restHost + "/products/",
				HttpMethod.GET, null, new ParameterizedTypeReference<List<Product>>() {
				});
		List<Product> products = response.getBody();
		return products;

	}
}
