package com.railway.config;

import com.railway.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface RailwayUserDetailsService extends UserDetailsService {

    User save(User user);
}
