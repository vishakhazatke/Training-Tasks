package com.example.performance_demo.repository;

import com.example.performance_demo.entity.Customer;
import org.springframework.data.jpa.repository.*;
import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    // N+1 problem
    List<Customer> findAll();

    // EntityGraph fix
    @EntityGraph(attributePaths = "addresses")
    @Query("select c from Customer c")
    List<Customer> findAllWithAddresses();
}
