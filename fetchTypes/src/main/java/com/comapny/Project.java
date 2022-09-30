package com.comapny;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Project {
    @Id
    private int id;
    private String ProName;

    @ManyToOne(cascade = CascadeType.ALL)
    private Emp emp;
}
