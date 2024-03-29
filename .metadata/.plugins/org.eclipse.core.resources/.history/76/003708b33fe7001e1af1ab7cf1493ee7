package com.boookapp.client;

import java.util.List;
import java.util.Scanner;

import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.BookServiceImpl;
import com.bookapp.service.IBoookService;
import com.bookapp.util.BookDetails;

public class ClientMain {

    public static void main(String[] args) throws IdNotFoundException {

        Scanner sc = new Scanner(System.in);
        List<Book> books= BookDetails.showBooks();
        Book book = new Book();

        IBoookService boookService = new BookServiceImpl();

/*
        System.out.println("Enter category: ");
        String category = sc.nextLine();

        try {
            List<Book> bookByCategory = boookService.getByCategory(category);
            for (Book book:bookByCategory){
                System.out.println(book);
            }
        } catch (BookNotFoundException e) {
            System.out.println("book not found "+e.getMessage());
        }




        System.out.println("Enter author: ");
        String author = sc.nextLine();

        try {
            List<Book> bookByauthor = boookService.getBookByAuthorStartsWith(author);
            for (Book book:bookByauthor){
                System.out.println(book);
            }
        } catch (BookNotFoundException e) {
            System.out.println("book not found "+e.getMessage());
        }


        System.out.println("Enter price: ");
        double price = sc.nextDouble();

        try {
            List<Book> bookByPrice = boookService.getByPriceLessTahan(price);
            for (Book book:bookByPrice){
                System.out.println(book);
            }
        } catch (BookNotFoundException e) {
            System.out.println("book not found "+e.getMessage());
        }


        System.out.println("Enter id: ");
        int id = sc.nextInt();

        try {
            List<Book> bookByPrice =  boookService.getById(id);
            for (Book book:bookByPrice){
                System.out.println(book);
            }
        } catch (IdNotFoundException e) {
            System.out.println("id not found "+e.getMessage());
        }


 */

    }
}
