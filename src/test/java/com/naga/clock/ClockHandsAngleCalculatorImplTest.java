package com.naga.clock;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for ClockHandsAngleCalculatorImpl
 * 
 */
public class ClockHandsAngleCalculatorImplTest {

	@Test
	public void testClockHandsAngleCalculatorFor1200() {
		ClockHandsAngleCalculatorImpl clockHandsAngleCalculator = new ClockHandsAngleCalculatorImpl(); 
	
	    // assert statements
	    Assert.assertEquals("Angle for 12:00 must be 0", 0.0f, clockHandsAngleCalculator.getAngle(12, 00), 0.0f);
	}
	
	@Test
	public void testClockHandsAngleCalculatorFor1201() {
		ClockHandsAngleCalculatorImpl clockHandsAngleCalculator = new ClockHandsAngleCalculatorImpl(); 
	
	    // assert statements
	    Assert.assertEquals("Angle for 12:01 must be 5.5", 5.5f, clockHandsAngleCalculator.getAngle(12, 01), 0.0f);
	}
	
	@Test
	public void testClockHandsAngleCalculatorFor0315() {
		ClockHandsAngleCalculatorImpl clockHandsAngleCalculator = new ClockHandsAngleCalculatorImpl(); 
	
	    // assert statements
	    Assert.assertEquals("Angle for 03:15 must be 7.5", 7.5f, clockHandsAngleCalculator.getAngle(3, 15), 0.0f);
	}

	@Test
	public void testClockHandsAngleCalculatorFor0600() {
		ClockHandsAngleCalculatorImpl clockHandsAngleCalculator = new ClockHandsAngleCalculatorImpl(); 
	
	    // assert statements
	    Assert.assertEquals("Angle for 06:00 must be 180", 180.0f, clockHandsAngleCalculator.getAngle(6, 00), 0.0f);
	}

	@Test
	public void testClockHandsAngleCalculatorFor0945() {
		ClockHandsAngleCalculatorImpl clockHandsAngleCalculator = new ClockHandsAngleCalculatorImpl(); 
	
	    // assert statements
	    Assert.assertEquals("Angle for 09:45 must be 22.5", 22.5f, clockHandsAngleCalculator.getAngle(9, 45), 0.0f);
	    
	}
}
