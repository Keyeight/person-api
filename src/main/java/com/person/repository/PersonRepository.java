package com.person.repository;

import com.person.model.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonRepository {

    private static Long id = 1L;
    private static List<Person> persons = new ArrayList<>();

    public void save(Person person) {
        person.setId(id++);
        persons.add(person);
    }

    public List<Person> findAll() {
        return persons;
    }

    public Person findByName(String name) {
        return persons.stream()
                .filter(person -> person.getName().equals(name))
                .findFirst()
                .orElse(null);
    }

    public void deleteByName(String name) {
        persons.removeIf(person -> person.getName().equals(name));
    }
}
