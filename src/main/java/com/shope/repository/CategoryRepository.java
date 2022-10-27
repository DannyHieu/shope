package com.shope.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shope.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, String>{

	

}
