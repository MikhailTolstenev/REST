package ru.netology.rest.repository;

import org.springframework.stereotype.Repository;
import ru.netology.rest.model.Authorities;

import java.util.*;

@Repository

public class UserRepository {
    Map<String, String> users = new HashMap<>();
    public List<Authorities> getUserAuthorities(String user, String password) {
        //test
        String user1 = "admin";
        String password1 = "1234";
        users.put(user1, password1);
        List<Authorities> testAuthorities = List.of(Authorities.READ, Authorities.DELETE, Authorities.WRITE);
        if (users.get(user).equals(password)) {

            return testAuthorities;
        }

        return Collections.emptyList();
    }
}
