package com.fireflieslive.opwiser.domain.repository;

import java.util.List;

import com.fireflieslive.opwiser.domain.Product;

public interface ProductRepository {
	List<Product> getAllProducts();
	
	Product getProductById( String productID );
}
