package com.first_project.service.Impl;

import com.first_project.entity.User;
import com.first_project.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private List<User> userList = new ArrayList<>();

    @Override
    public List<User> getAllUser() {
        return userList;
    }

    @Override
    public void addNewUserToList(User user) {
        userList.add(user);
    }
}
