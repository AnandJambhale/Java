package com.codewithdurgesh.blog.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@NoArgsConstructor
@Getter
@Setter
public class CategeoryDto {

    private Integer categeoryId;

    @NotBlank
    @Size(min = 4, message = "min size of this is 4")
    private String categeoryTitle;

    @NotBlank
    @Size(min = 10, message = "min size for this is 10")
    private String categeoryDescription;
}
