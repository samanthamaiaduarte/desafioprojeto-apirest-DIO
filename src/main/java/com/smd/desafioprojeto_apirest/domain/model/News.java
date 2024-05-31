package com.smd.desafioprojeto_apirest.domain.model;

import jakarta.persistence.Entity;

@Entity(name = "app_news")
public class News extends BaseItem {
	
	public News() {
		super();
	}

	public News(Long id, String icon, String description) {
		super(id, icon, description);
	} 

}
