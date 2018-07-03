package com.first_project.service;

import com.first_project.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();

    void addNewUserToList(User user);
}
