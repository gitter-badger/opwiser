package com.fireflieslive.opwiser.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fireflieslive.opwiser.domain.Product;
import com.fireflieslive.opwiser.domain.repository.ProductRepository;
import com.fireflieslive.opwiser.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getAllProducts() {
		return productRepository.getAllProducts();
	}

}
