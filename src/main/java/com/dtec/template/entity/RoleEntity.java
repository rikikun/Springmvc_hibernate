package com.dtec.template.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ROLEENTITY")
public class RoleEntity {
	
	@Id
	@GeneratedValue
	@Column(name="ROLE_ID")
	private Integer id;
	
	@Column(name="ROLENAME",unique=true)
	private String roleName;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "roleEntity")
	Set<UserEntity>users=new HashSet<UserEntity>();
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Set<UserEntity> getUsers() {
		return users;
	}

	public void setUsers(Set<UserEntity> users) {
		this.users = users;
	}
	
	

}
