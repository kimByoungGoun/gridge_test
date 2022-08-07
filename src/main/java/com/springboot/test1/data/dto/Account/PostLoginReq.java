package com.springboot.test1.data.dto.Account;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostLoginReq {
    private String accountName;
    private String password;
}
