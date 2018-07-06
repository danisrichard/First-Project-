package com.first_project.config;

import com.first_project.service.Impl.UserServiceImpl;
import com.first_project.service.UserService;
import com.first_project.utils.LogLevel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestAppConfig {

    @Bean
    UserService userService(){
        return new UserServiceImpl();
    }

    @Bean
    LogLevel logLevel(){
        return new LogLevel();
    }
}
