package com.anudip.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Student
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	
	@Column(length=25, nullable = false)
	@NotBlank(message = "Student Name cannot be blank")
	private String sfname;
	
	@Column(length=25)
	private String slname;
	
	@Column(length=25, nullable = false, unique = true)
	@NotNull(message = "Student phone cannot be null")
	private long sphone;
	
	@Column(length=25, nullable = false, unique = true)
	@NotBlank(message = "Student Email cannot be blank")
	@Email(message = "Email is incorrect")
	private String semail;
	
	@Column(length=20, nullable = false)
	@NotBlank(message = "Student Education cannot be blank")
	private String seduc;
	
	@Column(length=50, nullable = false)
	@NotBlank(message = "Student Address cannot be blank")
	private String saddr;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSfname() {
		return sfname;
	}

	public void setSfname(String sfname) {
		this.sfname = sfname;
	}

	public String getSlname() {
		return slname;
	}

	public void setSlname(String slname) {
		this.slname = slname;
	}

	public long getSphone() {
		return sphone;
	}

	public  void setSphone(long sphone) {
		this.sphone = sphone;
	}

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	public String getSeduc() {
		return seduc;
	}

	public void setSeduc(String seduc) {
		this.seduc = seduc;
	}

	public String getSaddr() {
		return saddr;
	}

	public void setSaddr(String saddr) {
		this.saddr = saddr;
	}

	public Student(int sid, @NotBlank(message = "Student Name cannot be blank") String sfname, String slname,
			@NotNull(message = "Student phone cannot be null") long sphone,
			@NotBlank(message = "Student Email cannot be blank") @Email(message = "Email is incorrect") String semail,
			@NotBlank(message = "Student Education cannot be blank") String seduc,
			@NotBlank(message = "Student Address cannot be blank") String saddr) {
		super();
		this.sid = sid;
		this.sfname = sfname;
		this.slname = slname;
		this.sphone = sphone;
		this.semail = semail;
		this.seduc = seduc;
		this.saddr = saddr;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sfname=" + sfname + ", slname=" + slname + ", sphone=" + sphone + ", semail="
				+ semail + ", seduc=" + seduc + ", saddr=" + saddr + "]";
	}
	
	
}
