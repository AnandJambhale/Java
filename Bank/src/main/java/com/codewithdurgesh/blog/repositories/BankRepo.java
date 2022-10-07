package com.codewithdurgesh.blog.repositories;

import com.codewithdurgesh.blog.entities.BankAcc;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepo extends JpaRepository<BankAcc,Integer> {
    BankAcc findByAccNum(Integer accNum);
}
