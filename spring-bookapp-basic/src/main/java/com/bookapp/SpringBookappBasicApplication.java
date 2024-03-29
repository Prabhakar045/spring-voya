package com.bookapp;


import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBookService;

@SpringBootApplication(scanBasePackages = {"com.bookapp"})
public class SpringBookappBasicApplication implements CommandLineRunner{

	@Autowired
    IBookService iBookService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBookappBasicApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter category: ");
        String category = sc.nextLine();

        try {
            List<Book> bookByCategory = iBookService.getByCategory(category);
            for (Book book:bookByCategory){
                System.out.println(book);
            }
        } catch (BookNotFoundException e) {
            System.out.println("book not found "+e.getMessage());
        }







	}

}
