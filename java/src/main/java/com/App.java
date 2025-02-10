package com.example;

public class App {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        userManager.addUser("Alice", 25);
        userManager.addUser("Bob", 30);

        System.out.println("Users in the system:");
        for (User user : userManager.getUsers()) {
            System.out.println(user);
        }
    }
}
