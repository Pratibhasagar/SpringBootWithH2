package com.dbs.h2.demo.service;

import com.dbs.h2.demo.model.User;
import com.dbs.h2.demo.repository.UserRepository;
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
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @MockBean
    private UserRepository userRepository;

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
        when(userRepository.findAll()).thenReturn(users);

        List<User> actualUsers = userService.getAllUsers();
        assertEquals(2, actualUsers.size());
    }
}
