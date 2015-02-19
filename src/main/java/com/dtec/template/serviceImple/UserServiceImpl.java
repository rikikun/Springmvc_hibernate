package com.dtec.template.serviceImple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.dtec.template.dao.BaseDao;
import com.dtec.template.daoImpl.UserDaoImpl;
import com.dtec.template.entity.UserEntity;
import com.dtec.template.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
    UserDaoImpl userDao;
	
	@Autowired
	UserDaoImpl userDaoImpl;

	public void createUser(UserEntity userEntity) {
		userDao.create(userEntity);
	}

	public void deleteUser(UserEntity userEntity) {
		userEntity.setActive(false);
		userDao.update(userEntity);
	}

	public void deleteUser(Integer userId) {
		UserEntity useBase = getUserById(userId);
		useBase.setActive(false);
		userDao.update(useBase);
	}

	public void updateUser(UserEntity userEntity) {
		userDao.update(userEntity);
	}

	public UserEntity getUserById(Integer userId) {
		return (UserEntity) userDao.get(UserEntity.class, userId);
	}

	public UserEntity getUserByName(String userName)throws UsernameNotFoundException {
		return userDaoImpl.getUserByName(userName);
	}
}
