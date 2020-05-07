package com.aws.codestar.projecttemplates.model;

import java.util.UUID;


public class User {

    private final UUID id;
    private final String name;
    //private final Role role;

    public User(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}