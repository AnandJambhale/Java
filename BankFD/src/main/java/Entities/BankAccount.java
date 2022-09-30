package Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class BankAccount {
    @Id
    private int id;

    private long accNumber;

    private String holderName;

    private long balance;

    private long fd;
}
