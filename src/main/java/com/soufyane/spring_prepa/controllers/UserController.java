package com.soufyane.spring_prepa.controllers;

import com.soufyane.spring_prepa.domains.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/user")
    public User getUser() {
        User soufyane = new User();
        soufyane.setFirstName("soufyane");
        soufyane.setLastName("RAHHAL");
        return soufyane;
    }
}
