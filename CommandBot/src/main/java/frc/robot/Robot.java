package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.subsystems.ChassisSubsystem;

public class Robot extends TimedRobot {
  public ChassisSubsystem chassis = new ChassisSubsystem();
  public OI oi = new OI();

  @Override
  public void robotInit() {
  }

  @Override
  public void robotPeriodic() {
  }

  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
  }

  @Override
  public void autonomousInit() {
  }

  @Override
  public void autonomousPeriodic() {
  }

  @Override
  public void teleopInit() {
  }

  @Override
  public void teleopPeriodic() {
  }
}
