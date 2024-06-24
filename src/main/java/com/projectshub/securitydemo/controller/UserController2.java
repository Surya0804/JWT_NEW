package com.projectshub.securitydemo.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/abcd")
public class UserController2 {

    @GetMapping("/home")
    @PreAuthorize("hasRole('ADMIN')")
    public String home()
    {
        return "welcome to Home";
    }
    @GetMapping("/palace")
    @PreAuthorize("hasRole('NORMAL')")
    public String palace()
    {
        return "welcome to Palace";
    }
    @GetMapping("/mansion")
    public String mansion()
    {
        return "welcome to Mansion";
    }
}
