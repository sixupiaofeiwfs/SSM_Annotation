package com.wfs.service.Impl;

import com.wfs.dao.BookDao;
import com.wfs.pojo.Book;
import com.wfs.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {


    @Autowired
    private BookDao bookDao;


    @Override
    public boolean save(Book book) {
        bookDao.save(book);
        return true;
    }

    @Override
    public boolean update(Book book) {
        bookDao.update(book);
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        bookDao.delete(id);
        return true;
    }

    @Override
    public Book getBookById(Integer id) {
        return   bookDao.getBookById(id);

    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
