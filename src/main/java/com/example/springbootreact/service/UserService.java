package com.example.springbootreact.service;

import com.example.springbootreact.model.User;
import com.example.springbootreact.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    public int addUser(User user){
        return userRepository.insertUser(user);
    }
    public List<User> getAllUsers() {
        return userRepository.selectAllUsers();
    }
    public Optional<User> getUserByEmail(String USER_EMAIL){
        return userRepository.selectUserByEmail(USER_EMAIL);
    }
}
