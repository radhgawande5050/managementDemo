package com.example.service.impl;

import com.example.dtos.UserDto;
import com.example.entities.User;
import com.example.exception.ResourceNotFoundException;
import com.example.repositories.UserRepository;
import com.example.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userrepo;

    @Autowired
    private ModelMapper modelmapper;


    @Override
    public UserDto saveuser(UserDto userDto) {
        User user = this.modelmapper.map(userDto, User.class);
        User saveuser = this.userrepo.save(user);
        UserDto userDto1 = this.modelmapper.map(saveuser, UserDto.class);
        return userDto1;
    }

    @Override
    public UserDto updateUser(Integer userId) {
         this.userrepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("User not found !!"));
        return null;
    }

    @Override
    public void deleteUser(UserDto userId) {

    }

    @Override
    public List<UserDto> getAllUsers() {
        return null;
    }

    @Override
    public UserDto getUserById(Integer userId) {
        return null;
    }
}
