package com.example.service;

import com.example.model.Person;
import org.springframework.stereotype.Service;

import java.util.Set;

import static com.example.storage.PersonStorage.personStorageSet;

@Service
public class PersonServiceImpl implements PersonService {
    @Override
    public Person createPerson(Person person) {
        Person newPerson = person;
        personStorageSet.add(newPerson);
        return newPerson;
    }

    @Override
    public Person updatePerson(Person person) {
        Person newPerson = person;
//        personSet.stream().findFirst().ifPresent(person, getPersonById());
        return person;
    }

    @Override
    public void deletePerson(Person person) {

    }

    @Override
    public Person getPersonById(int id) {
        return null;
    }

    @Override
    public Set<Person> getAllPerson() {
        return personStorageSet;
    }
}
