package com.codewithdurgesh.blog.services;

import com.codewithdurgesh.blog.entities.FD;
import com.codewithdurgesh.blog.repositories.FDRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FDService {
    @Autowired
    private FDRepo fdRepo;

    public FD setFD(FD fd){
        return this.fdRepo.save(fd);
    }

    public FD getFd(int id){
        return this.fdRepo.findById(id).orElseThrow(()->new RuntimeException("Not in database type a different id"));
    }
}
