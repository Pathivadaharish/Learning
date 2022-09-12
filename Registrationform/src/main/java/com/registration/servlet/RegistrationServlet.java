package com.registration.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		//Take input from HTML page and display output using servlet.
		
		res.setContentType("text/html");
		String firstName=req.getParameter("FName");
		String lastName=req.getParameter("Lname");
		String email=req.getParameter("Email");
		String password=req.getParameter("Password");
		String contact=req.getParameter("Number");
		String address=req.getParameter("Address");
		String city=req.getParameter("city");
		String hobbies [] =req.getParameterValues("Hobbies");
		String gender=req.getParameter("Gender");
		
		
		PrintWriter p=res.getWriter();
		p.println("<html><body>");
		p.println("FirstName::"+firstName+"</br>");
		p.println("LastName::"+lastName+"</br>");
		p.println("Email::"+ email+"</br>");
		p.println("Password::"+password+"</br>");
		p.println("Contact::"+ contact+"</br>");
		p.println("Address::"+address+"</br>");
		p.println("City::"+ city+"</br>");
		p.println("Gender::"+gender+"</br>");
		p.println("Hobbies"+"</br>");
		for(String str:hobbies)
			p.println("::"+str);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		doGet(req,res);
	}
	
	
}
