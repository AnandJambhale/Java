package com.codewithdurgesh.blog.services;

import com.codewithdurgesh.blog.payloads.CategeoryDto;

import java.util.List;

public interface CategeoryService {
    //create
    CategeoryDto createCategeory(CategeoryDto categeoryDto);

    //update
    CategeoryDto updateCategeory(CategeoryDto categeoryDto,Integer categeoryId);

    //delete
    void deleteCategeory(Integer categeoryId);

    //get
    CategeoryDto getCategeory(Integer categeoryId);

    //getAll
    List<CategeoryDto> getAll();
}
