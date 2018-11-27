package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.robot.subsystems.ChassisSubsystem;

/*SECTION
 * NOTE Same as the Robot class in the IntroBot
 *!SECTION */
public class Robot extends TimedRobot {
    public static ChassisSubsystem chassis = new ChassisSubsystem();
    public static OI oi = new OI();

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
		Scheduler.getInstance().run();
    }

    @Override
    public void teleopInit() {
    }

    @Override
    public void teleopPeriodic() {
		Scheduler.getInstance().run();
    }
}
