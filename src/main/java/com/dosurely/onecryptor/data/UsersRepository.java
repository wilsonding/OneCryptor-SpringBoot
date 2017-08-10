package com.dosurely.onecryptor.data;

import org.springframework.data.repository.CrudRepository;

import com.dosurely.onecryptor.entity.Users;

public interface UsersRepository extends CrudRepository<Users, Long> {

	public Users findByName(String username);
}
