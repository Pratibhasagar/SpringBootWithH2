package com.dbs.h2.demo.controller;

import com.dbs.h2.demo.model.User;
import com.dbs.h2.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    Page getAllUsers(Pageable pageable) {
        return userService.getAllUsers(pageable);
    }

    @GetMapping(value = "/users")
    List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
