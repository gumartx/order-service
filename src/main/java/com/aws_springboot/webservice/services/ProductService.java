package com.aws_springboot.webservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aws_springboot.webservice.entities.Product;
import com.aws_springboot.webservice.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> findAll() {
		List<Product> list = productRepository.findAll();
		return list;
	}
	
	public Product findById(Integer id) {
		Product obj = productRepository.findById(id).get();
		return obj;
	}
	
}
