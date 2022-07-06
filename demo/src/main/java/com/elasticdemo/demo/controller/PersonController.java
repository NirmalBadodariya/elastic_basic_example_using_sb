package com.elasticdemo.demo.controller;


import com.elasticdemo.demo.model.Person;
import com.elasticdemo.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/person")
public class PersonController {
    private final PersonService service;

    @Autowired
    public PersonController(PersonService service) {
        this.service = service;
    }

    @PostMapping("/save")
    public void save(@RequestBody Person person) {
        service.saveThis(person);

    }

    @GetMapping("/{id}")
    public Person findById(@PathVariable final String id) {
        return service.findById(id);
    }
}