package edu.neu.csye6200.utils;

public enum StringRes {
    TITLE("Vimaan Airways"),
    BACK("Back");

    private final String value;

    StringRes(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

