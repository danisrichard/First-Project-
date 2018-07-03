package com.first_project.service.impl;

import com.first_project.entity.User;
import com.first_project.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private List<User> listOfUser = new ArrayList<>();

    public void addNewUserToList(User user){
        listOfUser.add(user);
    }

    public List<User> getAllUser(){
        return listOfUser;
    }
}
