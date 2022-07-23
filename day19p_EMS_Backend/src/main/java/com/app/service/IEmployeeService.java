package com.app.service;

import java.util.List;

import com.app.pojos.Employee;

public interface IEmployeeService {
	List<Employee> getAllEmpDetails();
	
	Employee saveEmpDetails(Employee transientEmp);
}
