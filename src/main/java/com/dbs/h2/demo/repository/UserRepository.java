package com.dbs.h2.demo.repository;

import com.dbs.h2.demo.model.Card;
import com.dbs.h2.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    String filterOnFirstNameQuery = "SELECT u FROM User u where UPPER(:firstName) = UPPER(u.firstName)";
    String cardsOfGivenUserQuery = "SELECT c FROM Card c where UPPER(:userCin) = UPPER(c.user.cin)";

    Optional<User> findByCin(String cin);

    @Query(filterOnFirstNameQuery)
    List<User> findUsersWithFirstName(@Param("firstName") String firstName);

    @Query(cardsOfGivenUserQuery)
    List<Card> findCardsOfUser(@Param("userCin") String userCin);
}
