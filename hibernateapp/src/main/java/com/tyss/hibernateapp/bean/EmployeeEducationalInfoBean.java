package com.tyss.hibernateapp.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "employee_educationalinfo")
public class EmployeeEducationalInfoBean {
	@Id
	private int id;
	@Column(name = "education_type")
	private String educationType;
	@Column(name = "college_nm")
	private String collegeName;
	private String university;
	private int yop;
	private double percentage;
	private String location;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "emp_id")
	private EmployeeInfoBean employeeInfoBean;

}
