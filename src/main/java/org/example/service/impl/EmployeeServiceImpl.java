package org.example.service.impl;

import org.example.entity.Employee;
import org.example.repository.EmployeeRepository;
import org.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @PostConstruct
    public void initializeEmployeeTable() {
        employeeRepository.saveAll(
                Stream.of(
                        new Employee("john", 20000),
                        new Employee("mak", 55000),
                        new Employee("peter", 120000)
                ).collect(Collectors.toList()));
    }
    @Override
    public Employee getEmployee(int employeeId) {
        return employeeRepository.findById(employeeId).orElse(null);
    }

    @Override
    public List<Employee> getAllEmployees() {
      return employeeRepository.findAll();
    }
}
