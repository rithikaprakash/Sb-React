package com.example.springbootreact.controller;

import com.example.springbootreact.model.User;
import com.example.springbootreact.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest")
@CrossOrigin(origins = "*")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/add-user")
    public int addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/user/{email}")
    public User getUserByEmail(@PathVariable("email") String USER_EMAIL){
        return userService.getUserByEmail(USER_EMAIL)
                .orElse(null);
    }
}
