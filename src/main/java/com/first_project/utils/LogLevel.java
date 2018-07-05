package com.first_project.utils;

import com.first_project.entity.LoggerInformation;
import com.google.gson.Gson;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class LogLevel {

    public String getLevelInformationInJson(String packageName) throws IllegalArgumentException{
        if(packageName == null) throw new IllegalArgumentException("Not valid input");
        Logger log = LogManager.getLogger(packageName);
        LoggerInformation loggerInformation = new LoggerInformation.Builder().withlevelName(log.getLevel().name()).withpackageName(log.getName()).build();

        return new Gson().toJson(loggerInformation);
    }

}
