package com.example;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("<h1>Login</h1><form id=\"login-form\" action=\"HelloServlet\" method=\"post\"><label for=\"username\">Username:</label><input type=\"text\" name=\"username\" required><br><br><label for=\"password\">Password:</label><input type=\"password\" name=\"password\" required><br><br><button type=\"submit\" >Login</button></form>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String password = request.getParameter("password");
		System.out.println("password:" + password);
		
		if (password.equals("hello"))
		{		
			System.out.println("correct");
			response.getWriter().append("correct password");
		}
		else
		{
			System.out.println("incorrect");
			response.getWriter().append("incorrect password");
		}
	}

}
