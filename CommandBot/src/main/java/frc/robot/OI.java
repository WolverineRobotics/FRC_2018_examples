package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

/*SECTION OI
* NOTE The OI class holds getters for everything that has to do with the Operator Interface (OI get it?)
* NOTE The OI class just makes code easier to read
*!SECTION */
public class OI {
  	private Joystick driver = new Joystick(0);

  	public double getDrive(){
    	return driver.getRawAxis(1);
  	}

  	public double getTurn(){
    	return driver.getRawAxis(4);
	}
	  
	public boolean getTestButton(){
		return driver.getRawButton(1);
	}
}