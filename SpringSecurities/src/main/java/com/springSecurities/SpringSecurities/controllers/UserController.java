package com.springSecurities.SpringSecurities.controllers;

import com.springSecurities.SpringSecurities.Services.UserServices;
import com.springSecurities.SpringSecurities.models.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServices userServices;

    //all users
    @GetMapping("/")
    public List<Users>getAllUsers(){
        return this.userServices.getAllUsers();
    }

    //user by userName
    @GetMapping("/{username}")
    public Users getUser(@PathVariable("username") String userName){
        return this.userServices.getUser(userName);
    }

    @PostMapping("/add/{user}")
    public Users addUser(@RequestBody Users users){
        this.userServices.addUser(users);
        return users;
    }
}
