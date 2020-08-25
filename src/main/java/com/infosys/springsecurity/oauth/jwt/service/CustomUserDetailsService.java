/**
 * 
 */
package com.infosys.springsecurity.oauth.jwt.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.infosys.springsecurity.oauth.jwt.model.User;
import com.infosys.springsecurity.oauth.jwt.repository.UserRepository;

/**
 * @author kisho
 *
 */

@Service("userDetailsService")
public class CustomUserDetailsService implements UserDetailsService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		User appUser = userRepository.findOneByUsername(username);
		return appUser;
		
	}

}
