package com.eksad.supermarket.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.eksad.supermarket.dao.PersonDao;
import com.eksad.supermarket.entity.Person;
@Configuration
public class FunctionPaging {
	@Autowired
	PersonDao personDao;
	@Bean
	public void PaggingPersonFindAll() {
	Page<Person> page = personDao.findAll(PageRequest.of(2, 20, Sort.by("name")));
	
	System.out.println("Total element : " + page.getTotalElements());
	System.out.println("Total page : " + page.getTotalPages());
	page.forEach(System.out::println);
	}
	
	
	
}
