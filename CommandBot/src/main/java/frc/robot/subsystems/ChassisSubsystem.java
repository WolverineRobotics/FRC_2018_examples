package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
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

    private static Encoder leftEncoder = new Encoder(RobotMap.LEFT_ENCODER_A, RobotMap.LEFT_ENCODER_B);
    private static Encoder rightEncoder = new Encoder(RobotMap.RIGHT_ENCODER_A, RobotMap.RIGHT_ENCODER_B);

    public ChassisSubsystem(){
        rightMotor1.setInverted(true);
        rightMotor2.setInverted(true);
    }

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
        return rightEncoder.getRate();
    }

    public double getRightSpeed(){
        return rightEncoder.getRate();
    }

    public double getLeftDistance(){
        return leftEncoder.getDistance();
    }

    public double getRightDistance(){
        return rightEncoder.getDistance();
    }
}