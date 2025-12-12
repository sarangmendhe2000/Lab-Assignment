package com.demo.MySpringbootRestWebService.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.demo.MySpringbootRestWebService.Bean.MyUser;
import com.demo.MySpringbootRestWebService.Dao.LoginDao;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private LoginDao repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        MyUser u = repo.findByUname(username);

        if (u == null) {
            throw new UsernameNotFoundException("User Not Found with username: " + username);
        }

        // Build Spring Security UserDetails object
        return User.withUsername(u.getUname())
                   .password(u.getPassword())
                   .roles("USER")   // default role since DB has no role column
                   .build();
    }
}
