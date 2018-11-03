package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class DefaultChassisCommand extends Command {
    public DefaultChassisCommand(){
        requires(Robot.chassis);
    }

    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
        double drive = Robot.oi.getDrive();
        double turn = Robot.oi.getTurn();

        Robot.chassis.setLeftSpeed(drive - turn);
        Robot.chassis.setRightSpeed(drive + turn);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

}