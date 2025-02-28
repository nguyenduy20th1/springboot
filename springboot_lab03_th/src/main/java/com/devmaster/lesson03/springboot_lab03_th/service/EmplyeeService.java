package com.devmaster.lesson03.springboot_lab03_th.service;

import com.devmaster.lesson03.springboot_lab03_th.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service("employee")
public class EmplyeeService {
    List<Employee> employees = new ArrayList<>();

    public EmplyeeService() {
        employees.addAll(Arrays.asList());
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Employee getEmployeeById(Long id) {
        return employees.stream()
                .filter(employee -> employee.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Employee addEmployee(Employee employee) {
        employees.add(employee);
        return employee;
    }

    public Employee updateEmployee(Long id ,Employee employee) {
        Employee checkEmployee = getEmployeeById(id);
        if (checkEmployee == null) {
            return null;
        }
        employees.forEach(emp -> {
            if (emp.getId().equals(id)) {
                emp.setFullName(employee.getFullName());
                emp.setGender(employee.getGender());
                emp.setAge(employee.getAge());
                emp.setSalary(employee.getSalary());
            }
        });
        return employee;
    }

    public boolean deleteEmployee(Long id) {
        Employee employee = getEmployeeById(id);
        return employees.remove(employee);
    }
}
