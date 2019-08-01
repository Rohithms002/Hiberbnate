package com.tyss.hibernateapp.cache;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.Data;

@Data
@Entity
@Table(name="employee_new")
@Cacheable
@Cache(usage= CacheConcurrencyStrategy.READ_ONLY,region="employee_new")
public class EmployeeNew implements Serializable{
    @Id
	private int eid;
	private String name;
	private String email;
}
