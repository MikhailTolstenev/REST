package ru.netology.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import ru.netology.rest.exeption.InvalidCredentials;
import ru.netology.rest.exeption.UnauthorizedUser;
import ru.netology.rest.model.Authorities;
import ru.netology.rest.repository.UserRepository;

import java.util.*;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@Service
public class AuthorizationService {

    UserRepository userRepository;
    @Autowired
    public void AuthorizationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<Authorities> getAuthorities(String user, String password) {
        if (isEmpty(user) || isEmpty(password)) {
            throw new InvalidCredentials("User name or password is empty");
        }
        List<Authorities> userAuthorities = userRepository.getUserAuthorities(user, password);
        if (isEmpty(userAuthorities)) {
            throw new UnauthorizedUser("Unknown user " + user);
        }
        return userAuthorities;
    }

    private boolean isEmpty(String str) {

        return str == null || str.isEmpty();
    }

    private boolean isEmpty(List<?> str) {

        return str == null || str.isEmpty();
    }

}
