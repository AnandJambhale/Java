package Repositories;

import Entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepo extends JpaRepository<BankAccount,Integer> {

}
