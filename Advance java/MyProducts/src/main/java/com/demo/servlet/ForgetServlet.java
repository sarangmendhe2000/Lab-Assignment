package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.service.LoginService;
import com.demo.service.LoginServiceImpl;

public class ForgetServlet extends HttpServlet{

	public void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException, ServletException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		String name = req.getParameter("uname");
		String em = req.getParameter("email");
		String password = req.getParameter("pass");
		
		
		LoginService lservice = new LoginServiceImpl();
		
		boolean status = lservice.forgetPassword(name,em,password);
		
		if(status)
		{
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.forward(req, res);
		}
		else
		{
			out.println("Invalid Credential ! ");
			
		}
	}
}
