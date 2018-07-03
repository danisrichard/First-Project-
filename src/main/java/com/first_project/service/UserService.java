package com.first_project.service;

import com.first_project.entity.User;

import java.util.List;

public interface UserService {

    void addNewUserToList(User user);

    List<User> getAllUser();
}
