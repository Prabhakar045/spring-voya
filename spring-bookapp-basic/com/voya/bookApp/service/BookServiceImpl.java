package com.voya.bookApp.service;

import com.voya.bookApp.exception.BookNotFoundException;
import com.voya.bookApp.exception.IdNotFoundException;
import com.voya.bookApp.model.Book;
import com.voya.bookApp.util.BookDetails;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImpl implements IBoookService{


    @Override
    public List<Book> getAll() {
        List<Book> books= BookDetails.showBooks();
        return books;
    }

    @Override
    public List<Book> getBookByAuthorStartsWith(String author) throws BookNotFoundException {
        List<Book> books= BookDetails.showBooks();
        List<Book> bookByAuthor = new ArrayList<>();
        for (Book book:books){
            if (book.getAuthor().startsWith(author)) {

                bookByAuthor.add(book);
            }
        }
        if(bookByAuthor.isEmpty()){
            throw  new BookNotFoundException("no book found by this author");
        }
        return bookByAuthor;
    }

    @Override
    public List<Book> getByCategory(String category) throws BookNotFoundException {
        List<Book> books= BookDetails.showBooks();

        List<Book> bookByCategory = new ArrayList<>();
        for (Book book:books){
            if (book.getCategory().equals(category)) {

                bookByCategory.add(book);
            }
        }
        if(bookByCategory.isEmpty()){
            throw  new BookNotFoundException("no book found by this category");
        }
        return bookByCategory;
    }

    @Override
    public List<Book> getByPriceLessTahan(double price) throws BookNotFoundException {
        List<Book> books= BookDetails.showBooks();

        Double priceValue =price;
        List<Book> bookByPrice = new ArrayList<>();
        for (Book book:books){
            if (book.getPrice() < priceValue) {

                bookByPrice.add(book);
            }
        }
        if(bookByPrice.isEmpty()){
            throw  new BookNotFoundException("no book at this price..");
        }

        return bookByPrice;
    }

    @Override
    public Book getById(int bookId) throws IdNotFoundException {
        List<Book> books= BookDetails.showBooks();
        Book  matchingBoook = new Book();

        for (Book book:books){
            if (book.getBookId() == bookId) {
              return matchingBoook;
            }
        }

     return null;
    }
}
