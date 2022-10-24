package com.shope.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/product")
public class ProductController {
	
	@GetMapping("/get-all")
	public String getAllProducts() {
		return "get all product";
	}
	
	@GetMapping("/get-one")
	public String getOneProduct() {
		return "get one product";
	}
	
	

}
