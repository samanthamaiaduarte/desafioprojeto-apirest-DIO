package com.smd.desafioprojeto_apirest.domain.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity(name = "app_user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length = 200, nullable = false)
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL, optional = false)
	private Account account;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Card card;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Feature> features = new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<News> news = new ArrayList<>();
	
	public User() { }

	public User(Long id, String name, Account account, Card card) {
		this.id = id;
		this.name = name;
		this.account = account;
		this.card = card;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Card getCard() {
		return card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public List<Feature> getFeatures() {
		return features;
	}

	public List<News> getNews() {
		return news;
	}

	@Override
	public String toString() {
		return "User [Id:" + id + ", Name:" + name + ", Account:" + account + ", Card:" + card + ", Features:" + features + ", News:" + news + "]";
	}

}
