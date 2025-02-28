package com.devmaster.lesson03.springboot_lab03_th.controller;

import com.devmaster.lesson03.springboot_lab03_th.entity.Employee;
import com.devmaster.lesson03.springboot_lab03_th.service.EmplyeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmplyeeService emplyeeService;

    @GetMapping("/employee-list")
    public List<Employee> getEmployees() {
        return emplyeeService.getEmployees();
    }

    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable String id) {
        Long idEmployee = Long.parseLong(id);
        return emplyeeService.getEmployeeById(idEmployee);
    }

    @PostMapping("/employee-add")
    public Employee addEmployee(Employee employee) {
        return emplyeeService.addEmployee(employee);
    }

    @PutMapping("/employee/{id}")
    public Employee updateEmployee(@PathVariable String id,@RequestBody Employee employee) {
        Long idEmployee = Long.parseLong(id);
        return emplyeeService.updateEmployee(idEmployee,employee);
    }

    @DeleteMapping("/employee/{id}")
    public boolean deleteEmployee(String id) {
        Long idEmployee = Long.parseLong(id);
        return emplyeeService.deleteEmployee(idEmployee);
    }
}
