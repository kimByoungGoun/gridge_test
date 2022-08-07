package com.springboot.test1.data.repository;

import com.springboot.test1.data.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository  extends JpaRepository<Account, Long> {
}
