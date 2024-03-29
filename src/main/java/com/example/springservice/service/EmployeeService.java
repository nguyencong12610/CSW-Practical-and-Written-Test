package com.example.springservice.service;


import com.example.springservice.jpa.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> listEmployee();
    Employee getEmployeeById(int emp_id);
    boolean saveEmployee(Employee employee);
    boolean deleteEmployee(int emp_id);
    boolean updateEmployee(Employee employee);

}
