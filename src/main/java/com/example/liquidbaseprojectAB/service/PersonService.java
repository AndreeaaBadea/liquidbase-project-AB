package com.example.liquidbaseprojectAB.service;

import com.example.liquidbaseprojectAB.entity.Person;
import com.example.liquidbaseprojectAB.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public Person addPerson(Person person){
        return personRepository.save(person);

    }

    public List<Person> findAllPersons() {
        return personRepository.findAll();
    }


}
