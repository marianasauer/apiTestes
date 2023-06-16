package com.api.demo.api.config;

import com.api.demo.api.Repositories.UserRepository;
import com.api.demo.api.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Configuration
@Profile("/local")
public class LocalConfig {

    @Autowired
    private UserRepository repository;
    @Bean
    public void startDB(){
        User u1= new User(null, "Valdir", "valdir@mail.com", "123");
        User u2= new User(null, "Luiz", "luiz@mail.com", "123");

        repository.saveAll(List.of(u1, u2));
    }
}
