package com.naga.clock;

/**
 * Implementation class to calculate the angle between the Hour hand and the Minute hand
 * 
 * @author Nagarajan Natarajan
 *
 */
public class ClockHandsAngleCalculatorImpl implements ClockHandsAngleCalculator {

	/* (non-Javadoc)
	 * @see com.naga.ClockHandsAngleCalculator#getAngle(int, int)
	 */
	public float getAngle(int hour, int minute) {
		int eachMinAngle = 360/60;
        int eachHrAngle = 360/12;
        
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
