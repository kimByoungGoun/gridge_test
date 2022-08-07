package com.springboot.test1.data.repository;

import com.springboot.test1.data.entity.DM;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository  extends JpaRepository<DM, Long> {
}
