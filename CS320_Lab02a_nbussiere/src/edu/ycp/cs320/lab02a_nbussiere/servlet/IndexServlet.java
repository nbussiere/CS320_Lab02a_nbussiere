package edu.ycp.cs320.lab02a_nbussiere.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("Index Servlet: doGet");
		
		req.getRequestDispatcher("/_view/index.jsp").forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("Index Servlet: doPost");
				
		if(req.getParameter("addNum") != null) {
			System.out.println("Add Numbers!");
			req.getRequestDispatcher("/_view/addNumbers.jsp").forward(req, resp);
		}		
		
		if(req.getParameter("multiplyNum") != null) {
			System.out.println("Multiply Numbers!");
			req.getRequestDispatcher("/_view/MultiplyNumbers.jsp").forward(req, resp);
		}	
		
		if(req.getParameter("guessGame") != null) {
			System.out.println("Guessing Game");
			req.getRequestDispatcher("/_view/guessingGame.jsp").forward(req, resp);
		}	
		
	}
}
