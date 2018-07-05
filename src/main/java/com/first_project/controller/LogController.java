package com.first_project.controller;

import com.first_project.utils.LogLevel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {

    private static final Logger logger = LogManager.getLogger(LogController.class);

    @Autowired
    private LogLevel logLevel;

    @GetMapping("/config/loglevel/get{packageName}")
    public String logLevel(@RequestParam(value = "packageName", required = false) String packageName){
        return logLevel.getLevelInformationInJson(packageName);
    }
}
