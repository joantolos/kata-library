package com.joantolos.library;

public class Member {

    private final String name;
    private final String id;
    private final String email;

    public Member(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}
