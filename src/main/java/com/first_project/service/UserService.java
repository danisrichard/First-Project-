package com.first_project.service;

import com.first_project.entity.User;

public interface UserService {
    Iterable<User> getAllUser();

    void addNewUserToList(User user);
}
