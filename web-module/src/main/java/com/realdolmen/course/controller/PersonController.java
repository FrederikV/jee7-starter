package com.realdolmen.course.controller;

import com.realdolmen.course.domain.Person;
import com.realdolmen.course.persistence.PersonRepository;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class PersonController {
    @Inject
    PersonRepository repository;

    public Person findById(int id) {
        return repository.findById(id);
    }

    public String register() {
        return "confirm";
    }
}
