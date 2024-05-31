package com.smd.desafioprojeto_apirest.domain.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "app_card")
public class Card {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true, nullable = false)
	private String number;
	
	@Column(name = "additional_limit", scale = 14, precision = 2)
	private BigDecimal limit;
	
	public Card() { }

	public Card(Long id, String number, BigDecimal limit) {
		this.id = id;
		this.number = number;
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

	public BigDecimal getLimit() {
		return limit;
	}

	@Override
	public String toString() {
		return "Card [Id:" + id + ", Number:" + number + ", Limit:" + limit + "]";
	}

}
