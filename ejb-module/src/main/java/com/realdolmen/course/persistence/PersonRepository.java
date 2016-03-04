package com.realdolmen.course.persistence;

import com.realdolmen.course.domain.Person;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@LocalBean
public class PersonRepository implements RemotePersonRepository {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Person findById(int id) {
        return entityManager.find(Person.class,id);
    }
}
