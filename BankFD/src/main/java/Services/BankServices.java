package Services;

import Entities.BankAccount;
import Repositories.BankRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankServices {

    @Autowired
    private BankRepo bankRepo;

    public BankAccount addAccount(BankAccount bankAccount){
        return this.bankRepo.save(bankAccount);
    }

}
