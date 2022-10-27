package com.shope.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shope.model.Product;
import com.shope.service.ProductService;

@RestController
@RequestMapping("api/v1/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/get-all")
	public List<Product> getAllProducts() {
		
		return productService.getAllProduct();
	}
	
	@GetMapping("/get-one")
	public String getOneProduct() {
		return "get one product";
	}
	
	

}
