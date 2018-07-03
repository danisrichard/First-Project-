package com.first_project.service.Impl;

import com.first_project.entity.User;
import com.first_project.repository.UserRepository;
import com.first_project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Iterable<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public void addNewUserToList(User user) {
        userRepository.save(user);
    }
}
