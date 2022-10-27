package com.shope.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shope.model.Category;
import com.shope.model.Product;
import com.shope.service.CategoryService;

@RestController
@RequestMapping("api/v1/category")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/get-all")
	public List<Category> getAllProducts() {
		
		return categoryService.getAllCategory();
	}

}
