package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Customer;
import com.example.demo.service.CustomerService;

import io.ebean.EbeanServer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	EbeanServer server;

	@Override
	public List<Customer> customerList() {
		return server.find(Customer.class).findList();
	}

	@Override
	public Customer findOne(Long id) {
		return server.find(Customer.class, id);
	}

	@Override
	public String addCustomer(Customer customer) {
		server.save(customer);
		return "{'message':'Customer add successfully.'}";
	}

	@Override
	public String updateCustomer(Customer customer) {
		server.update(customer);
		return "{'message':'Customer update successfully.'}";
	}
	
	@Override
	public String deleteCustomer(Long id) {
		server.delete(Customer.class, id);
		return "{'message':'Customer deleted successfully.'}";
	}

}
