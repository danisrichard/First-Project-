package com.first_project.service;

import com.first_project.entity.User;

import java.util.List;
import java.util.concurrent.Future;

public interface UserService {
    Iterable<User> getAllUser();

    void addNewUser(User user);

    Future<User> findUserByFirstNameQuery(String firstName);

    List<User> findUserByFirstNameWithoutQuery(String firstName);
}
