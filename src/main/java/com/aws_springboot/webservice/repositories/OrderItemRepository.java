package com.aws_springboot.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aws_springboot.webservice.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {

}
