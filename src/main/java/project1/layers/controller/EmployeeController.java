package project1.layers.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import project1.layers.models.Employee;
import project1.layers.models.EmployeeSingleton;
import project1.layers.service.EmployeeService;

public class EmployeeController {
	
	public static EmployeeService es = new EmployeeService();
	public static Gson gson = new Gson();
	
	//Add a new User
	public static void addEmployee(HttpServletRequest request, HttpServletResponse response) throws JsonSyntaxException, JsonIOException, IOException {
		
		Employee e = gson.fromJson(request.getReader(), Employee.class);
		
		EmployeeService.addEmployee(e);
	
		System.out.println(request.getReader().toString());
	}
	
	//User Logging
	public static void userLogging(HttpServletRequest request, HttpServletResponse response) throws JsonSyntaxException, JsonIOException, IOException {
		//Connecting with the singleton to access through one connection
		EmployeeSingleton.getInstance();
		Employee e = gson.fromJson(request.getReader(), Employee.class);
		
		
//		EmployeeSingleton.setUsername(e.getUsername());
//		EmployeeSingleton.setPassword(e.getPassword());
//		EmployeeSingleton.setRole_id(EmployeeService.logging(e.getUsername(), e.getPassword()));
		
		EmployeeSingleton.setUsername(e.getUsername());
		EmployeeSingleton.setPassword(e.getPassword());
		
		EmployeeService.logging(e.getUsername(), e.getPassword());
		
		
//		//To test the input from the user and print it to the java console
//		Enumeration<String> params = request.getParameterNames(); 
//		while(params.hasMoreElements()){
//		 String paramName = params.nextElement();
//		 System.out.println("Parameter Name - "+paramName+", Value - "+request.getParameter(paramName));
//		}
//		
		


		response.setStatus(200);
		
		System.out.println(EmployeeSingleton.getInstance().getUsername());
		System.out.println(EmployeeSingleton.getInstance().getPassword());
		System.out.println(EmployeeSingleton.getInstance().getRole_id());
		System.out.println(EmployeeSingleton.getInstance().getEmployee_id());
		
		
		int role_id = EmployeeSingleton.getInstance().getRole_id();
		
		switch(role_id) {
		//Employee Login
		case 1:{
			response.getWriter().append("http://localhost:8080/TRMS/employee-landing.html");
			break; 
		}
		//Direct Supervisor Login 
		case 2: {
			response.getWriter().append("http://localhost:8080/TRMS/direct-supervisor-landing.html");
			break;
		}
		//Department Head 
		case 3: {
			response.getWriter().append("http://localhost:8080/TRMS/department-head-landing.html");
			break;
		}
		//BenCo
		case 4: {
			response.getWriter().append("http://localhost:8080/TRMS/benco-landing.html");
			break;
		}
		default: {
			response.getWriter().append("http://localhost:8080/TRMS/home.html");
			break;
		}
		}
		
	//System.out.println(response.getWriter().toString());
	}
	
	public static void userLogout(HttpServletRequest request, HttpServletResponse response) throws IOException {
		EmployeeSingleton.logout();
		response.setStatus(200);
		response.getWriter().append("http://localhost:8080/TRMS/home.html");
	}
	
} 
