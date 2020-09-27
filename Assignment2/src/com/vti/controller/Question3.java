package com.vti.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Question3
 */
@WebServlet("/Question3")
public class Question3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Question3() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	// get parameter
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		// comparing username and password (hashcode)
		if ("datdeptrai".equals(username) && ("123456".equals(password))) {

			// send redirect to home page

//			RequestDispatcher dispatcher = request.getRequestDispatcher("home");
//			dispatcher.include(request, response);

			response.sendRedirect("https://www.google.com/");
		} else {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print("error!!!");

			// forward to login page
			RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
			dispatcher.include(request, response);
		}

	}
}
