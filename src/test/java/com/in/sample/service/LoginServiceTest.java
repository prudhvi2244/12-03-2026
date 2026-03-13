package com.in.sample.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class LoginServiceTest {

    Logger logger= LoggerFactory.getLogger(LoginServiceTest.class);

    @InjectMocks
    LoginService loginService;

    @Test
    void testLoginWithValidUsernameAndEmail(){
        assertTrue(loginService.login("admin","admin"));
        logger.info("Test Login With Valid Username and Email");
    }
    @Test
    void testLoginWithInValidUsernameAndEmail(){
        assertFalse(loginService.login("admin1","admin1"));
        logger.info("Test Login With InValid Username and Email");
    }

    @Test
    void testLoginWithValidUsernameAndInvalidEmail(){
        assertFalse(loginService.login("admin1","admin1"));
        logger.info("Test Login With Valid Username and Invalid Email");
    }


}