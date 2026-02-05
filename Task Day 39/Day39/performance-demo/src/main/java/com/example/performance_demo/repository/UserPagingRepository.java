package com.example.performance_demo.repository;

import com.example.performance_demo.entity.User;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPagingRepository extends JpaRepository<User, Long> {
    Page<User> findAll(Pageable pageable);
}
