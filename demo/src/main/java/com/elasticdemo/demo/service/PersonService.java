package com.elasticdemo.demo.service;

import com.elasticdemo.demo.model.Person;
import com.elasticdemo.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {



    private final PersonRepository repository;

    @Autowired
    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public void saveThis(Person person) {
        repository.save(person);
    }

    public Person findById(final String id) {
        return repository.findById(id).orElse(null);
    }
}
