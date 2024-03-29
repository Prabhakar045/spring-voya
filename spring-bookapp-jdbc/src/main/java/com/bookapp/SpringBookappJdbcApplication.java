package com.bookapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.model.Book;
import com.bookapp.service.IBoookService;

@SpringBootApplication
public class SpringBookappJdbcApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBookappJdbcApplication.class, args);
	}
	
	@Autowired
	IBoookService iBookService;

	@Autowired
	Book book;
	@Override
	public void run(String... args) throws Exception {
		
		// TODO Auto-generated method stub
//		System.out.println("java");
		iBookService.addBook(book);
		iBookService.deleteBook(2);
		List<Book> books =iBookService.getAll();
		System.out.println(books);
		List<Book> booksByTech =iBookService.getByCategory("tech");
		System.out.println(booksByTech);
		Book byId = (Book) iBookService.getById(1);
		System.out.println(byId);
		
	}

}
