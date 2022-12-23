package org.example.service;

import org.example.entity.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import java.util.List;

public interface EmployeeService {
    public Employee getEmployee(int employeeId);
    public List<Employee> getAllEmployees();
}
