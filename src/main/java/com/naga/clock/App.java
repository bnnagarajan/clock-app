package com.naga.clock;

/**
 * Main Program to execute the ClockHandsAngleCalculator Implementation
 *
 */
public class App {
	/**
	 * Main method to execute the program to calculate the angle between the Hour hand and the Minute hand 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		ClockHandsAngleCalculatorImpl clockHandsAngleCalculatorImpl = new ClockHandsAngleCalculatorImpl();
        
        System.out.println("Angle for 12:00 :: " + clockHandsAngleCalculatorImpl.getAngle(12, 00));
        System.out.println("Angle for 12:01 :: " + clockHandsAngleCalculatorImpl.getAngle(12, 01));
        System.out.println("Angle for 03:15 :: " + clockHandsAngleCalculatorImpl.getAngle(3, 15));
        System.out.println("Angle for 06:00 :: " + clockHandsAngleCalculatorImpl.getAngle(6, 00));
        System.out.println("Angle for 09:45 :: " + clockHandsAngleCalculatorImpl.getAngle(9, 45));

	}

}
