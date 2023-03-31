package com.example.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="USER_DETAILS")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    @Column(name="User_Name")
    private String name;
    @Column(name="User_Email")
    private String email;
    @Column(name="User_Password")
    private String password;
    @Column(name="User_PhoneNo")
    private Integer phoneNo;
    @Column(name="User_Address")
    private String address;
}
