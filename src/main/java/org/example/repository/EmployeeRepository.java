package org.example.repository;

import org.example.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.security.acl.LastOwnerException;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
