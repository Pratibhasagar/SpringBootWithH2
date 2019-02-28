package com.dbs.h2.demo.controller;

import com.dbs.h2.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/users")
    Page getAllUsers(Pageable pageable) {
        return userService.getAllUsers(pageable);
    }
}
