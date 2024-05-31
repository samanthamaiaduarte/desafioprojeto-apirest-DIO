package com.smd.desafioprojeto_apirest.domain.model;

import jakarta.persistence.Entity;

@Entity(name = "app_feature")
public class Feature extends BaseItem {

	public Feature() {
		super();		
	}

	public Feature(Long id, String icon, String description) {
		super(id, icon, description);
	}

}
