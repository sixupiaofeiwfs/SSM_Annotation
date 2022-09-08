package com.wfs.service;

import com.wfs.pojo.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional//开启事务
public interface BookService {

    public boolean save(Book book);


    public boolean update(Book book);


    public boolean delete(Integer id);


    public Book getBookById(Integer id);


    public List<Book> getAll();
}
