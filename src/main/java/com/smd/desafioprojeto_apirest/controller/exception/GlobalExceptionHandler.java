package com.smd.desafioprojeto_apirest.controller.exception;

import java.time.LocalDateTime;
import java.util.NoSuchElementException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	private final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);
	
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<GlobalException> handleIllegalArgument(IllegalArgumentException exception) {
		GlobalException obj = new GlobalException(LocalDateTime.now(), HttpStatus.UNPROCESSABLE_ENTITY.name(), exception.getMessage());
		return ResponseEntity.unprocessableEntity().body(obj);
	}

	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<GlobalException> handleNotFound(NoSuchElementException exception) {
		GlobalException obj = new GlobalException(LocalDateTime.now(), HttpStatus.NOT_FOUND.name(), "ID not found");
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(obj);
	}
	
	@ExceptionHandler(Throwable.class)
	public ResponseEntity<GlobalException> handleUnexpected(Throwable exception) {
		String msg = "Unexpected server error";
		log.error(msg + ": " + exception.getMessage(), exception);
		GlobalException obj = new GlobalException(LocalDateTime.now(), HttpStatus.INTERNAL_SERVER_ERROR.name(), msg);
		return ResponseEntity.internalServerError().body(obj);
	}
}
