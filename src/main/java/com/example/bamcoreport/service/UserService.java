package com.example.bamcoreport.service;

import com.example.bamcoreport.model.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {

    List<User> getAllUsers();

    User createUser(User user);

    User updateUser(long id, User user);

    void deleteUser(long id);

    User getUserById(long id);

}
