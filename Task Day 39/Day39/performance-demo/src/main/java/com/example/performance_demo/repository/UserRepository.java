package com.example.performance_demo.repository;

import com.example.performance_demo.dto.UserOrderDTO;
import com.example.performance_demo.entity.User;
import org.springframework.data.jpa.repository.*;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    // Lazy loading problem
    @Query("select u from User u")
    List<User> findAllUsers();

    // Fetch join optimization
    @Query("select u from User u join fetch u.orders")
    List<User> findUsersWithOrders();

    // DTO projection
    @Query("""
        select new com.example.performance_demo.dto.UserOrderDTO(u.name, o.product)
        from User u join u.orders o
    """)
    List<UserOrderDTO> findUserOrderDTO();
}
