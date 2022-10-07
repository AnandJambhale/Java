package com.codewithdurgesh.blog.repositories;

import com.codewithdurgesh.blog.entities.AccountTypes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountTypesRepo extends JpaRepository<AccountTypes, Integer> {
}
