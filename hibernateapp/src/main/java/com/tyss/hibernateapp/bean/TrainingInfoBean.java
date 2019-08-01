package com.tyss.hibernateapp.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrainingInfoBean {
	private int courseId;
	private String courseName;
	private String duration;
	private String type;

}
