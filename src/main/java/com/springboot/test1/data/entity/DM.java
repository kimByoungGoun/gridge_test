package com.springboot.test1.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.security.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "DM")
@Getter
@Setter
public class DM {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int DMID;

    @Column(nullable = false)
    private int accountID;

    @Column(nullable = false)
    private int targetaccountID;

    @Column(nullable = false)
    private String DM;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime updatedAt;
}
