package com.projectshub.securitydemo.controller;

import com.projectshub.securitydemo.model.User;
import com.projectshub.securitydemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/userlist")
    @PreAuthorize("hasRole('NORMAL')")
    public List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }


}
