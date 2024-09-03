package com.aws_springboot.webservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aws_springboot.webservice.entities.Category;
import com.aws_springboot.webservice.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public List<Category> findAll() {
		List<Category> list = categoryRepository.findAll();
		return list;
	}
	
	public Category findById(Integer id) {
		Category obj = categoryRepository.findById(id).get();
		return obj;
	}
	
}
