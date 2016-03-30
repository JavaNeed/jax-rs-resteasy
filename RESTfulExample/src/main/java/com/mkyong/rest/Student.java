package com.mkyong.rest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {

	private int student_id;
	private String student_name;
	private String student_rollnumber;

	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_rollnumber() {
		return student_rollnumber;
	}
	public void setStudent_rollnumber(String student_rollnumber) {
		this.student_rollnumber = student_rollnumber;
	}
}