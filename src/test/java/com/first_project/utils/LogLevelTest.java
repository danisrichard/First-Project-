package com.first_project.utils;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RunWith(SpringRunner.class)
class LogLevelTest {

    @Autowired
    private LogLevel logLevel;

    @Before
    public void init(){
        logLevel = new LogLevel();
    }

    @Test
    void getLevelInformationInJsonReturnObject() {
        assertNotNull(logLevel.getLevelInformationInJson("dsa"));
    }

    @Test
    void customLogLevel() {
    }
}