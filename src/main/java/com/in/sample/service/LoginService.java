package com.in.sample.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoginService {

    Logger logger= LoggerFactory.getLogger(LoginService.class);

    public boolean login(String username,String email){
        logger.info("Login Service Executed");
        return (username.equals("admin") && email.equals("admin"));
    }

}
