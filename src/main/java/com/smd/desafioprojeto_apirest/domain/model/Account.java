package com.smd.desafioprojeto_apirest.domain.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "app_account")
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true, nullable = false)
	private String number;
	
	@Column(nullable = false)
	private String agency;
	
	@Column(precision = 14, scale = 2)
	private BigDecimal balance;
	
	@Column(name = "additional_limit", precision = 14, scale = 2)
	private BigDecimal limit;
	
	public Account() { }

	public Account(Long id, String number, String agency, BigDecimal balance, BigDecimal limit) {
		this.id = id;
		this.number = number;
		this.agency = agency;
		this.balance = balance;
		this.limit = limit;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAgency() {
		return agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public BigDecimal getLimit() {
		return limit;
	}

	@Override
	public String toString() {
		return "Account [Id:" + id + ", Number:" + number + ", Agency:" + agency + ", Balance:" + balance + ", Limit:" + limit + "]";
	}
	
}
