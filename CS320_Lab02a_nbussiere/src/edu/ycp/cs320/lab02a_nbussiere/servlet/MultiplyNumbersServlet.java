package edu.ycp.cs320.lab02a_nbussiere.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ycp.cs320.lab02a_nbussiere.controller.NumbersController;
import edu.ycp.cs320.lab02a_nbussiere.model.Numbers;

public class MultiplyNumbersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		System.out.println("MultiplyNumbers Servlet: doGet");	
		
		// call JSP to generate empty form
		req.getRequestDispatcher("/_view/MultiplyNumbers.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("MultiplyNumbers Servlet: doPost");
		

		// holds the error message text, if there is any
		String errorMessage = null;

		// result of calculation goes here
		Double calcular = null;
		
		// create Numbers model - model does not persist between requests
		// must recreate it each time a Post comes in 
		Numbers model = new Numbers();

		// create Numbers controller - controller does not persist between requests
		// must recreate it each time a Post comes in
		NumbersController controller = new NumbersController();
		
		//Error value for passing back the original value entered 
		Double errorValue = 0.0;
		
		//Storage of values as Strings in case of error
		String firstEntry = req.getParameter("first");
		String secondEntry = req.getParameter("second");
		String thirdEntry = req.getParameter("third");
				
		// assign model reference 
		controller.setModel(model);
				
		if(req.getParameter("back2Index") != null) {
			req.getRequestDispatcher("/_view/index.jsp").forward(req, resp);
		}	
				
		
		// decode POSTed form parameters and dispatch to controller
		
		try {
			Double curUno = getDoubleFromParameter(req.getParameter("first"));
			if (curUno == null) {
				errorMessage = "Please enter 2 numbers:First Number Empty";
				errorValue = 1.0;
			}
			
			else {
				model.setUno(curUno);
			}
		} catch (NumberFormatException e) {
			errorMessage = "Invalid double: First Entry";
			errorValue = 1.0;
		}
		
		try {
			Double curDos = getDoubleFromParameter(req.getParameter("second"));
			if (curDos == null) {
				errorMessage = "Please enter 2 numbers: Second Number Empty";
				errorValue = 2.0;
			}

			else {
				model.setDos(curDos);
			}
		} catch (NumberFormatException e) {
			errorMessage = "Invalid double: Second Entry";
			errorValue = 2.0;
		}
		
		if(errorMessage == null) {
			model.setCalcular(controller.multiply(model.getUno(),model.getDos()));
			req.setAttribute("errorMessage", errorMessage);
			req.setAttribute("MultiplyNum", model);
		}
		else {
			req.setAttribute("errorMessage", errorMessage);
			req.setAttribute("MultiplyNum", model);
			req.setAttribute("first", firstEntry);
			req.setAttribute("second", secondEntry);
			req.setAttribute("third", thirdEntry);
		}
		
		// Add parameters as request attributes
		// this creates attributes named "first" and "second for the response, and grabs the
		// values that were originally assigned to the request attributes, also named "first" and "second"
		// they don't have to be named the same, but in this case, since we are passing them back
		// and forth, it's a good idea

		// add result objects as attributes
		// this adds the errorMessage text and the result to the response
		
		
		// Forward to view to render the result HTML document
		req.getRequestDispatcher("/_view/MultiplyNumbers.jsp").forward(req, resp);
	}

	// gets double from the request with attribute named s
	private Double getDoubleFromParameter(String s) {
		if (s == null || s.equals("")) {
			return null;
		} else {
			return Double.parseDouble(s);
		}
	}
}
