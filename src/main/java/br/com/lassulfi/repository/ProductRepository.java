package br.com.lassulfi.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import br.com.lassulfi.domain.Product;

public interface ProductRepository extends ElasticsearchRepository<Product, String> {

	Page<Product> findByManufacturer(String manufacturer, Pageable pageable);
	
	List<Product> findByDescription(String description);
}
