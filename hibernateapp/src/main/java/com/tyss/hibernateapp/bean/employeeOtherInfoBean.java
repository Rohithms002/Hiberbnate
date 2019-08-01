package com.tyss.hibernateapp.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class employeeOtherInfoBean {

	private int id;
	private String pan;
	private boolean maritalStatus;
	private String bloodGroup;
	private boolean isChallenged;
	private long emrgencyContactNumber;
	private String emergencyContactName;
	private String nationality;
	private String religion;
	private String fatherName;
	private String motherName;
	private String spouseName;
	private String passport;
	private long aadhar;

}
