package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.app.pojos.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	List<Employee> findBySalaryGreaterThan(double salary);
	List<Employee> findByDepartmentAndWorkLocation(String dept,String loc);
	
	@Query("update Employee e set e.salary=e.salary+?1 where e.department=?2")
	@Modifying
	int updateEmpSalaryByDept(double salIncr,String deptName);

}
