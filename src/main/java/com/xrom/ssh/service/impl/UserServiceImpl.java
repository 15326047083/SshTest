package com.xrom.ssh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xrom.ssh.entity.User;
import com.xrom.ssh.repository.UserRepository;
import com.xrom.ssh.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	public Long save(User user) {
		// TODO Auto-generated method stub
		return (Long) userRepository.save(user);
	}

}
