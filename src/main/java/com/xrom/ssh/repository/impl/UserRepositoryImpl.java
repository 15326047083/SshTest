package com.xrom.ssh.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xrom.ssh.entity.User;
import com.xrom.ssh.repository.UserRepository;

@Repository
public class UserRepositoryImpl implements UserRepository {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return this.sessionFactory.openSession();
	}

	public User load(Long id) {
		// TODO Auto-generated method stub
		return (User) getCurrentSession().load(User.class, id);
	}

	public User get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<User> findAll() {
		// TODO Auto-generated method stub
		List<User> list = new ArrayList<User>();
		list = getCurrentSession().createQuery("from user").list();
		return list;
	}
	public void persist(User entity) {
		// TODO Auto-generated method stub

	}

	public Long save(User entity) {
		// TODO Auto-generated method stub
		return (Long) getCurrentSession().save(entity);
	}

	public void saveOrUpdate(User entity) {
		// TODO Auto-generated method stub

	}

	public void delete(Long id) {
		// TODO Auto-generated method stub

	}
	public void flush() {
		// TODO Auto-generated method stub

	}

}
