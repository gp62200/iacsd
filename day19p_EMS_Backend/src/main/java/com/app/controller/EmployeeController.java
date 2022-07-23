package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Employee;
import com.app.service.IEmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	@Autowired
	private IEmployeeService empService;
	
	public EmployeeController() {
		System.out.println("in ctor "+getClass());
	}
	@GetMapping
	public List<Employee> listAllEmps()
	{
		System.out.println("in list emps");
		return empService.getAllEmpDetails();
	}
	@PostMapping
	public Employee saveEmpDetails(@RequestBody Employee emp)
	{
		System.out.println("insave emp "+emp);
		return empService.saveEmpDetails(emp);
		
	}
}
