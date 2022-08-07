package com.springestudo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springestudo.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
}
