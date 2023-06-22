package com.employee.microservice.impl;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.microservice.dto.EmployeeDto;
import com.employee.microservice.entity.EmployeeEntity;
import com.employee.microservice.repository.EmployeeRepository;
import com.employee.microservice.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public String saveEmployee(EmployeeDto employeeDto) {
		EmployeeEntity employeeEntity = new EmployeeEntity();
		employeeEntity.setEmpId(employeeDto.getEmpId());
		employeeEntity.setEmpName(employeeDto.getEmpName());
		employeeEntity.setEmp_email(employeeDto.getEmpEmail());
		//employeeEntity.setAddress(employeeDto.getAddressEntity());
		employeeRepository.save(employeeEntity);

       System.out.println("Employee data inserted successfully");
		return "DATA INSERTED SUCESSFULLY";
	}

	@Override
	public Map<String, Object> getEmployeeeDetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
 