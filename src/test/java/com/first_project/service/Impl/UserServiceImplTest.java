package com.first_project.service.Impl;

import com.first_project.entity.User;
import com.first_project.repository.UserRepository;
import com.first_project.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.ExecutionException;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class UserServiceImplTest {

    private static final Logger logger = LogManager.getLogger(UserServiceImplTest.class);

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @Before
    void init(){
    }

    private User getUser(){
        return new User("macska","cica");
    }

    @Test
    void getAllUser() {
    }

    @Test
    void addNewUser() {

        User user = getUser();

        User userDB = userRepository.save(user);

        logger.info(userDB.getFirstName());

        assertNotNull(userDB);

        assertEquals(user.getFirstName(),userDB.getFirstName());

    }

    @Test
    void findUserByFirstNameQuery() throws ExecutionException, InterruptedException {

    }

    @Test
    void findUserByFirstNameWithoutQuery() {
    }
}