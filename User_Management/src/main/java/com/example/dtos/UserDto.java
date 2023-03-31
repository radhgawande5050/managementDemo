package com.example.dtos;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UserDto {

    @Size(min=4,max=20,message ="Invalid name !!")
    @NotBlank
    private String name;
  @Pattern(regexp = "^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$",message = "Invalid Email !!")
  @NotBlank(message ="Invalid Email !!")
    private String email;

  @NotBlank(message = "Invalid Password")
    private String password;
  @NotBlank(message = "phoneNo is must required !!")
    private Integer phoneNo;

    private String address;

}
