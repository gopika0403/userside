package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity

public class Userentity {
	@Id
	private int userid;
	private String firstname;
	private String lastname;
	private int age;
	private String password;
	private int phnno;
	public Userentity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Userentity(int userid, String firstname, String lastname, int age, String password, int phnno) {
		super();
		this.userid = userid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.password = password;
		this.phnno = phnno;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPhnno() {
		return phnno;
	}
	public void setPhnno(int phnno) {
		this.phnno = phnno;
	}
}