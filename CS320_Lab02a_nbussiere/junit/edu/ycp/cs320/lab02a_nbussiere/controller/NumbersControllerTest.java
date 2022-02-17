package edu.ycp.cs320.lab02a_nbussiere.controller;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02a_nbussiere.controller.NumbersController;
import edu.ycp.cs320.lab02a_nbussiere.model.Numbers;

public class NumbersControllerTest {
	private Numbers model;
	private NumbersController controller;
	
	@Before
	public void setUp() {
		model = new Numbers();
		controller = new NumbersController();
		
		model.setUno(1);
		model.setDos(100);
		model.setTres(1);
		
		controller.setModel(model);
	}
	
	@Test
	public void testAdd() {
		
		double resultAdd = controller.add(model.getUno(), model.getDos(),model.getTres());
		assertTrue(resultAdd == 102);
	}
	
	@Test
	public void testMultiply() {
		double resultMultiply = controller.multiply(model.getUno(), model.getDos());
		assertTrue(resultMultiply == 100);
	}
}
