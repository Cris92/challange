package it.challange.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;

import it.challange.model.Product;

@Service
public class ProductService {

	@Value("${host.default}")
	private String defaultHost;

//	private String restHost = StringUtils.isEmpty(System.getenv("REST_API_HOST")) ? defaultHost
//			: System.getenv("REST_API_HOST");

	public List<Product> getAllProducts() {
		String restHost = "rest_challange:8020";
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<List<Product>> response = restTemplate.exchange("http://" + restHost + "/products/",
				HttpMethod.GET, null, new ParameterizedTypeReference<List<Product>>() {
				});
		List<Product> products = response.getBody();
		return products;

	}

	public void addProduct(Product product) throws JsonProcessingException {
		String restHost = "rest_challange:8020";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Authorization", "Basic " + "xxxxxxxxxxxx");
		HttpEntity<String> entity = new HttpEntity<String>(product.toString(), headers);
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		restTemplate.getMessageConverters().add(new StringHttpMessageConverter());
		ResponseEntity<String> response = restTemplate.exchange("http://" + restHost + "/products/", HttpMethod.POST,
				entity, String.class);
	}

}
