package com.aws_springboot.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aws_springboot.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
