
package org.usfirst.frc.team2869.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.image.ColorImage;
import edu.wpi.first.wpilibj.image.MonoImage;
import edu.wpi.first.wpilibj.image.NIVisionException;
import edu.wpi.first.wpilibj.image.RGBImage;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

    public void robotInit() {
    	try {
			RGBImage image = new RGBImage("/home/lvuser/image.jpg");
			MonoImage monoimage = image.getLuminancePlane();
			monoimage.write("/home/lvuser/monoimage.jpg");
		} catch (NIVisionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }	

    public void autonomousPeriodic() {

    }

    public void teleopPeriodic() {
        
    }
    

    public void testPeriodic() {
    
    }
    
}
