package com.in.sample.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class LoginServiceTest {

    @InjectMocks
    LoginService loginService;

    @Test
    void testLoginWithValidUSernameAndEmail(){
        assertTrue(loginService.login("admin","admin"));
    }

    @Test
    void testLoginWithInValidUSernameAndEmail(){
        assertTrue(loginService.login("admin1","admin1"));
    }

}