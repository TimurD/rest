package com.tymur.rest.gender;

public enum Gender {
    MALE("male"), FEMALE("female");

    Gender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private final String name;
}
