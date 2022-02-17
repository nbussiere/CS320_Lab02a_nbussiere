package edu.ycp.cs320.lab02a_nbussiere.controller;

import edu.ycp.cs320.lab02a_nbussiere.model.Numbers;

public class NumbersController {
	private Numbers model;

	
	public Double add(Double first, Double second, Double third) {
		return first + second + third;
	}
	
	public Double multiply(Double first, Double second) {
		return first * second;
	}
	
	/**
	 * Set the model.
	 * 
	 * @param model the model to set
	 */
	public void setModel(Numbers model) {
		this.model = model;
	}
	
	
	
}

	
	

