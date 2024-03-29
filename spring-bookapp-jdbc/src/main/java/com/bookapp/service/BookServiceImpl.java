package com.bookapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.repository.BookRepositoryImpl;
import com.bookapp.repository.IBookRepository;
import com.bookapp.util.BookDetails;

@Service
public class BookServiceImpl implements IBoookService{

  //  List<Book> books;
	@Autowired
   IBookRepository iBookRepository;

		@Override
		public void addBook(Book book) {
			// TODO Auto-generated method stub
			iBookRepository.addBook(book);
			System.out.println("java   2000 12");
		}
		
		@Override
		public void updateBook(int bookId, double price) {
			// TODO Auto-generated method stub
			iBookRepository.updateBook(bookId, price);
		}
		
		@Override
		public void deleteBook(int bookId) {
			// TODO Auto-generated method stub
			iBookRepository.deleteBook(bookId);
		}
		
		@Override
		public List<Book> getAll() {
			// TODO Auto-generated method stub
			return iBookRepository.getAll();
		}
		
		@Override
		public List<Book> getBookByAuthorStartsWith(String author) throws BookNotFoundException {
			// TODO Auto-generated method stub
			return iBookRepository.getBookByAuthorStartsWith(author);
		}
		
		@Override
		public List<Book> getByCategory(String category) throws BookNotFoundException {
			// TODO Auto-generated method stub
			return iBookRepository.getByCategory(category);
		}
		
		@Override
		public List<Book> getByPriceLessTahan(double price) throws BookNotFoundException {
			// TODO Auto-generated method stub
			return iBookRepository.getByPriceLessTahan(price);
		}
		
		@Override
		public List<Book> getById(int bookId) throws IdNotFoundException {
			// TODO Auto-generated method stub
			return iBookRepository.getById(bookId);
		}


}
