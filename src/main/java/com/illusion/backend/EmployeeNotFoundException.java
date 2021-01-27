package com.illusion.backend;

public class EmployeeNotFoundException extends RuntimeException {
    
    EmployeeNotFoundException(Long id) {
        super("Could not find Employee with id=" + id);
    }
}
