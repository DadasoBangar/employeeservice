package com.employee.microservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="EmployeeEntity")

public class EmployeeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="empId",nullable=false)
	private int empId;
	
	@Column(name="emp_name",nullable=false)
	private String empName;
	
	@Column(name="emp_email",nullable=false)
	private String emp_email;
	
	/*
	 * @Column(name="emp_Address",nullable=false) private AddressEntity address;
	 */
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmp_email() {
		return emp_email;
	}

	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}

	/*
	 * public AddressEntity getAddress() { return address; }
	 * 
	 * public void setAddress(AddressEntity address) { this.address = address; }
	 */
	
	

}
