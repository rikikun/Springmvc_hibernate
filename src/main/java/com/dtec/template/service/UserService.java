package com.dtec.template.service;

import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.dtec.template.entity.UserEntity;

public interface UserService {
	public void createUser(UserEntity userEntity);

	public void deleteUser(UserEntity userEntity);

	public void deleteUser(Integer userId);

	public void updateUser(UserEntity userEntity);

	public UserEntity getUserById(Integer userId);
	
	public UserEntity getUserByName(String userName)throws UsernameNotFoundException;
}
