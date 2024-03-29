package com.bookapp.repository;




import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.Queries;

@Repository
public abstract class BookRepositoryImpl implements IBookRepository{

	private JdbcTemplate jdbcTemplate;
	
	public BookRepositoryImpl(JdbcTemplate jdbcTemplate) {
		super();
         this.jdbcTemplate=jdbcTemplate;
	}
	@Override
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		Object[] bookArr = {book.getTitle(),book.getAuthor(),book.getPrice(),book.getCategory()};
		jdbcTemplate.update(Queries.InsertQuery,bookArr);
	}

	@Override
	public void updateBook(int bookId, double price) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(Queries.UpdateQuery,price,bookId);
		
	}

	@Override
	public void deleteBook(int bookId) {
		// TODO Auto-generated method stub
		jdbcTemplate.update(Queries.DeleteQuery,bookId);
	}

	/*
	@Override
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		RowMapper<Book> mapper = new BookMapper();
		List<Book> books = jdbcTemplate.query(Queries.SelectQuery,mapper);
		return books;
	}

	@Override
	public List<Book> getBookByAuthorStartsWith(String author) throws BookNotFoundException {
		// TODO Auto-generated method stub
	
		return jdbcTemplate.query(Queries.FindBySpeciality, (rs, rowNum) ->{
			Book book = new Book();
			book.setAuthor(rs.getString("author"));
			book.setBookId(rs.getInt("book_id"));
			book.setTitle(rs.getString("title"));
			book.setCategory(rs.getString("category"));
			book.setPrice(rs.getDouble("price"));
			return book;
		},author);
	}

	@Override
	public List<Book> getByCategory(String category) throws BookNotFoundException {
		// TODO Auto-generated method stub;
		return null;
	}

	@Override
	public List<Book> getByPriceLessTahan(double price) throws BookNotFoundException {
		// TODO Auto-generated method stub
	
		List<Book> books = jdbcTemplate.query(Queries.FindBySpecialityAndFees, new BookMapper(),price);
		return books;
	}

	@Override
	public List<Book> getById(int bookId) throws IdNotFoundException {
		// TODO Auto-generated method stub
		Book book= jdbcTemplate.query(Queries.FindById, Book.class,bookId);
		return book;
	}

     */

    
}
