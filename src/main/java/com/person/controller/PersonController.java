package com.person.controller;

import com.person.model.Person;
import com.person.service.PersonService;
import lombok.AllArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class PersonController {

    private final PersonService personService;

    @PostMapping("/person")
    public ResponseEntity<Void> save(@RequestBody Person person) {
        personService.save(person);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping("/person")
    public ResponseEntity<List<Person>> findAll() {
        return ResponseEntity.ok(personService.findAll());
    }

    @GetMapping("/person/{name}")
    public ResponseEntity<Person> findByName(@PathVariable String name) {
        return ResponseEntity.ok(personService.findByName(name));
    }

    @DeleteMapping("/person/{name}")
    public ResponseEntity<Void> deleteByName(@PathVariable String name) {
        personService.deleteByName(name);
        return ResponseEntity.noContent().build();
    }

}
