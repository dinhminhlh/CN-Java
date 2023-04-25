package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.BookRequest;
import com.example.demo.model.Book;

@RestController
@RequestMapping("/book")
public class BookController {

	private List<Book> books = new ArrayList<>();
	
	public BookController() {
		books.add(new Book("0x12", "mat ma", "aki", 1994));
	}
	
	@GetMapping
	public List<Book> getBooks(){
		return books;
	}
	
	@PostMapping
	public Book createNewBook(@RequestBody BookRequest bookRequest) {
		
		Book newBook = new Book("new", bookRequest.getTitle(), bookRequest.getAuthor(), bookRequest.getYear());
		books.add(newBook);
		return newBook;
	}
}
