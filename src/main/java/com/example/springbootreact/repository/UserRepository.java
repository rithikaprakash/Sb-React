package com.example.springbootreact.repository;

import com.example.springbootreact.model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository  {
    int insertUser(User user);

    List<User> selectAllUsers();

    Optional<User> selectUserByEmail(String USER_EMAIL);




}
