package com.springboot.quickstart.demo.dao;

import com.springboot.quickstart.demo.entity.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookDAO {
    public List<Book> getBooks(){
        List<Book> books= new ArrayList<>();
        books.add(new Book(1,"Spring Boot实战",88.7));
        books.add(new Book(2,"Spring MVC",97.1));
        books.add(new Book(3,"从入门到精通",81.7));
        return books;

    }
}
