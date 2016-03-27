package com.fireflieslive.opwiser.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fireflieslive.opwiser.domain.Customer;
import com.fireflieslive.opwiser.domain.repository.CustomerRepository;
import com.fireflieslive.opwiser.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> getAllCustomers() {
		return customerRepository.getAllCustomers();
	}
}
