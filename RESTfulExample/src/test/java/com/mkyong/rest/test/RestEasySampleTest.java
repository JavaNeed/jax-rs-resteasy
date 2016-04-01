package com.mkyong.rest.test;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

import org.junit.Test;

import com.mkyong.rest.Student;

public class RestEasySampleTest {

	// Below code is deprecated in RestEasy V 3.0.x, but will work in 2.2.x
	/*@Test
	public void testGetStudent() throws Exception{
		String str = "http://localhost:8080/RESTfulExample/rest/restwebservice/list";
		ClientRequest request = new ClientRequest(str);
		ClientResponse<List<Student>> response = request.get(new GenericType<List<Student>>(){});
		List<Student> students = response.getEntity();
		System.out.println("Size : "+students.size());
	}*/

	@Test
	public void testGetStudents(){
		final String str = "http://localhost:8080/RESTfulExample/rest/restwebservice/list";
		Client client = ClientBuilder.newClient();
		// This also works
		// Client client = ClientBuilder.newBuilder().build();  

		Response response = client.target(str).request().get();

		// This will gives us whole XML output
		String stringOutput = response.readEntity(String.class);
		System.out.println("STATUS : "+response.getStatus());
		System.out.println(stringOutput);
	}

	@Test
	public void testGetStu1(){
		final String str = "http://localhost:8080/RESTfulExample/rest/restwebservice/list";
		Client client = ClientBuilder.newClient();

		WebTarget target = client.target(str);

		List<Student> students =target.request().get(new GenericType<List<Student>>() {});
		System.out.println("Size Of Students : ["+students.size()+"]");
		for (Student student : students) {
			System.out.println("---------------------------------------");
			System.out.println(student.getStudent_id());
			System.out.println(student.getStudent_name());
			System.out.println(student.getStudent_rollnumber());
		}
	}
}
