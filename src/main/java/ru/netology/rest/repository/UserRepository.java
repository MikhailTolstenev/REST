package ru.netology.rest.repository;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import ru.netology.rest.model.Authorities;
import ru.netology.rest.model.User;

import java.util.*;

@Repository

public class UserRepository {


    public List<Authorities> getUserAuthorities(User user) {
        //Map<User, List<Authorities>> users = new HashMap<>();
        //test
        List<Authorities> testAuthorities = List.of(Authorities.READ, Authorities.DELETE, Authorities.WRITE);
        User testUser = new User();
        testUser.setName("admin");
        testUser.setPassword("1234");
        //users.put(testUser,testAuthorities);
        if ( testUser.getPassword().equals(user.getPassword())  ) {

            return testAuthorities;
        }

        return Collections.emptyList();
    }
}
