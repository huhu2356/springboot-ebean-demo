package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Customer;

import io.ebean.EbeanServer;

@Service
public class CustomerService {

	@Autowired
	EbeanServer server;
		
	public List<Customer> getCustomer() {
		return server.find(Customer.class).findList();
	}
	
}
