package com.smd.desafioprojeto_apirest.service;

import com.smd.desafioprojeto_apirest.domain.model.User;

public interface UserService {
	
	User findById(Long id);
	
	User create(User user);

}
