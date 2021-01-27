package com.illusion.backend.services;

import java.util.ArrayList;
import java.util.List;

import com.illusion.backend.dto.Employee;
import com.illusion.backend.repositories.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> findAll() {
        List<Employee> employees = new ArrayList<>();
        employeeRepository.findAll().forEach(employees::add);;
        return employees;
    }
}
