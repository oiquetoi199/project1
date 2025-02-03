package com.project1.myproject.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {
    private long id;
    private String email;
    private String password;
    private String fullName;
    private String address;
    private String phone;
}
