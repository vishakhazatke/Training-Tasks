package com.example.employee_management.service;

import com.example.employee_management.dto.EmployeeDTO;
import com.example.employee_management.entity.Employee;
import com.example.employee_management.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository repository;

    public EmployeeServiceImpl(EmployeeRepository repository) {
        this.repository = repository;
    }

    private EmployeeDTO toDTO(Employee emp){
        EmployeeDTO dto = new EmployeeDTO();
        dto.setId(emp.getId());
        dto.setName(emp.getName());
        dto.setDepartment(emp.getDepartment());
        dto.setSalary(emp.getSalary());
        return dto;
    }

    private Employee toEntity(EmployeeDTO dto){
        Employee emp = new Employee();
        emp.setName(dto.getName());
        emp.setDepartment(dto.getDepartment());
        emp.setSalary(dto.getSalary());
        return emp;
    }
    @Override
    public EmployeeDTO createEmployee(EmployeeDTO dto) {
        Employee saved = repository.save(toEntity(dto));
        return toDTO(saved);
    }

    @Override
    public List<EmployeeDTO> getAllEmployees() {
        return repository.findAll()
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public EmployeeDTO getEmployeeById(Long id) {
        Employee emp = repository.findById(id).orElseThrow();
        return toDTO(emp);
    }

    @Override
    public EmployeeDTO updateEmployee(Long id, EmployeeDTO dto) {
        Employee emp = repository.findById(id).orElseThrow();
        emp.setName(dto.getName());
        emp.setDepartment(dto.getDepartment());
        emp.setSalary(dto.getSalary());
        return toDTO(repository.save(emp));
    }

    @Override
    public void deleteEmployee(Long id) {

        repository.deleteById(id);
    }
}
