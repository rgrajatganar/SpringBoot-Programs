package com.anudip.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


@Entity
public class Deparment {

	@Id
	private int did;
	
	@Column(length=20, nullable = true)
	@NotBlank(message = "Department Name cannot be blank")
	private String deptName;
	
	@Column(length=20)
	private String deptHOD;
	
	@Column(length=40, nullable = true)
	@NotNull(message = "kindly mention no of employess")
	private int onOfEmpl;

	public Deparment(int did, @NotBlank(message = "Department Name cannot be blank") String deptName, String deptHOD,
			@NotNull(message = "kindly mention no of employess") int onOfEmpl) {
		super();
		this.did = did;
		this.deptName = deptName;
		this.deptHOD = deptHOD;
		this.onOfEmpl = onOfEmpl;
	}
	
	
}
