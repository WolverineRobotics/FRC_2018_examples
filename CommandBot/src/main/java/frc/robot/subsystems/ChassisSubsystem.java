package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.DefaultChassisCommand;

/*SECTION Subsystems
* Like on the robot, we have specific subsystems for each subsystem on the robot ex. Shooter, Drive, Lift, Feeder etc.
* The subsystem holds all the getters and setters for that subsystem
* 
//!SECTION */
public class ChassisSubsystem extends Subsystem{
    private static Spark leftMotor1 = new Spark(RobotMap.LEFT_MOTOR_1);
    private static Spark leftMotor2 = new Spark(RobotMap.LEFT_MOTOR_2);
    private static Spark rightMotor1 = new Spark(RobotMap.RIGHT_MOTOR_1);
    private static Spark rightMotor2 = new Spark(RobotMap.RIGHT_MOTOR_2);

    public ChassisSubsystem(){
        rightMotor1.setInverted(true);
        rightMotor2.setInverted(true);
    }

    /*SECTION initDefaultCommand
    * NOTE This method set the command that the subsystem will run whenever it is not running any commands
    *!SECTION */
    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new DefaultChassisCommand());
    }

    public void setLeftSpeed(double speed){
        leftMotor1.setSpeed(speed);
        leftMotor2.setSpeed(speed);
    }

    public void setRightSpeed(double speed){
        rightMotor1.setSpeed(speed);
        rightMotor2.setSpeed(speed);
    }

    public double getLeftSpeed(){
        double speed = (leftMotor1.getSpeed() + leftMotor2.getSpeed()) / 2;
        return speed;
    }

    public double getRightSpeed(){
        double speed = (rightMotor1.getSpeed() + rightMotor2.getSpeed()) / 2;
        return speed;
    }
}