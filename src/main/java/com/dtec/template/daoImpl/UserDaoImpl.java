package com.dtec.template.daoImpl;

import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dtec.template.dao.BaseDao;
import com.dtec.template.entity.UserEntity;

@Repository
@Transactional
public class UserDaoImpl extends BaseDao<UserEntity> {

	public UserEntity getUserByName(String name) throws UsernameNotFoundException {
		try{
		return (UserEntity) sessionFactory
				.getCurrentSession()
				.createQuery(
						"SELECT u from UserEntity u WHERE u.userName=:name")
				.setParameter("name", name).list().get(0);
		}catch(Exception e){
			throw new UsernameNotFoundException("Not found");
		}
	}

}
