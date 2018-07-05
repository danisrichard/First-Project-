package com.first_project.service;

import com.first_project.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface UserService {
    Iterable<User> getAllUser();

    void addNewUser(User user);

    Optional<User> findUserByFirstNameQuery(String firstName);

    List<User> findUserByFirstNameWithoutQuery(String firstName);
}
