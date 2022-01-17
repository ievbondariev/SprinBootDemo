package com.example.contoller;

import com.example.model.Person;
import com.example.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
public class PersonController {

   @Autowired
    private PersonService personService;

    @PostMapping("/person/createPerson")

    public Person createPerson(@RequestBody Person person) {
        return personService.createPerson(person);
    }

    @GetMapping("/person/getAllPerson")
    @ResponseBody
    public Set<Person> getAllPerson() {
    return personService.getAllPerson();
    }

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}
