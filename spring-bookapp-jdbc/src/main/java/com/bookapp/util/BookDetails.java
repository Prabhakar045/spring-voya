package com.bookapp.util;




import java.util.Arrays;
import java.util.List;

import com.bookapp.model.Book;

public class BookDetails {

    public static  List<Book> showBooks(){
        return Arrays.asList(
        new Book("Java in a action","john","tech",12,345.00),
        new Book("Spring","pbk","tech",13,300.00),
        new Book("NodeJS","rahul","new tech",14,345.00),
        new Book("Chase me","allwin","stories",15,600.00),
        new Book("Maven guide","john junior","techno",16,250.00)
        );
    }
}
