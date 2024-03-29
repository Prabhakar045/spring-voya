package com.voya.bookApp.model;

public class Book {
    private String title;
    private String author;
    private String category;
    private int bookId;
    private double price;

    public Book() {
    }

    public Book(String title, String author, String category, int bookId, double price) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.bookId = bookId;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public int getBookId() {
        return bookId;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", bookId=" + bookId +
                ", price=" + price +
                '}';
    }
}
