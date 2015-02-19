package com.dtec.template.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class BaseDao<T> {
	
	@Autowired
	protected SessionFactory sessionFactory;
	
	public void create(T object){
		sessionFactory.getCurrentSession().save(object);
	}
	
	public void update(T object){
		sessionFactory.getCurrentSession().update(object);
	}
	
	public void delete(T object){
		sessionFactory.getCurrentSession().delete(object);
	}
	
	public void delete(Class<T> clazz,Integer objectId){
		sessionFactory.getCurrentSession().delete(sessionFactory.getCurrentSession().get(clazz,objectId));
	}
	
	@SuppressWarnings("unchecked")
	public T get(Class<T> clazz,Integer objectId){
		return (T)sessionFactory.getCurrentSession().get(clazz, objectId);
	}
	
}
