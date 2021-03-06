// ANCHOR Wolverine Robotics (FRC Team#5596) IntroBot Example!

/* SECTION Introduction
*
* ANCHOR This is an example robot with more documentation needed for a simple Iterative Robot
* IntroBot has the basis for using the Joystick class, Speed Controller classes, and the Iterative Robot class
*
* NOTE Prerequisites
* This code is for people who already understand Java, as well as basic programming ideas such as:
* Classes, Methods, Arguments, Variable types etc.
* If you have no clue what any of the above concepts (in the Java context) make sure to review them! unless you are brave enough
*
* NOTE Nice Extensions to have
* - Comment Anchors by Exodius Studios
* - GitLens by Eric Amodio
* - Simple Icon Theme by LaurentTreguier
//!SECTION */

package frc.robot;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;

/*SECTION Main Robot Class
* NOTE This is main robot class is how we tell the RoboRIO what to do, Everything that is in this class gets run on the RoboRIO
//!SECTION */
@SuppressWarnings( "deprecation" )
public class Robot extends IterativeRobot {
  /*SECTION Joysticks
  * NOTE Joysticks
  * Joysticks/Gamepads are created as their own instances
  * You use the port that the joystick is plugged into in the constructor. You can find this in the driverstation devices tab
  //!SECTION */
  private Joystick j_driver = new Joystick(0);

  /* SECTION Speed Controllers
  * NOTE Intro
  * The speed constructor we use int he code depends on the type of speed controller we use on the robot
  * Victor(x), Talon(x), Spark(x)
  * NOTE Different speed controllers
  * The number we put in the constructor is based on what type of speed controller it is. If the speed controller is a:
  *   PWM speed controller (Red, white, and black cable) - the PWM port it is plugged into on the RoboRIO
  *   CAN speed controller (Green and Yellow) - the CAN ID that it is plugged into
  //!SECTION */
  private final Spark d_left1 = new Spark(0);
  private final Spark d_left2 = new Spark(1);
  private final Spark d_right1 = new Spark(2);
  private final Spark d_right2 = new Spark(3);

  /*SECTION Encoders
  * NOTE PWM Encoders
  * PWM Encoders are plugged into 2 ports, one with the ground, Vin and Signal A, and the second port with
  * signal B
  * NOTE CAN Enabled encoders
  * CAN encoders are encoders that communicat through the CAN bus through the Talon SRX
  //!SECTION */
  private final Encoder d_leftEnc = new Encoder(0,1);
  private final Encoder d_rightEnc = new Encoder (2,3);

  //SECTION Robot methods
  /*NOTE robotInit()
  * This method is called when the roboRIO is booted
  * NOTE robotPeriodic()
  * This method is called periodically when the robot is on
  * NOTE teleopInit()
  * This method is called when teleop is initiated
  * NOTE teleopPeriodic()
  * This method is called periodically during the teleop period
  * NOTE autonomousInit()
  * This method is called when the autonomous period initiates
  * NOTE autonomousPeriodic()
  * This method is called periodically during autonomous
  * NOTE testInit()
  * This method is called when test mode is initiated
  * NOTE testPeriodic()
  * This method is called periodically during the test period
  //!SECTION */
  @Override
  public void robotInit() { 
  d_right1.setInverted(true); //NOTE The setInverted method in 
  d_right2.setInverted(true);

  d_leftEnc.setDistancePerPulse((Math.PI*6)/256);
  }

  @Override
  public void robotPeriodic() {
  }

  @Override
  public void autonomousInit() {
    d_left1.setSpeed(0.3);
    d_left2.setSpeed(0.3);
    d_right1.setSpeed(0.3);
    d_right1.setSpeed(0.3);
  }

  @Override
  public void autonomousPeriodic() {
    if((d_leftEnc.getDistance() + d_rightEnc.getDistance())/2 >= 5){
      d_left1.setSpeed(0);
      d_left2.setSpeed(0);
      d_right1.setSpeed(0);
      d_right1.setSpeed(0);
    }
  }

  @Override
  public void teleopPeriodic() {
    double drive = j_driver.getRawAxis(1);
    double turn = j_driver.getRawAxis(4);

    d_left1.setSpeed(drive - turn);
    d_left2.setSpeed(drive - turn);
    d_right1.setSpeed(drive + turn);
    d_right2.setSpeed(drive + turn);
  }
}