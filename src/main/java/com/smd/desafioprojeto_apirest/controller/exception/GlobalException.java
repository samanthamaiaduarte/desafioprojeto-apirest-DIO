package com.smd.desafioprojeto_apirest.controller.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class GlobalException {
	private LocalDateTime timestamp;
	private String status;
	private String error;
	
	public GlobalException(LocalDateTime timestamp, String status, String error) {
		this.timestamp = timestamp;
		this.status = status;
		this.error = error;
	}
	
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setError(String error) {
		this.error = error;
	}
	
	public String getError() {
		return error;
	}
}
