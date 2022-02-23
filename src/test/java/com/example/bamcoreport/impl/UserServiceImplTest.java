package com.example.bamcoreport.impl;

import com.example.bamcoreport.model.entity.User;
import com.example.bamcoreport.repository.UserRepository;
import com.example.bamcoreport.service.UserService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.List;


import static org.mockito.Mockito.verify;


class UserServiceImplTest {

    @InjectMocks
    UserService userService;

    @Mock
    UserRepository userRepository;

    @Test
    void getAllUsers() {

//        List<UserDto> list = new ArrayList<UserDto>();
//        UserDto userDto1 = new UserDto(3L , null,  true,  "Abdoulaadim",  "Abdoulaadim",  "Abdoulaadim",  "Abdoulaadim",  "Abdoulaadim",  "Abdoulaadim",
//        null,  null,  null,  null) ;
//        UserDto userDto2 = new UserDto(2L , null,  true,  "username",  "password",  "firstname",  "lastname",  "title",  "jobTitle",
//                null,  null,  null,  null) ;
//        UserDto userDto3 = new UserDto(4L , null,  true,  "Achraf",  "Achraf",  "Achraf",  "Achraf",  "Achraf",  "Achraf",
//                null,  null,  null,  null) ;
//        UserDto userDto4 = new UserDto(5L , null,  true,  "Mohamed",  "Mohamed",  "Mohamed",  "Mohamed",  "Mohamed",  "Mohamed",
//                null,  null,  null,  null) ;
//
//        list.add(userDto1);
//        list.add(userDto2);
//        list.add(userDto3);
//        list.add(userDto4);

//        List<User> user = userRepository.findAll();
//
//        Assertions.assertThat(user.size()).isGreaterThan(0);
//
//        List<User> expected = userService.getAllUsers();


        }


    @Test
    void createUser() {
    }

    @Test
    void updateUser() {
    }

    @Test
    void deleteUser() {
    }

    @Test
    void getUserById() {
    }

    @Test
    void testGetAllUsers() {
    }

    @Test
    void testCreateUser() {
    }

    @Test
    void testUpdateUser() {
    }

    @Test
    void testDeleteUser() {
    }

    @Test
    void testGetUserById() {
    }

    @Test
    void loadUserByUsername() {
    }
}