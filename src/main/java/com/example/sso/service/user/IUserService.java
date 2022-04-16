package com.example.sso.service.user;

import com.example.sso.domain.User;
import com.example.sso.service.IGeneralService;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUserService extends UserDetailsService, IGeneralService<User> {
}
