package com.example.micha.password_validator;

import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordTest {

    @Test
    public void testPassword() {
        String s = "Password";
        assertTrue(!s.equals(null));
        assertEquals(s, s);

    }


}
