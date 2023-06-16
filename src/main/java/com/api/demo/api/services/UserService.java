package com.api.demo.api.services;

import com.api.demo.api.domain.User;



public interface UserService{
    User findById(Integer id);
}
