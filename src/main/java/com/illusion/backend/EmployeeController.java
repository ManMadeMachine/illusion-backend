package com.illusion.backend;

import java.util.List;

import com.illusion.backend.dto.Employee;
import com.illusion.backend.services.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    List<Employee> all() {
       return employeeService.findAll(); 
    }

    @PostMapping("/employees")
    Employee create(@RequestBody Employee newEmployee) {
        return employeeService.create(newEmployee);
    }

    // // Single item

    // @GetMapping("/employees/{id}")
    // Employee one(@PathVariable Long id) {
    //     return repository.findById(id).orElseThrow(() -> new EmployeeNotFoundException(id));
    // }

    // @PutMapping("/employees/{id}")
    // Employee replacEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {
    //     return repository.findById(id)
    //             .map(employee -> {
    //                 employee.setName(newEmployee.getName());
    //                 employee.setRole(newEmployee.getRole());
    //                 return repository.save(employee);
    //             }).orElseGet(() -> {
    //                 newEmployee.setId(id);
    //                 return repository.save(newEmployee);
    //             });
    // }

    // @DeleteMapping("/employees/{id}")
    // void deleteEmployee(@PathVariable Long id) {
    //     repository.deleteById(id);
    // }
}
