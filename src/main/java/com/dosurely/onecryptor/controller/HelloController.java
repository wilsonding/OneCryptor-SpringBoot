package com.dosurely.onecryptor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dosurely.onecryptor.entity.Users;
import com.dosurely.onecryptor.service.UsersSerivce;

@RestController
public class HelloController {
	
	@Autowired
	UsersSerivce usersService;

	@RequestMapping(value = "/", method = RequestMethod.GET, produces = {"application/json"})
	public @ResponseBody String sayHello() {
		return "Hello World!";
	}
	
	@RequestMapping(value = "/user/{userName}", method = RequestMethod.GET, produces = {"application/json"})
	public @ResponseBody Users getUser(@PathVariable("userName") String name){
		return usersService.getUser(name);
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.POST, consumes = {"application/json"}, produces = {"application/json"})
	public @ResponseBody Users createUser(@RequestBody Users user) {
		Users newUser = usersService.createUser(user);
		return newUser;
 	}
}
