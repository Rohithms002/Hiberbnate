package com.tyss.hibernateapp.bean;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeExperienceInfoBean {

	private int id;       
	private String companyName;
	private String destination;
	private Date joiningDate;
	private Date leavingDate;

}
