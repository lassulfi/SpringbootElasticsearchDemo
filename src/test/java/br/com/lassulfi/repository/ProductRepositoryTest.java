package br.com.lassulfi.repository;

import java.util.Optional;
import java.util.UUID;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.lassulfi.domain.Product;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class ProductRepositoryTest {
	
	@Autowired
	private ProductRepository productRepository;
	
	private static final String PRODUCT_ID = UUID.randomUUID().toString();
	private static final String PRODUCT_DESCRIPTION = "product descripion";
			
	@Before	
	public void init() {
		Product product = this.productRepository.save(this.getProduct());
	}
	
	@Before
	public void tearDown() {
		this.productRepository.deleteAll();
	}
	
	@Test
	public void mustFindProductById() {
		Optional<Product> product = this.productRepository.findById(PRODUCT_ID);
		
		Assert.assertThat(product.get().getDescription(), Matchers.is(PRODUCT_DESCRIPTION));
	}

	private Product getProduct() {
		return new Product(PRODUCT_ID, PRODUCT_DESCRIPTION, "product manufacturer", 300.0d);
	}

}
