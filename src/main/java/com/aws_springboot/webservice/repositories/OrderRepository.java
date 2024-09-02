package com.aws_springboot.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aws_springboot.webservice.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
