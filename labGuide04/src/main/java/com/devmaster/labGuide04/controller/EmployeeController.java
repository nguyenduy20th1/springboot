package com.devmaster.labGuide04.controller;

import com.devmaster.labGuide04.dto.EmployeeDTO;
import com.devmaster.labGuide04.entity.Employee;
import com.devmaster.labGuide04.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("employee")
public class EmployeeController {
    @Autowired
    private final EmployeeService employeeService;

    @GetMapping("/list")
    public List<Employee> getEmployeeList() {
        return employeeService.getEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addEmployee(@Valid @RequestBody EmployeeDTO employeeDTO) {
        employeeService.addEmployee(employeeDTO);
        return ResponseEntity.ok("Employee added successfully");
    }

    @PutMapping("/{id}")
    public EmployeeDTO updateEmployee(@Valid @RequestBody EmployeeDTO employeeDTO) {
        employeeService.updateEmployee(employeeDTO);
        return employeeDTO;
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable int id) {
        employeeService.deleteEmployee(id);
    }
}
