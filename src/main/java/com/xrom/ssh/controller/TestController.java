package com.xrom.ssh.controller;

import com.xrom.ssh.entity.User;
import com.xrom.ssh.service.PersonService;
import com.xrom.ssh.service.UserService;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by XRom On 11/16/2017.11:59 PM
 */
@Controller
public class TestController {

	@Autowired(required = true)
	private PersonService personService;
	@Autowired(required = true)
	private UserService userService;

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		return "test";
	}

	@RequestMapping(value = "/savePerson", method = RequestMethod.GET)
	@ResponseBody
	public String savePerson() {
		System.out.println(personService.savePerson());
		return "success!";
	}

	@RequestMapping(value = "/saveUser", method = RequestMethod.GET)
	@ResponseBody
	public String saveUser() {
		User user = new User();
		user.setBirthday(new Date().toString());
		user.setEmail("1542882532@qq.com");
		user.setFlag(1);
		user.setPassword("123456");
		user.setSex("男");
		userService.save(user);
		return "success!";
	}
}
