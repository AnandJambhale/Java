package Controllers;

import Entities.BankAccount;
import Services.BankServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
    @Autowired
    private static BankServices bankServices;

    @PostMapping("/add")
    public static BankAccount addAccount(@RequestBody BankAccount bankAccount){
        return bankServices.addAccount(bankAccount);
    }

//    public static void main(String[] args) {
//        BankAccount bankAccount=new BankAccount();
//        bankAccount.setAccNumber(123446);
//        bankAccount.setBalance(10000);
//        bankAccount.setHolderName("Anand Jambhale");
//        bankAccount.setFd(50000);
//        addAccount(bankAccount);
//    }
}
