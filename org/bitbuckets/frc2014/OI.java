/* FRC 4183 - The Bit Buckets
 * Tucson, AZ
 *
 * FRC 2014 Codebase
 */
package org.bitbuckets.frc2014;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * 
 * 
 * @author Default
 */
public class OI {
    /**
     * The CCI(Custom Control Interface).
     */
    public Joystick Control = new Joystick(RobotMap.CCI_PORT);
    /**
     * The right joystick for tank drive.
     */
    public Joystick JoyRight = new Joystick(RobotMap.JOY_RIGHT_PORT);
    /**
     * The right joystick for tank drive.
     */
    public Joystick JoyLeft = new Joystick(RobotMap.JOY_LEFT_PORT);
    
    /**
     * The button that fires the ball.
     */
    public Button fireButton = new JoystickButton(Control, 1);
    /**
     * The button that runs the intake motor backwards.
     */
    public Button retractButton = new JoystickButton(Control, 2);
    /**
     * The button that deploys the intake.
     */
    public Button intakeDeployButton = new JoystickButton(Control, 4);
    /**
     * The button that deploys the intake and runs the roller in.
     */
    public Button outtakeButton = new JoystickButton(Control, 6);
    /**
     * The button that deploys the intake and runs the roller.
     */
    public Button intakeButton = new JoystickButton(Control, 8);
    /**
     * The button that makes the intake roller roll in.
     */
    public Button intakeRollerButton = new JoystickButton(Control, 12);
    /**
     * The button that controls the catapult winch
     */
    public Button winchButton = new JoystickButton(Control, 3);
     /**
     * The button that starts and stops the lights
     */
    //public Button lightsOnOffButton = new JoystickButton(stick, //needs to be bound to button//;
   
}

