package com.tyss.hibernateapp.aws;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="employee_new")
public class EmployeeNew {
    @Id
	private int eid;
	private String name;
	private String email;
}
