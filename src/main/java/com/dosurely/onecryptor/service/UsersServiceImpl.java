package com.dosurely.onecryptor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dosurely.onecryptor.data.UsersRepository;
import com.dosurely.onecryptor.entity.Users;

@Service
public class UsersServiceImpl implements UsersSerivce {

	@Autowired
	UsersRepository usersRepository;
	
	@Override
	public Users getUser(String name) {
		// TODO Auto-generated method stub
		return usersRepository.findByName(name);
	}

	@Override
	public Users createUser(Users user) {
		// TODO Auto-generated method stub
		return usersRepository.save(user);
	}

}
