package edu.ycp.cs320.lab02a_nbussiere.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ycp.cs320.lab02a_nbussiere.model.Numbers;

public class NumbersTest {
	private Numbers model;
	
	@Before
	public void setUp() {
		model = new Numbers();
	}
	
	@Test
	public void testSetUno() {
		model.setUno(1);
		assertTrue(model.getUno() == 1);
	}
	
	@Test
	public void testSetDos() {
		model.setDos(2);
		assertTrue(model.getDos() == 2);
	}
	
	@Test
	public void testSetTres() {
		model.setTres(3);
		assertTrue(model.getTres() == 3);
	}
	
	@Test
	public void testSetCalcular() {
		model.setCalcular(6);
		assertTrue(model.getCalcular() == 6);
	}
	
}
