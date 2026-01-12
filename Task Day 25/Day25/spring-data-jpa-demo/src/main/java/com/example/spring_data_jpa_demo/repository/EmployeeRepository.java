package com.example.spring_data_jpa_demo.repository;

import com.example.spring_data_jpa_demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByDepartment(String department);
    List<Employee> findBySalaryBetween(double min, double max);
    List<Employee> findByNameLike(String name);
    List<Employee> findByDepartmentOrderBySalaryDesc(String department);

    @Query("SELECT e FROM Employee e WHERE e.salary > :salary")
    List<Employee> findHighSalary(@Param("salary") double salary);

    @Query(value = "SELECT * FROM employee WHERE department = :dept", nativeQuery = true)
    List<Employee> findByDeptNative(@Param("dept") String dept);
}
