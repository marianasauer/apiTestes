package com.api.demo.api.services;

import com.api.demo.api.domain.User;
import com.api.demo.api.domain.dto.UserDTO;

import java.util.List;


public interface UserService{
    User findById(Integer id);
    List<User> findAll();
    User create(UserDTO obj);
}
