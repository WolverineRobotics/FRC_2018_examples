package frc.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OI {
  private Joystick driver = new Joystick(0);

  public double getDrive(){
    return driver.getRawAxis(1);
  }

  public double getTurn(){
    return driver.getRawAxis(4);
  }
}
