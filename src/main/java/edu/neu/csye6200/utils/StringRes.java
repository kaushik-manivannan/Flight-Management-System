package edu.neu.csye6200.utils;

public enum StringRes {
    TITLE("Welcome to Airline Management System"),
    BACK("Back");

    private final String value;

    private StringRes(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

