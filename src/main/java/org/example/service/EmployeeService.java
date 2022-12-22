package org.example.service;

import org.example.entity.Employee;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public interface EmployeeService {
    public Employee getEmployee(int employeeId);
    public List<Employee> getAllEmployees();
}
