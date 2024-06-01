package com.smd.desafioprojeto_apirest.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smd.desafioprojeto_apirest.domain.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	boolean existsByAccountNumber(String accountNumber);
}
