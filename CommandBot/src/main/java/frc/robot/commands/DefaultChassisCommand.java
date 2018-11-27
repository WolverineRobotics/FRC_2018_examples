package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.robot.Robot;

/*SECTION The Command class
* ANCHOR TLDR: The Command class will be run by the schedular like regular code but better :)
*
* NOTE The Command class holds the actions that you want the robot to be able to do. The Command is put into a thread
* that is read by the schedular and runs whatever is specified in the command
*!SECTION */
public class DefaultChassisCommand extends Command {
    public DefaultChassisCommand(){
        /*SECTION Requires
        * NOTE This method will specify which subsystems are required in order to run the command. The schedular will check if the subsystem
        * required to run the command is available and it will run the interrupt method
        *
        * NOTE
        *!SECTION */
        requires(Robot.chassis);
    }

    /*SECTION initialize method
    * NOTE This method is run when the command is first called
    *!SECTION */
    @Override
    protected void initialize() {
    }

    /*SECTION execute method
    * NOTE This method is run periodically until the command finishes
    *!SECTION */
    @Override
    protected void execute() {
        //basic arcade drive
        double drive = Robot.oi.getDrive();
        double turn = Robot.oi.getTurn();

        Robot.chassis.setLeftSpeed(drive - turn);
        Robot.chassis.setRightSpeed(drive + turn);

        //Runs vroom vroom command
        if(Robot.oi.getTestButton()){
            Scheduler.getInstance().add(new TestVroomVroomCommand());
        }
    }

    /*SECTION
    * NOTE This method is run when the command is ended peacefully
    *!SECTION */
    @Override
    protected void end(){
        System.out.println("I am not suppose to be ended peacefully but I'll take it");
    }

    /*SECTION isFinshed method
    * NOTE This method tells the schedular whether or not the command is completed
    *!SECTION */
    @Override
    protected boolean isFinished() {
        //NOTE Because this is a teleop command we never want this to return true
        return false;
    }

    /*SECTION interrupted method
    * NOTE This method gets run whenever the user called cancel() or when the command timesout
    *!SECTION */
    @Override
    protected void interrupted(){
        System.out.println("That was rude");
    }

    //SECTION other useful methods
    //NOTE All of these methods are not body methods but they are instance methods that are super super useful
    //when you are creating 
    public void some_other_useful_methods(){
        //NOTE cancel
        //This method cancels the command and called the interrupted() method
        //NOTE This is useful if you want the command to just stop if the robot starts doing something that
        //would cause a lot of damage
        cancel();
        
        //NOTE isCanceled
        //This method returns true whether or not the command is interrupted
        //NOTE This method is useful so we can tell how the command was ended, either peacefully or not
        isCanceled();

        //NOTE setTimeout
        //This method sets a timeout for the Command
        //NOTE This method is EXTREMELY useful, because in the case something happens like a sensor unplugs
        //itself the command will end itself to stop itself from doing something that is not intended
        double timeout_in_seconds = 10;
        setTimeout(timeout_in_seconds);

        //NOTE timeSinceInitialized
        //This method returns how much time passed since the command started
        //NOTE This method is useful if you want to debug the robot, or check preformance by printing out how long
        //It took the command to complete itself
        timeSinceInitialized();
    }
    //!SECTION

}