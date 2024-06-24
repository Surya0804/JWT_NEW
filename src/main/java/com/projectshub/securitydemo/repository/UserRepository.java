package com.projectshub.securitydemo.repository;

import com.projectshub.securitydemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {

    public User findByUsername(String username);

}
