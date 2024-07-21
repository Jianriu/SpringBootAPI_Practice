package com.tutorial.JavaSpringAPI.service.impl;

import com.tutorial.JavaSpringAPI.exception.UserNotFoundException;
import com.tutorial.JavaSpringAPI.model.User;
import com.tutorial.JavaSpringAPI.repository.UserRepository;
import com.tutorial.JavaSpringAPI.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
//contains business layer logic, aka CRUD methods for the user table
@Service
public class UserServiceImpl implements UserService {

    //Repository layer must interact with service layer
    UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String createUser(User user) {
        userRepository.save(user);
        return "UserServiceImpl: create user successful";
    }

    @Override
    public String updateUser(User user) {
        userRepository.save(user);
        return "UserServiceImpl: update user successful";
    }

    @Override
    public User getUser(String id) {
        if (userRepository.findById(id).isEmpty()){
            throw new UserNotFoundException("user " + id + " does not exist.");
        }
        return userRepository.findById(id).get();

    }

    @Override
    public String deleteUser(String id) {
        if (userRepository.findById(id).isEmpty()){
            throw new UserNotFoundException("user " + id + " does not exist.");
        }
        userRepository.deleteById(id);
        return "UserServiceImpl: delete user successful";
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
