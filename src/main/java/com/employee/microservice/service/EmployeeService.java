package com.employee.microservice.service;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.employee.microservice.dto.EmployeeDto;

@Service
public interface EmployeeService {

	String saveEmployee(EmployeeDto employeeDto);

	Map<String, Object> getEmployeeeDetails();

}
