package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.List;

class UserManagerTest {
    @Test
    void testUserAddition() {
        UserManager userManager = new UserManager();
        userManager.addUser("Alice", 25);
        
        List<User> users = userManager.getUsers();
        assertEquals(1, users.size());
        assertEquals("Alice", users.get(0).getName());
        assertEquals(25, users.get(0).getAge());
    }
}
