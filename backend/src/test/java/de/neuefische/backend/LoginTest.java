package de.neuefische.backend;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoginTest {

    @Test
    void login() {
        assertEquals("Login!", Login.login());
    }
}