package com.wfs.dao;

import com.wfs.pojo.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;



public interface BookDao {

    @Insert("insert into book(type,name,description) values(#{type}),#{name},#{description}")
    public void save(Book book);


    @Update("update book set type=#{type},name=#{name},description=#{description} where id=#{id}")
    public void update(Book book);


    @Delete("delete * from book where id=#{id}")
    public void delete(Integer id);


    @Select("select * from book where id=#{id}")
    public Book getBookById(Integer id);

    @Select("select * from book")
    public List<Book> getAll();

}