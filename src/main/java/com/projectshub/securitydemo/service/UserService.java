package com.projectshub.securitydemo.service;

import com.projectshub.securitydemo.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private static final Logger log = LoggerFactory.getLogger(UserService.class);
    List<User> userData=new ArrayList<>();
    public UserService() {
        userData.add(new User("surya","surya123$","surya@gmail.com","ROLE_ADMIN"));
        userData.add(new User("raju","raju123$","raju@gmail.com","ROLE_NORMAL"));
    }


    public List<User> getAllUsers()
    {
     return userData;
    }

    public String addUser(User user)
    {
        userData.add(new User(user.getUsername(),user.getPassword(),user.getEmail(),user.getRole()));
        log.info(user.getUsername()+"  "+user.getPassword()+"   "+user.getEmail()+"   "+user.getRole());
        return "User added Successfully";
    }
}
