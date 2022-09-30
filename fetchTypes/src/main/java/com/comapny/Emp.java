package com.comapny;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Emp {

    @Id
    private int id;
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Project> project;
}
