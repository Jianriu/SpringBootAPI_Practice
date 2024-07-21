package com.tutorial.JavaSpringAPI.controller;

import com.tutorial.JavaSpringAPI.model.User;
import com.tutorial.JavaSpringAPI.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Controller provides the REST API functionality and how the user info can be accessed via URLs.
@RestController
@RequestMapping("/user")
public class UserController {

    //Communicates with the service layer
    UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("{userid}")
    public User getUser(@PathVariable("userid") String userid){ //Path variable takes the userid from URL path and places it in String userid variable
       return userService.getUser(userid);
    }

    @GetMapping()
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping()
    public String createUser(@RequestBody User newUser){
        return userService.createUser(newUser);
    }

    @PutMapping()
    public String updateUser(@RequestBody User newUser){
        return userService.updateUser(newUser);
    }

    @DeleteMapping("{userid}")
    public String deleteUser(@PathVariable("userid") String userid){
        return userService.deleteUser(userid);
    }


}
