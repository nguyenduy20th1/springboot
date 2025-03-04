package com.devmaster.labGuide04.service;

import com.devmaster.labGuide04.dto.EmployeeDTO;
import com.devmaster.labGuide04.entity.Employee;
import com.devmaster.labGuide04.entity.MonHoc;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service("employee")
public class EmployeeService {
    List<Employee> employees = new ArrayList<>();

    public EmployeeService() {

    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Employee getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public Boolean addEmployee(EmployeeDTO employeeDTO) {
        try {
            System.out.println("Received EmployeeDTO: " + employeeDTO);

            Employee employee = new Employee();
            employee.setId(employees.size() + 1); // Tăng ID dựa trên kích thước danh sách hiện tại
            employee.setFullName(employeeDTO.getFullName());
            employee.setAge(employeeDTO.getAge());
            employee.setGender(employeeDTO.getGender());
            employee.setSalary(employeeDTO.getSalary());

            employees.add(employee);
            System.out.println("Added Employee: " + employee);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    public Boolean updateEmployee(EmployeeDTO employeeDTO) {
        for (Employee e : employees) {
            if (e.getId() == employeeDTO.getId()) {
                e.setFullName(employeeDTO.getFullName());
                e.setAge(employeeDTO.getAge());
                e.setGender(employeeDTO.getGender());
                e.setSalary(employeeDTO.getSalary());
                return true;
            }
        }
        return false;
    }


    public Boolean deleteEmployee(int id) {
        return employees.removeIf(employee -> employee.getId() == id);
    }
}
