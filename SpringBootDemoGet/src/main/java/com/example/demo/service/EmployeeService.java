package com.example.demo.service;

import java.util.Optional;

import com.example.demo.model.Employee;

public interface EmployeeService {

	public Optional<Employee> getEmployeeById(Integer Id);
}
