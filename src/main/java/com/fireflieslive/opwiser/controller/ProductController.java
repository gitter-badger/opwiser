package com.fireflieslive.opwiser.controller;

import java.math.BigDecimal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fireflieslive.opwiser.domain.Product;

@Controller
public class ProductController {

	@RequestMapping( "/products" )
	public String list( Model model ) {
		Product iphone = new Product( "P1234", "Iphone 5s", new BigDecimal( 500 ));
		iphone.setDescription( "Apple iPhone 5s smartphone with 4.00-inch 640X390 display and 8-megapixel rear camera" );
		iphone.setCategory( "Smart Phone" );
		iphone.setManufacturer( "Apple" );
		iphone.setUnitsInStock( 1000 );
		
		model.addAttribute( "product", iphone );
		
		return "products";
	}
}
