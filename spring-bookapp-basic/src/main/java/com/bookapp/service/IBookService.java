package com.bookapp.service;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;

import java.util.List;

public interface IBookService {

    List<Book> getAll();
    List<Book> getBookByAuthorStartsWith(String author)throws BookNotFoundException;
    List<Book> getByCategory(String category)throws BookNotFoundException;
    List<Book> getByPriceLessTahan(double price)throws BookNotFoundException;
    Book getById(int bookId) throws IdNotFoundException;
}
