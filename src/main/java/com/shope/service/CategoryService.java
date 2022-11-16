package com.shope.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shope.model.Category;
import com.shope.repository.CategoryRepository;
import com.shope.utils.GenerateAlphaNumberString;



@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepo;
	
	public List<Category> getAllCategory() {
		List<Category> list =  categoryRepo.findAll();
		System.out.println(GenerateAlphaNumberString.getAlphaNumericString(6));
		return list;
	}

}
