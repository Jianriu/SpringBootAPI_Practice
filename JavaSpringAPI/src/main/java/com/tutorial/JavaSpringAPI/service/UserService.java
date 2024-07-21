package com.tutorial.JavaSpringAPI.service;

import com.tutorial.JavaSpringAPI.model.User;
import java.util.List;

//contains business layer logic, aka CRUD methods for the user table
//Not sure if this interface is really needed...
public interface UserService {
    public String createUser(User user);
    public String updateUser(User user);
    public User getUser(String id);
    public String deleteUser(String id);
    public List<User> getAllUsers();
}
