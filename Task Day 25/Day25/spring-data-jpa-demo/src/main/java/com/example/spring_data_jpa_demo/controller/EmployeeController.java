package com.example.spring_data_jpa_demo.controller;

import com.example.spring_data_jpa_demo.entity.Employee;
import com.example.spring_data_jpa_demo.repository.EmployeeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeRepository repository;

    public EmployeeController(EmployeeRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Employee save(@RequestBody Employee e){
        return repository.save(e);
    }

    @GetMapping("/{id}")
    public Employee get(@PathVariable Long id){
        return repository.findById(id).orElse(null);
    }

    @GetMapping
    public List<Employee> getAll(){
        return repository.findAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        repository.deleteById(id);
    }

    @PostMapping("/batch")
    public void batch(){
        repository.saveAll(List.of(
                new Employee("Vishakha", "IT", 40000),
                new Employee("Vishu", "HR", 50000)
        ));
        repository.flush();
    }

    @GetMapping("/page")
    public Page<Employee> page(@RequestParam int page,
                               @RequestParam int size){

        return repository.findAll(PageRequest.of(page, size));
    }

    @GetMapping("/sort")
    public List<Employee> sort(){
        return repository.findAll(
                Sort.by("department").and(Sort.by("salary").descending())
        );
    }

    @GetMapping("/dept/{dept}")
    public List<Employee> dept(@PathVariable String dept){
        return repository.findByDepartment(dept);
    }

    @GetMapping("/high/{salary}")
    public List<Employee> high(@PathVariable double salary){
        return repository.findHighSalary(salary);
    }

    @GetMapping("/native/{dept}")
    public List<Employee> nativeQuery(@PathVariable String dept){

        return repository.findByDeptNative(dept);
    }

}
