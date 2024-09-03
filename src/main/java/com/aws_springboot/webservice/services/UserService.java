package com.aws_springboot.webservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aws_springboot.webservice.entities.User;
import com.aws_springboot.webservice.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll() {
		List<User> list = userRepository.findAll();
		return list;
	}
	
	public User findById(Integer id) {
		User obj = userRepository.findById(id).get();
		return obj;
	}
	
	public User insert(User obj) {
		return userRepository.save(obj);
	}

	public void delete(Integer id) {
		userRepository.deleteById(id);
	}
	
	public User update(Integer id, User obj) {
		User entity = userRepository.getReferenceById(id);
		updateData(entity, obj);
		entity = userRepository.save(entity);
		return entity;
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
	
}
