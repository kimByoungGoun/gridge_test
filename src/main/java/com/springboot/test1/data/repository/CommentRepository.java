package com.springboot.test1.data.repository;

import com.springboot.test1.data.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository  extends JpaRepository<Comment, Long> {
}
