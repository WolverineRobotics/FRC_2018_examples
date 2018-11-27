package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

//NOTE This command is exactly the same as the default chassis command
//NOTE This command should make the robot go "Vroom Vroom" forward for 2 seconds
public class TestVroomVroomCommand extends Command{
    public TestVroomVroomCommand(){
    }

    @Override
    protected void initialize() {
        System.out.println("VROOM VROOM SKREEEEEEEEEEEEEEEEEEEEEEEE");
        setTimeout(2);
    }

    @Override
    protected void execute() {
        Robot.chassis.setLeftSpeed(1);
        Robot.chassis.setRightSpeed(1);
    }

    @Override
    protected void end(){
        Robot.chassis.setLeftSpeed(0);
        Robot.chassis.setRightSpeed(0);
    }

    @Override
    protected boolean isFinished() {
        if(timeSinceInitialized() >= 2){
            return true;
        }
        return false;
    }

}