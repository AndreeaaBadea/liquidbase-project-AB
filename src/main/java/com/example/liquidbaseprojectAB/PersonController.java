package com.example.liquidbaseprojectAB;

import com.example.liquidbaseprojectAB.entity.Person;
import com.example.liquidbaseprojectAB.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    PersonService personService;


    @PostMapping()
    public ResponseEntity<Person> addPerson(@RequestBody Person person){
       Person newPerson =  personService.addPerson(person);
       return new ResponseEntity<>(newPerson, HttpStatus.CREATED);
    }



}
