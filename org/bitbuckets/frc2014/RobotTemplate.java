/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.bitbuckets.frc2014;


import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import org.bitbuckets.frc2014.command.CommandBase;
import org.bitbuckets.frc2014.command.ExampleCommand;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class RobotTemplate extends IterativeRobot {

    Solenoid solenoid1 = new Solenoid(1, 2);
    Solenoid solenoid2 = new Solenoid(3, 4);
    Solenoid solenoid3 = new Solenoid(5, 6);
    Solenoid solenoid4 = new Solenoid(7, 8);
    Compressor compressor = new Compressor(RobotMap.pressureSwitch, RobotMap.compressorRelay);
    
    Command autonomousCommand;
    OI oi;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
        // instantiate the command used for the autonomous period
        autonomousCommand = new ExampleCommand();

        // Initialize all subsystems
        CommandBase.init();
        oi = CommandBase.oi;
        compressor.start();
    }

    public void autonomousInit() {
        // schedule the autonomous command (example)
        autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
	// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        autonomousCommand.cancel();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        CommandBase.db.drive(oi.stick.getX(), oi.stick.getY());//our axis are reversed
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
