package com.wfs.controller;



import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/books")
public class BookController {


    @RequestMapping(method = RequestMethod.GET ,value = "/{id}")
    public String getBookById(@PathVariable("id") Integer id){
        return "wahaha"+id;
    }



}
