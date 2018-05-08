package com.xrom.ssh.repository.impl;

import com.xrom.ssh.entity.Person;
import com.xrom.ssh.repository.PersonRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by XRom On 11/16/2017.11:55 PM
 */
@Repository
public class PersonRepositoryImpl implements PersonRepository {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return this.sessionFactory.openSession();
	}

	public Person load(Long id) {
		return (Person) getCurrentSession().load(Person.class, id);
	}

	public Person get(Long id) {
		return (Person) getCurrentSession().get(Person.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<Person> findAll() {
		List<Person> list = new ArrayList<Person>();
		list = getCurrentSession().createQuery("from Person").list();
		System.out.println(list);
		return list;
	}

	public void persist(Person entity) {
		getCurrentSession().persist(entity);
	}

	public Long save(Person entity) {
		return (Long) getCurrentSession().save(entity);
	}

	public void saveOrUpdate(Person entity) {
		getCurrentSession().saveOrUpdate(entity);
	}

	public void delete(Long id) {
		Person person = load(id);
		getCurrentSession().delete(person);
	}

	public void flush() {
		getCurrentSession().flush();
	}
}
