package br.com.lassulfi.service.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import br.com.lassulfi.domain.Product;
import br.com.lassulfi.service.ProductService;

public class ProductServiceImpl implements ProductService {
		
	@Override
	public Product save(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Product findById(String productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Product> findByManufacturer(String manufacturer, PageRequest pageRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

}
