package com.example.springormdemo.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JdbcEmployeeRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void createTableIfNotExists(){
        jdbcTemplate.execute("""
                 CREATE TABLE IF NOT EXISTS jdbc_employee(
                   id INT PRIMARY KEY AUTO_INCREMENT,
                   name VARCHAR(50),
                   salary DOUBLE
                   )
                 """);
    }

    public int save(JdbcEmployee emp){
        return jdbcTemplate.update(
              "INSERT INTO jdbc_employee(name, salary) VALUE (?, ?)",
                emp.getName(), emp.getSalary()
        );
    }

    public List<JdbcEmployee> findAll(){
        return jdbcTemplate.query(
                "SELECT * FROM jdbc_employee",
                 (rs, rowNum) -> {
                    JdbcEmployee e = new JdbcEmployee();
                    e.setId(rs.getInt("id"));
                    e.setName(rs.getString("name"));
                    e.setSalary(rs.getDouble("salary"));
                    return e;
                 }
        );
    }

    public int update(JdbcEmployee emp){
        return jdbcTemplate.update(
                "UPDATE jdbc_employee SET name=?, salary=? WHERE id=?",
                emp.getName(), emp.getSalary(), emp.getId()
        );
    }

    public int delete(int id){
        return jdbcTemplate.update(
                "DELETE FROM jdbc_employee WHERE id=?", id
        );
    }
}
