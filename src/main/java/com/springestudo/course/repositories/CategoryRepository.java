package com.springestudo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springestudo.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
