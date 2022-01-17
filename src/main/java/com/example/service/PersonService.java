package com.example.service;

import com.example.model.Person;

import java.util.Set;

public interface PersonService {
    Person createPerson(Person person);
    Person updatePerson(Person person);
    void deletePerson(Person person);
    Person getPersonById(int id);
    Set<Person> getAllPerson();
}
