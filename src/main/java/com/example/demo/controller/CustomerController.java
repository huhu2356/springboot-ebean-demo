package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.domain.Customer;
import com.example.demo.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/list")
	@ResponseBody
	public List<Customer> customerList() {
        return customerService.customerList();
    }
	
	@RequestMapping("/list/{id}")
	@ResponseBody
	public Customer findOne(@PathVariable Long id) {
		return customerService.findOne(id);
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public String addCustomer(@RequestBody Customer customer) {
		return customerService.addCustomer(customer);
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public String updateCustomer(@RequestBody Customer customer) {
		return customerService.updateCustomer(customer);
	}
	
	@RequestMapping("/delete/{id}")
	@ResponseBody
	public String addCustomer(@PathVariable Long id) {
		return customerService.deleteCustomer(id);
	}
	
	@RequestMapping("/hello")
	@ResponseBody
	public String index() {
		return "Hello World";
	}
}
