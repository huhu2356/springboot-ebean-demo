package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.domain.Customer;
import com.example.demo.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/customer")
	@ResponseBody
	public List<Customer> getContent() {
        return customerService.getCustomer();
    }
	
	@RequestMapping("/hello")
	@ResponseBody
	public String index() {
		return "Hello World";
	}
}
