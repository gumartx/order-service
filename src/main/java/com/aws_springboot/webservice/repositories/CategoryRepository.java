package com.aws_springboot.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aws_springboot.webservice.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
