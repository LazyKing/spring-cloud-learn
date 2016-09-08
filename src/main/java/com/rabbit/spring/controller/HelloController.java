package com.rabbit.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rabbit.spring.dao.PersonRepository;
import com.rabbit.spring.model.Person;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@Autowired
	private PersonRepository personRepository;
	
	@RequestMapping("/person")
	public Person person(String name){
		return personRepository.findByName(name);
	}
	
	@RequestMapping("/world")
	public String helloWorld(){
		return "Hello World";
	}
}
