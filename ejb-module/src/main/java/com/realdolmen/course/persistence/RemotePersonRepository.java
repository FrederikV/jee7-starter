package com.realdolmen.course.persistence;

import com.realdolmen.course.domain.Person;

import javax.ejb.Remote;

@Remote
public interface RemotePersonRepository {
    public Person findById(int id);
}
