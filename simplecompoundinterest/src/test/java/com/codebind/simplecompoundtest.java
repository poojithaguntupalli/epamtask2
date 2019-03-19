package com.codebind;

import static org.junit.Assert.*;

import org.junit.Test;

public class simplecompoundtest {

	@Test
	public void unittestcasesimpleinterest() {
		
	simplecompoundcalculation s=new simplecompoundcalculation();
	assertEquals(600,s.simpleinterest(3000,5,4));
	assertEquals(210,s.simpleinterest(3000,1,7));
	  assertEquals(1170,s.simpleinterest(15600, 1.5, 5));
	  }
	public void unittestcasecompoundinterest(){
		simplecompoundcalculation cal=new simplecompoundcalculation();
		assertEquals(254.400009,cal.compoundinterest(1000, 2, 12));
		assertEquals(30.449970,cal.compoundinterest(500,2,3));
		assertEquals(143.346527,cal.compoundinterest(900,5,3));
	}
