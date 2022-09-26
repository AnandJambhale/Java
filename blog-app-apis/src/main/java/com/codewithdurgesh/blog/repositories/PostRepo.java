package com.codewithdurgesh.blog.repositories;

import com.codewithdurgesh.blog.entities.Categeory;
import com.codewithdurgesh.blog.entities.Post;
import com.codewithdurgesh.blog.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepo extends JpaRepository<Post, Integer> {

    List<Post> findByUser(User user);
    List<Post> findByCategeory(Categeory categeory);

}
