package com.realdolmen.course.controller;

import com.realdolmen.course.domain.Book;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class RegistrationBean implements Serializable {
    private String author;

    public String getAuthor() {
        return author;
    }

    @Inject
    BookController bookController;

    @PostConstruct
    void init() {
        Book boekje = bookController.findById(2000);
        author = boekje.getAuthor();
    }


}
