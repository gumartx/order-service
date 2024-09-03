package com.aws_springboot.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aws_springboot.webservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
