package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice //cho phep tra ve 1 view
public class CustomExceptionHandler {
	@ExceptionHandler(NotFoundException.class) //chi ro method nay xu ly exception nao
	@ResponseStatus(HttpStatus.NOT_FOUND)		// dinh nghia http method tra ve cho nguoi dung
	public ErrorResponse handlerNotFoundException(NotFoundException ex, WebRequest req) {
		return new ErrorResponse(HttpStatus.NOT_FOUND, ex.getMessage()); //hien thi cho nguoi dung
	}
}
