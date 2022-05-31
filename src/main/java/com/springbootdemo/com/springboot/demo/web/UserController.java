package com.springbootdemo.com.springboot.demo.web;

import java.util.Date;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user", method = RequestMethod.GET)
public class UserController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHello() {
		return "<h1>hello there</h1>";
	}

	@RequestMapping(value = "/{userID}", method = RequestMethod.GET)
	public String getUser(@PathVariable String userID) {
		return "User Found : " + userID;
	}

	@RequestMapping(value = "/{userID}/invoices", method = RequestMethod.GET)
	public String getUserInvoice(@PathVariable String userID, @RequestParam(value = "date", required = false) Date date) {
		return "Invoice found for User is : " + userID + " on this date : " + date;
	}
	
	@RequestMapping(value = "/{id}/invoices1", method = RequestMethod.GET)
	public int getUserInvoiceNumber(@PathVariable int id) {
		return  id;
	}

}
