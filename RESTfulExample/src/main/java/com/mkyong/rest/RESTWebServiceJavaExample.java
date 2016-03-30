package com.mkyong.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/restwebservice")
public class RESTWebServiceJavaExample {
	private TreeMap<Integer, Student> webserviceMap= new TreeMap<>();

	public RESTWebServiceJavaExample(){

		Student student = new Student();
		student.setStudent_name("Ricky");
		student.setStudent_rollnumber("AOHP451");

		addStudent(student);

		student = new Student();
		student.setStudent_name("Mayer");
		student.setStudent_rollnumber("DKLP987");
		addStudent(student);

	}

	@GET
	@Path("list")
	@Produces(MediaType.APPLICATION_XML)
	//@Produces(MediaType.TEXT_PLAIN)
	public List<Student> getStudents() {
		List<Student> students = new ArrayList<Student>();
		students.addAll(webserviceMap.values());
		return students;
	}

	@POST
	@Path("add")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	public void addStudent(Student student_param) {
		int id = webserviceMap.size();
		student_param.setStudent_id(id);
		webserviceMap.put(id, student_param);
	}
}
