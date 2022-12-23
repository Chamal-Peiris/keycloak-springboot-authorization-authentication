package org.example.api;

import java.util.List;
import java.util.logging.Logger;

import org.example.entity.Employee;
import org.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    //this method can be accessed by user whose role is user
    @GetMapping("get-employee/{employeeId}")
    @RolesAllowed("user")
    public ResponseEntity<Employee> getEmployee(@PathVariable int employeeId) {
        return ResponseEntity.ok(service.getEmployee(employeeId));
    }

    //this method can be accessed by user whose role is admin
    @GetMapping("/get-all-employees")

    public ResponseEntity<List<Employee>> findALlEmployees() {
        return ResponseEntity.ok(service.getAllEmployees());

    }
}
