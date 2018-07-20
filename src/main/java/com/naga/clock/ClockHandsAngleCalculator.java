package com.naga.clock;

/**
 * @author Nagarajan Natarajan
 *
 */
public interface ClockHandsAngleCalculator {
	/**
	 * Function to calculate the angle between the Hour hand and the Minute hand
	 *   
	 * @param hour
	 * @param minute
	 * @return float the angle between Hour hand and the Minute hand
	 */
	float getAngle(int hour, int minute);
}
