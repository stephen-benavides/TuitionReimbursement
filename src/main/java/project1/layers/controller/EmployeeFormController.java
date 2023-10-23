package project1.layers.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import project1.layers.models.EmployeeFormSubmit;
import project1.layers.service.EmployeeFormService;

public class EmployeeFormController {
	
	public static EmployeeFormService efs = new EmployeeFormService();
	public static Gson gson = new Gson();

	public static void addForm(HttpServletRequest request, HttpServletResponse response) throws JsonSyntaxException, JsonIOException, IOException {
		
		EmployeeFormSubmit e = gson.fromJson(request.getReader(), EmployeeFormSubmit.class);
		
		System.out.println(e);
		
		EmployeeFormService.addForm(e);
		
		response.setStatus(200);
		
		//
		response.getWriter().append("http://localhost:8080/TRMS/logout.html");
		
		//System.out.println(response.get);
		
		
	}
}
 