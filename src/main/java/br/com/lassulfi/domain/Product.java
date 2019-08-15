package br.com.lassulfi.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName="elasticdemo", type="products")
public class Product {
	
	@Id
	private String productId;
	private String description;
	private String manufacturer;
	private Double price;
			
	public Product() {
		super();
	}

	public Product(String productId, String description, String manufacturer, Double price) {
		super();
		this.productId = productId;
		this.description = description;
		this.manufacturer = manufacturer;
		this.price = price;
	}


	public String getProductId() {
		return productId;
	}


	public void setProductId(String productId) {
		this.productId = productId;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getManufacturer() {
		return manufacturer;
	}


	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [productId=");
		builder.append(productId);
		builder.append(", description=");
		builder.append(description);
		builder.append(", manufacture=");
		builder.append(manufacturer);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}
}
