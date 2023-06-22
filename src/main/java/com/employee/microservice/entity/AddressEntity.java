package com.employee.microservice.entity;

import javax.persistence.Column;
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
@Table(name="Address")
public class AddressEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id",nullable=false)
	private long id;
	
	@Column(name="cityName",nullable=false)
	private String cityName;
	
	@Column(name="tahshil",nullable=false)
	private String tahshil;

	
	@Column(name="district",nullable=false)
	private String district;
	
	@Column(name="state",nullable=false)
	private String state;
	
	@Column(name="country",nullable=false)
	private String country;


	@Column(name="emp_id",nullable=false)
	private String empId;
	

}
