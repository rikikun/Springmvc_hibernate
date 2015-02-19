package com.dtec.template.serviceImple;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.dtec.template.entity.UserEntity;
import com.dtec.template.service.UserService;

@Service("userDetailServiceImpl")
public class UserDetailServiceImpl implements UserDetailsService {
	@Autowired
	UserService userService;

	public UserDetails loadUserByUsername(String userName)
			throws UsernameNotFoundException {
		UserEntity user=null;
		try{
			user = (UserEntity) userService.getUserByName(userName);
		}catch(UsernameNotFoundException e){
			e.printStackTrace();
			throw e;
		}
		
		return new User(user.getUserName(), user.getPassword(), true, true, true, true,
				getAuthorities(user.getRoleEntity().getRoleName()));
	}

	public Collection<GrantedAuthority> getAuthorities(String access) {
		List<GrantedAuthority> authList = new ArrayList<GrantedAuthority>(2);
		//
		// if (access.compareTo(1) == 0) {
		// authList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
		// } else {
		// authList.add(new SimpleGrantedAuthority("ROLE_USER"));
		// }
		authList.add(new SimpleGrantedAuthority(access));
		return authList;
	}

}
