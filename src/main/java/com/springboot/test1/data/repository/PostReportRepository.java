package com.springboot.test1.data.repository;

import com.springboot.test1.data.entity.PostReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostReportRepository extends JpaRepository<PostReport, Long> {
}
