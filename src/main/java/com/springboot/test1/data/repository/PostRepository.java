package com.springboot.test1.data.repository;

import com.springboot.test1.data.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository  extends JpaRepository<Post, Long> {
}
