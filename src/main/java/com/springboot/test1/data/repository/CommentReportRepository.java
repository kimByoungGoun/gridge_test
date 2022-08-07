package com.springboot.test1.data.repository;

import com.springboot.test1.data.entity.CommentReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentReportRepository  extends JpaRepository<CommentReport, Long> {
}
