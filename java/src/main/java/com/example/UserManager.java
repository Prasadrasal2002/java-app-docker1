package com.example;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> users;

    public UserManager() {
        users = new ArrayList<>();
    }

    public void addUser(String name, int age) {
        users.add(new User(name, age));
    }

    public List<User> getUsers() {
        return users;
    }
}
