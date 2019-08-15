package br.com.lassulfi.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import br.com.lassulfi.domain.Product;

public interface ProductService {

	Product save(Product product);
	
	void delete(Product product);
	
	Product findById(String productId);
	
	List<Product> findAll();
	
	Page<Product> findByManufacturer(String manufacturer, PageRequest pageRequest);
	
	List<Product> findByTitle(String title);
}
