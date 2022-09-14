package com.springSecurities.SpringSecurities.Services;

import com.springSecurities.SpringSecurities.models.Users;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServices {
    List<Users> list=new ArrayList<>();

    public UserServices() {
        list.add(new Users("abc","abc","ana@gmail.com"));
        list.add(new Users("xyz","xyz","aba@gmail.com"));
    }

    //get all users
    public List<Users> getAllUsers(){
        return this.list;
    }

    //get single user
    public Users getUser(String userName){
        return  this.list.stream().filter(users -> users.getUserName().equals(userName)).findAny().orElse(null);
    }

    //add user
    public Users addUser(Users user){
        this.list.add(user);
        return user;
    }
}
