package com.first_project.entity;

public class LoggerInformation {

    private String packageName;
    private String levelName;

    private LoggerInformation() {
    }

    public static class Builder {
        private String packageName;
        private String levelName;

        public Builder() {
        }

        public Builder withpackageName(String packageName) {
            this.packageName = packageName;
            return this;  //By returning the builder each time, we can create a fluent interface.
        }

        public Builder withlevelName(String levelName) {
            this.levelName = levelName;
            return this;
        }


        public LoggerInformation build() {
            LoggerInformation account = new LoggerInformation();
            account.packageName = this.packageName;
            account.levelName = this.levelName;
            return account;
        }
    }

    @Override
    public String toString() {
        return "LoggerInformation{" +
                "packageName='" + packageName + '\'' +
                ", levelName='" + levelName + '\'' +
                '}';
    }
}

