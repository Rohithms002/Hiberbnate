package com.tyss.hibernateapp.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "employee_info")
public class EmployeeInfoBean {
	@Id
	private int id;
	private String name;
	private int age;
	private String gender;
	private double salary;
	private long phone;

	@Column(name = "joining_date")
	private Date joiningDate;

	@Column(name = "account_number")
	private String accountNumber;

	private String email;
	private String designation;
	@DateTimeFormat
	private Date dob;

	@Column(name = "dept_id")
	private int deptId;

	@Column(name = "mngr_id")
	private int mngrId;

}
