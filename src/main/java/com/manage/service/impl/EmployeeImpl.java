package com.manage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manage.Dto.EmployeeDto;
import com.manage.Entity.Employee;
import com.manage.Repo.EmployeeRepo;
import com.manage.service.EmployeeService;

@Service

public class EmployeeImpl implements EmployeeService {
	@Autowired
	private EmployeeRepo employeeRepo;

	@Autowired
	public  String addEmployee(EmployeeDto employeeDto) {
		Employee employee = new Employee(
				employeeDto.getEmployeeId(),
				employeeDto.getEmployeeName(),
				employeeDto.getAddress(),
				employeeDto.getMobile());
		employeeRepo.save(employee);
		
		return employee.getEmployeeName();
	}
	
}
