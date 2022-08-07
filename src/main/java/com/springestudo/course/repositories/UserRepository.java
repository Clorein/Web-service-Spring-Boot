package com.springestudo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springestudo.course.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{

	
}
