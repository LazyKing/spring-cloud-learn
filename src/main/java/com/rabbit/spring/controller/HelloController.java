package com.rabbit.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rabbit.spring.dao.PersonRepository;
import com.rabbit.spring.model.Person;

@RestController
@RequestMapping("/hello")
public class HelloController {
	private Logger log = LoggerFactory.getLogger(HelloController.class);
	@Autowired
	private PersonRepository personRepository;
	
	@RequestMapping("/person")
	public Person person(String name){
		log.info("请求的参数name" + name);
		return personRepository.findByName(name);
	}
	
	@RequestMapping("/world")
	public String helloWorld(){
		return "Hello World";
	}
}
