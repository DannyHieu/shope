package com.shope.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shope.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String>{

	

}
