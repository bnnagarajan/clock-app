package com.naga.clock;

/**
 * Implementation class to calculate the angle between the Hour hand and the Minute hand
 * 
 * @author Nagarajan Natarajan
 *
 */
public class ClockHandsAngleCalculatorImpl implements ClockHandsAngleCalculator {
    	private final int eachMinAngle = 360/60;
    	private final int eachHrAngle = 360/12;
	
	/* (non-Javadoc)
	 * @see com.naga.clock.ClockHandsAngleCalculator#getAngle(int, int)
	 */
	public float getAngle(int hour, int minute) {	    
	    // Make hour angle as 0 if the hour is 12
	    int hourAngle = (hour != 12) ? hour * eachHrAngle : 0;
	    int minAngle = minute * eachMinAngle;
	    
	    // Calculate the actual hour angle based on the minutes it had moved
	    float actualHrAngle = hourAngle + (eachHrAngle * (((float)minute / 60)));
	    
	    if(actualHrAngle >= minAngle) {
	        return (float)(actualHrAngle - minAngle);
	    } else {
	        return (float)(minAngle - actualHrAngle);
	    }
	}
}
