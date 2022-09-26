package com.codewithdurgesh.blog.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Categeory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categeoryId;

    private String categeoryTitle;

    private String categeoryDescription;

    @OneToMany(mappedBy = "categeory",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Post> posts=new ArrayList<>();
}
