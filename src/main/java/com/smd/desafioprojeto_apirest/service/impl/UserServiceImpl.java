package com.smd.desafioprojeto_apirest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smd.desafioprojeto_apirest.domain.model.User;
import com.smd.desafioprojeto_apirest.domain.repository.UserRepository;
import com.smd.desafioprojeto_apirest.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository repository;
	
	@Override
	public User findById(Long id) {
		return repository.findById(id).orElseThrow();
	}

	@Override
	public User create(User user) {
		if(repository.existsByAccountNumber(user.getAccount().getNumber()))
			throw new IllegalArgumentException("Account already exists");
		
		return repository.save(user);
	}

}
