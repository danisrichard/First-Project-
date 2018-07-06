package com.first_project.utils;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RunWith(SpringRunner.class)
class LogLevelTest {

    @Autowired
    private LogUtils logLevel;

    @Before
    public void init(){
        logLevel = new LogUtils();
    }

    @Test
    void getLevelInformationInJsonReturnObject() {
        assertNotNull(logLevel.getLevelInformationInJson("dsa"));
    }

    @Test
    void customLogLevel() {
    }
}