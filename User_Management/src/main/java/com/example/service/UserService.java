package com.example.service;

import com.example.dtos.UserDto;
import com.example.entities.User;

import java.util.List;

public interface UserService {

    UserDto saveuser(UserDto userDto);

    UserDto updateUser(Integer userId);

    void deleteUser(UserDto userId);

    List<UserDto> getAllUsers();

    UserDto getUserById(Integer userId);
}
