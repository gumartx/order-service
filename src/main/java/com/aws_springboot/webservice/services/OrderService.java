package com.aws_springboot.webservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aws_springboot.webservice.entities.Order;
import com.aws_springboot.webservice.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> findAll() {
		List<Order> list = orderRepository.findAll();
		return list;
	}
	
	public Order findById(Integer id) {
		Order obj = orderRepository.findById(id).get();
		return obj;
	}
	
}
