package com.smd.desafioprojeto_apirest.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;

	@Column(nullable = false)
	protected String icon;
	
	@Column(length = 200, nullable = false)
	protected String description;
	
	public BaseItem() { }
	
	public BaseItem(Long id, String icon, String description) {
		this.id = id;
		this.icon = icon;
		this.description = description;		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Feature [Id:" + id + ", Icon:" + icon + ", Description:" + description + "]";
	}
	
}
