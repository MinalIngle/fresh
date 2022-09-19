package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	// inject the EmployeeService here
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/get/{id}")
	public ResponseEntity<Optional<Employee>> getEmployeeById(@PathVariable("id") Integer id) {
		Optional<Employee> emp = employeeService.getEmployeeById(id);
		return ResponseEntity.ok().body(emp);
	}
}
