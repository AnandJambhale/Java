package com.codewithdurgesh.blog.repositories;

import com.codewithdurgesh.blog.entities.Categeory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategeoryRepo extends JpaRepository<Categeory,Integer> {

}
