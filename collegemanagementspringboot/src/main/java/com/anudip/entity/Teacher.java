package com.anudip.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Teacher
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tid;
	@Column(length=25, nullable = false)
	@NotBlank(message="Teacher name can not be blank..") // validation
	private String tname;
	
	@Column(length=25,nullable = false)
	@NotBlank(message="Trainer surname name can not be blank..") // validation
	private String tsurname;
	
	@Column(length=25,nullable = false, unique=true)
	@NotBlank(message="Trainer email can not be blank..") // validation
	@Email(message="Email id is not proper")
	private String temail;
	
	@Column(length=25,nullable = false, unique=true)
	@NotBlank(message="Phone Number can not be blank..") // validation
	private String tphone;
	
	@Column(length=25,nullable = false)
	@NotBlank(message="Designation can not be blank..") // validation
	private String designation;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTsurname() {
		return tsurname;
	}

	public void setTsurname(String tsurname) {
		this.tsurname = tsurname;
	}

	public String getTemail() {
		return temail;
	}

	public void setTemail(String temail) {
		this.temail = temail;
	}

	public String getTphone() {
		return tphone;
	}

	public void setTphone(String tphone) {
		this.tphone = tphone;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(int tid, @NotBlank(message = "Teacher name can not be blank..") String tname,
			@NotBlank(message = "Trainer surname name can not be blank..") String tsurname,
			@NotBlank(message = "Trainer email can not be blank..") @Email(message = "Email id is not proper") String temail,
			@NotBlank(message = "Phone Number can not be blank..") String tphone,
			@NotBlank(message = "Designation can not be blank..") String designation) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tsurname = tsurname;
		this.temail = temail;
		this.tphone = tphone;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", tname=" + tname + ", tsurname=" + tsurname + ", temail=" + temail
				+ ", tphone=" + tphone + ", designation=" + designation + "]";
	}
	
	
}
