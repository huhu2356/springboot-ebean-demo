package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.Customer;

public interface CustomerService {

	List<Customer> customerList();
	
	Customer findOne(Long id);
	
	String addCustomer(Customer customer);
	
	String updateCustomer(Customer customer);
	
	String deleteCustomer(Long id);
	
}
