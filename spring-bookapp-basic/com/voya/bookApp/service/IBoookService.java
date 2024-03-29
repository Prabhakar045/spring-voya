package com.voya.bookApp.service;

import com.voya.bookApp.exception.BookNotFoundException;
import com.voya.bookApp.exception.IdNotFoundException;
import com.voya.bookApp.model.Book;

import java.util.List;

public interface IBoookService {

    List<Book> getAll();
    List<Book> getBookByAuthorStartsWith(String author)throws BookNotFoundException;
    List<Book> getByCategory(String category)throws BookNotFoundException;
    List<Book> getByPriceLessTahan(double price)throws BookNotFoundException;
    Book getById(int bookId) throws IdNotFoundException;
}
