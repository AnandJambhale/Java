package com.codewithdurgesh.blog.payloads;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class UserDto {

    private int id;

    @NotEmpty
    @Size(min = 4, message = "Username must be minimun of 4 characters")
    private String name;

    @NotEmpty
    @Size(min = 3,max = 10, message = "Password must be of min 3 and min 3 character")
    private String password;

    @Email(message = "Email address is not valid")
    private String email;

    @NotEmpty
    private String about;
}
