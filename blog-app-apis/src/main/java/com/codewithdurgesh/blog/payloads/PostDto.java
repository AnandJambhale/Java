package com.codewithdurgesh.blog.payloads;

import com.codewithdurgesh.blog.entities.Categeory;
import com.codewithdurgesh.blog.entities.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {

    private String title;

    private String content;

    private String imageName;

    private Date addedDate;

    private CategeoryDto categeory;

    private UserDto user;
}
