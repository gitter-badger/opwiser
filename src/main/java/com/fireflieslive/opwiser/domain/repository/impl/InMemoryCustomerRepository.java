package com.fireflieslive.opwiser.domain.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.fireflieslive.opwiser.domain.Customer;
import com.fireflieslive.opwiser.domain.Product;
import com.fireflieslive.opwiser.domain.repository.CustomerRepository;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {

	private List<Customer> listOfCustomers = new ArrayList<Customer>();

	public InMemoryCustomerRepository() {
		Customer lem = new Customer("0011", "lemuel nabong");
		lem.setAddress("dau, mabalacat, pampanga");
		lem.setNoOfOrdersMade(4000);
		
		Customer zel = new Customer("0022", "hazelrose tiongson");
		lem.setAddress("sta. lucia, magalang pamanga");
		lem.setNoOfOrdersMade(4000);
		
		Customer abc = new Customer("0033", "ava sy");
		lem.setAddress("mauaque, mabalacat, pamapanga");
		lem.setNoOfOrdersMade(5000);
		
		listOfCustomers.add(lem);
		listOfCustomers.add(zel);
		listOfCustomers.add(abc);
	}
	
	public Customer getCustomerById(String productId) {
		Customer customerById = null;
		for (Customer customer : listOfCustomers) {
			if (customer != null && customer.getCustomerId() != null && customer.getCustomerId().equals(productId)) {
				customerById = customer;
				break;
			}
		}
		if (customerById == null) {
			throw new IllegalArgumentException("No products found with the product id: " + productId);
		}
		return customerById;
	}

	public List<Customer> getAllCustomers() {
		return listOfCustomers;
	}

}
