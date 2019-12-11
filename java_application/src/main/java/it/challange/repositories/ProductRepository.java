package it.challange.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.challange.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{

}
