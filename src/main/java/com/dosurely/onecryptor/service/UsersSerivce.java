package com.dosurely.onecryptor.service;

import com.dosurely.onecryptor.entity.Users;

public interface UsersSerivce {

	public Users getUser(String name);

	public Users createUser(Users user);
}
