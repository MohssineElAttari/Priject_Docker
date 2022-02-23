package com.example.bamcoreport.impl;

import com.example.bamcoreport.model.entity.User;
import com.example.bamcoreport.repository.UserRepository;
import com.example.bamcoreport.service.UserService;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserRepository userRepository;
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

//    public UserServiceImpl(UserRepository userRepository) {
//        super();
//        this.userRepository = userRepository;
//    }


    @Override
    public List<User> getAllUsers() {

        return userRepository.findAll();
    }

    @Override
    public User createUser(User user) {

        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    @Override
    public User updateUser(long id, User userRequest) {

        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User" + id));


        user.setUserContactInfo(userRequest.getUserContactInfo());
        user.setEnabled(userRequest.getEnabled());
        user.setUsername(userRequest.getUsername());
        user.setPassword(userRequest.getPassword());
        user.setFirstname(userRequest.getFirstname());
        user.setLastname(userRequest.getLastname());
        user.setTitle(userRequest.getTitle());
        user.setJobTitle(userRequest.getJobTitle());
        user.setManagerUserId(userRequest.getManagerUserId());
        user.setCreatedBy(userRequest.getCreatedBy());
        user.setCreationDate(userRequest.getCreationDate());
        user.setLastUpdate(userRequest.getLastUpdate());
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User"+id));

        userRepository.delete(user);
    }

    @Override
    public User getUserById(long id) {
        Optional<User> result = userRepository.findById(id);
        if(result.isPresent()) {
            return result.get();
        }else {
            throw new ResourceNotFoundException("User" + id);
        }
    }


    //-------------- Authentication Security ------------------------------------------------------------------------------

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User userEntity = userRepository.findByUsername(username);

        if(userEntity == null) throw new UsernameNotFoundException(username);

        return new org.springframework.security.core.userdetails.User(userEntity.getUsername(), userEntity.getPassword(), new ArrayList<>());
    }

    //----------------------------------------------------------------------------------------------

}
