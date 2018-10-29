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
* !SECTION
*/

package frc.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;

/*SECTION Main Robot Class
* NOTE This is main robot class is how we tell the RoboRIO what to do, Everything that is in this class gets run on the RoboRIO
* !SECTION
*/
public class Robot extends IterativeRobot {
  /* SECTION Robot Instance Variables
  * NOTE Joysticks
  * Joysticks/Gamepads are created as their own instances
  */
  private Joystick j_driver = new Joystick(0);
  private Joystick j_operator = new Joystick(1);

  /*SECTION Speed Controllers
  * NOTE Intro
  * The speed constructor we use int he code depends on the type of speed controller we use on the robot
  * Victor(x), Talon(x), Spark(x)
  * NOTE Different speed controllers
  * The number we put in the constructor is based on what type of speed controller it is. If the speed controller is a:
  *   PWM speed controller (Red, white, and black cable) - the PWM port it is plugged into on the RoboRIO
  *   CAN speed controller (Green and Yellow) - the CAN ID that it is plugged into
  */
  private final Spark d_left1 = new Spark(0);
  private final Spark d_left2 = new Spark(1);
  private final Spark d_right1 = new Spark(2);
  private final Spark d_right2 = new Spark(3);

    //!SECTION
  @Override
  public void robotInit() {
  }


  @Override
  public void robotPeriodic() {
  }

  @Override
  public void autonomousInit() {
  }

  @Override
  public void autonomousPeriodic() {
  }

  @Override
  public void teleopPeriodic() {
  }

  @Override
  public void testPeriodic() {
  }
}