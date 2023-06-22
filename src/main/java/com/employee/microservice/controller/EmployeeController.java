package com.employee.microservice.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.microservice.dto.EmployeeDto;
import com.employee.microservice.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/employee")
	public String saveEmployee(@RequestBody EmployeeDto employeeDto )
	{
		String saveEmployee=employeeService.saveEmployee(employeeDto);
		return saveEmployee;
		
	}
	
	@GetMapping("/employee")
	public Map<String,Object> getEmployee()
	{
		Map<String,Object> getEmployeeDetails=employeeService.getEmployeeeDetails();
		return getEmployeeDetails;
	}
	
}
