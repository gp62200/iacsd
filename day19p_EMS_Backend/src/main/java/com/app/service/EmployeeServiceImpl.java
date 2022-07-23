package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.EmployeeRepository;
import com.app.pojos.Employee;
@Service
@Transactional
public class EmployeeServiceImpl implements IEmployeeService{
	@Autowired
	private EmployeeRepository empRepo;
	@Override
	public List<Employee> getAllEmpDetails(){
		return empRepo.findAll();
	}
	@Override
	public Employee saveEmpDetails(Employee transientEmp)
	{
		return empRepo.save(transientEmp);
	}
}
