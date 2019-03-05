package com.dbs.h2.demo.controller;

import com.dbs.h2.demo.model.User;
import com.dbs.h2.demo.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class UserControllerTest {

    @Autowired
    private UserController userController;

    @MockBean
    private UserService userService;

    private List<User> users;

    @Before
    public void setUp() throws Exception {
        User user1 = User.builder().cin("CINSG0001").firstName("JOHN").lastName("DOE")
                .mobileNumber(900001L).countryCode("SG").walletId(4000001L).build();
        User user2 = User.builder().cin("CINSG0002").firstName("TOM").lastName("HARRY")
                .mobileNumber(900002L).countryCode("SG").walletId(4000002L).build();
        users = Arrays.asList(user1, user2);
    }

    @Test
    public void shouldReturnAllUsers() {
        when(userService.getAllUsers()).thenReturn(users);

        List<User> actualUsers = userController.getAllUsers();
        assertEquals(2, actualUsers.size());
    }
}