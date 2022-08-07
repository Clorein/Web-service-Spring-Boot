package com.springestudo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springestudo.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
