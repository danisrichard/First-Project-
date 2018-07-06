package com.first_project.utils;

import com.first_project.entity.LoggerInformation;
import com.google.gson.Gson;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.core.config.LoggerConfig;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Optional;

@Component
public class LogUtils {

    private static final Logger utilsLogger = LogManager.getLogger(LogUtils.class);
    
    public String getLevelInformationInJson(String packageName) throws IllegalArgumentException{
        if(packageName == null) throw new IllegalArgumentException("Not valid input");
        Logger log = LogManager.getLogger(packageName);

        return new Gson().toJson(getLoggerInformation(log.getName(), log.getLevel().name()));
    }

    public String setCustomLogLevel(String logLevel, String packageName) throws IllegalArgumentException{
        if(checkInputs(logLevel,packageName)) throw new IllegalArgumentException("Not valid input!");

        try {
            Level concreteLevel = getConcreteLevel(logLevel);

            //org.apache.logging.slf4j.SLF4JLoggerContext cannot be cast to org.apache.logging.log4j.core.LoggerContext

            /*
            LoggerContext ctx = (LoggerContext) LogManager.getContext(false);
            Configuration config = ctx.getConfiguration();
            LoggerConfig loggerConfig = config.getLoggerConfig(packageName);
            loggerConfig.setLevel(concreteLevel);
            ctx.updateLoggers();
            */

            /*
            Configurator.setLevel(packageName, concreteLevel);
            */

            return new Gson().toJson(getLoggerInformation(packageName, logLevel.toUpperCase()));

        }catch (Exception e){
            utilsLogger.info("Exception: " + e.getMessage());
        }

        return null;
    }

    private LoggerInformation getLoggerInformation(String packageName, String s) {
        return new LoggerInformation.Builder()
                .withLevelName(s)
                .withPackageName(packageName)
                .build();
    }

    @NotNull
    private Level getConcreteLevel(String logLevel) {
        Level[] levels = Level.values();

        Optional<Level> optionalLevel = Arrays.stream(levels).filter(e -> e.name().equalsIgnoreCase(logLevel)).findFirst();

        return optionalLevel.get();
    }

    private boolean checkInputs(String logLevel, String packageName) {
        return logLevel == null && packageName == null;
    }


}
