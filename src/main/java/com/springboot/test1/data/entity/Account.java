package com.springboot.test1.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.security.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "Account")
@Getter
@Setter
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int accountID;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String birthday;

    @Column(nullable = false)
    private String website;

    @Column(nullable = false)
    private String introduce;

    @Column(nullable = false)
    private LocalDateTime lastNameChange;

    @Column(nullable = false)
    private LocalDateTime lastUsernameChange;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime updatedAt;

    @Column(nullable = false)
    private char status;

    @Column(nullable = false)
    private boolean isPrivate;

}
