package org.usfirst.frc.team199.Robot2018.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * Used for testing the autonomous interfaces. Runs the script specified in
 * SmartDashboard
 */
public class TestAuto extends CommandGroup {

    public TestAuto() {
    	addSequential(new RunScript(getScriptToTest()));
    }

	/**
	 * gets the script name that we want to run from SmartDashboard
	 *
	 * @return the script name
	 */
	public String getScriptToTest() {
		return SmartDashboard.getString("Auto Script", "NOTHING");
	}
}
