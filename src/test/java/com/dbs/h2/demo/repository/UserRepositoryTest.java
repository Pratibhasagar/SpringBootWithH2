package com.dbs.h2.demo.repository;

import com.dbs.h2.demo.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@DataJpaTest
@ActiveProfiles("test")
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void shouldReturnAllTheUsers() {
        List<User> users = userRepository.findAll();
        assertEquals(2, users.size());
        assertEquals("CINSG0001", users.get(0).getCin());
        assertEquals("CINSG0002", users.get(1).getCin());
    }

    @Test
    public void shouldSearchAUserByCINValue() {
        Optional<User> user = userRepository.findByCin("CINSG0001");
        assertTrue(user.isPresent());
        assertEquals((Long) 900001L, user.get().getMobileNumber());
    }

    @Test
    public void shouldInsertAUser() {
        User user = User.builder().cin("CINHK0001").firstName("JACKIE").lastName("CHAN")
                .mobileNumber(900003L).countryCode("HK").walletId(4000003L).build();
        userRepository.save(user);

        assertEquals(3, userRepository.count());
    }

    @Test
    public void shouldReturnUserGivenItsFirstName() {
        List<User> users = userRepository.findUsersWithFirstName("JOHN");
        System.out.println(users);
        assertEquals(1, users.size());
    }
}
