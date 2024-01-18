package com.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manage.Dto.EmployeeDto;
import com.manage.service.EmployeeService;
/*
@RestController
@CrossOrigin
@RequestMapping( "api/v1/employee")
public class EmployeeController {
	
	private EmployeeService employeeService;

	@PostMapping(path = "/save")
	public String saveEmployee(@RequestBody EmployeeDto employeeDto) {
		String id = EmployeeService.addEmployee(employeeDto);
		return id;
		
	}
}
*/
@RestController
@CrossOrigin
@RequestMapping("api/v1/employee")
public class EmployeeController {

    // Injection de dependences par le constructeur
    public EmployeeController(EmployeeService employeeService) {
    }

    @PostMapping(path = "/save")
    public String saveEmployee(@RequestBody EmployeeDto employeeDto) {
        String id = EmployeeService.addEmployee(employeeDto);
        return id;
    }
}
