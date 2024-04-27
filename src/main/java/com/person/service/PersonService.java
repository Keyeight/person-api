package com.person.service;

import com.person.model.Person;
import com.person.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class PersonService {

    private PersonRepository personRepository;

    public void save(Person person) {
        personRepository.save(person);
    }

    public Person findByName(String name) {
        return personRepository.findByName(name);
    }

    public void deleteByName(String name) {
        personRepository.deleteByName(name);
    }

    public List<Person> findAll() {
        return personRepository.findAll();
    }
}

