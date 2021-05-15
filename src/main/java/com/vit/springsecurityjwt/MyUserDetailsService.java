package com.vit.springsecurityjwt;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
      if (s.equals("Soumadeep") || s.equals("Ankita") || s.equals("Ravi"))
      {
    	  return new User(s, "password",
                  new ArrayList<>());
      }
      else {
    	  //throw new Exception().getClass();
    	  return null;
      }
    }
}