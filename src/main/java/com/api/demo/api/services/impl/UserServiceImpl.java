package com.api.demo.api.services.impl;

import com.api.demo.api.Repositories.UserRepository;
import com.api.demo.api.domain.User;
import com.api.demo.api.services.UserService;
import com.api.demo.api.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findById(Integer id) {
        Optional<User> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado!"));
    }

    public List<User> findAll() {
        return repository.findAll();
    }
}
