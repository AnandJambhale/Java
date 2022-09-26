package com.codewithdurgesh.blog.services.impl;

import com.codewithdurgesh.blog.entities.User;
import com.codewithdurgesh.blog.exceptions.ResourceNotFoundException;
import com.codewithdurgesh.blog.payloads.UserDto;
import com.codewithdurgesh.blog.repositories.UserRepo;
import com.codewithdurgesh.blog.services.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UserDto addUser(UserDto userDto) {
        User user=this.dtoToUser(userDto);
        User savedUser =this.userRepo.save(user);
        return this.userToDto(savedUser);
    }

    @Override
    public UserDto updateUser(UserDto userDto, Integer userid) {
        User user=this.userRepo.findById(userid).orElseThrow(()->new ResourceNotFoundException("User","id",userid));

        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setAbout(userDto.getAbout());

        User updatedStudent=this.userRepo.save(user);
        UserDto userDto1=this.userToDto(updatedStudent);

        return userDto1;
    }

    @Override
    public UserDto getUserById(Integer userId) {
        User user=this.userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("User","Id",userId));
        return this.userToDto(user);
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<User> users=this.userRepo.findAll();

        List<UserDto>usewrDtos=users.stream().map(user -> this.userToDto(user)).collect(Collectors.toList());
        return usewrDtos;
    }

    @Override
    public void deleteUser(Integer userId) {
        User user=this.userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("User","Id",userId));
        this.userRepo.delete(user);
    }

    public User dtoToUser(UserDto userDto){
//        User user=new User(userDto.getId(), userDto.getName(), userDto.getEmail(), userDto.getPassword(), userDto.getAbout());

        User user=this.modelMapper.map(userDto,User.class);
        return user;
    }

    public UserDto userToDto(User user){
//        UserDto userDto=new UserDto(user.getId(), user.getName(), user.getPassword(), user.getEmail(), user.getAbout());
        UserDto userDto=this.modelMapper.map(user,UserDto.class);
        return userDto;
    }
}
