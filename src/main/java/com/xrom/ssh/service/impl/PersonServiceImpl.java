package com.xrom.ssh.service.impl;

import com.xrom.ssh.entity.Person;
import com.xrom.ssh.repository.PersonRepository;
import com.xrom.ssh.service.PersonService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by XRom On 11/16/2017.11:58 PM
 */
@Service
public class PersonServiceImpl implements PersonService {

	@Autowired(required = true)
	private PersonRepository personRepository;

	public Long savePerson() {
		Person person = new Person();
		person.setUsername("XRog");
		person.setPhone("18381005946");
		person.setAddress("chenDu");
		person.setRemark("this is XRog");
		return personRepository.save(person);
	}

	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return personRepository.findAll();
	}
}
