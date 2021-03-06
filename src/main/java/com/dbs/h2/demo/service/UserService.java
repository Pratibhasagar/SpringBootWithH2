package com.dbs.h2.demo.service;

import com.dbs.h2.demo.model.User;
import com.dbs.h2.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Page getAllUsers(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
