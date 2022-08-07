package com.springboot.test1.data.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.security.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "PostLike")
@Getter
@Setter
public class PostLike {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int postLikeID;

    @Column(nullable = false)
    private int accountID;

    @Column(nullable = false)
    private char status;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime updatedAt;
}
