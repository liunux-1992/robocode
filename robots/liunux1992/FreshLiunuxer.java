package liunux1992;
import robocode.*;
//import java.awt.Color;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * FreshLiunuxer - a robot by (Chang Liu)
 */



public class FreshLiunuxer extends Robot
{
	/**
	 * run: FreshLiunuxer's default behavior
	 */
	private double FirePower;
	private double Dist;
	private double Tmp;
	


	public void run() {
		// Initialization of the robot should be put here

		// After trying out your robot, try uncommenting the import at the top,
		// and the next line:

		// setColors(Color.red,Color.blue,Color.green); // body,gun,radar

		// Robot main loop
		Dist = 300;
		double period = 0;
		double move = 0;
		while(true) {
			// Replace the next 4 lines with any behavior you would like
			
			period = 4*((int)(Dist/80)); 
			if(getTime()%period == 0){
				move = (Math.random()*2-1)*(period*8 - 25);
				ahead(move + ((move >= 0) ? 25: -25));
			}			



			//ahead(100);
			turnGunRight(360);
			//back(100);
			//turnGunRight(360);
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		// Replace the next line with any behavior you would like
		Dist = e.getDistance();
		FirePower = 2;
		//if (Dist < 50){
			fire(FirePower);
			//turnGunLeft(30);
			//back(1);
		//}else{
			//ahead(50);
			turnGunLeft(30);
			//back(1);
		//}
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		// Replace the next line with any behavior you would like
		turnRight(10);
		back(10);
		
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		// Replace the next line with any behavior you would like
		
		turnLeft(90);
		
	}	
	
	public void onHitRobot(HitRobotEvent e){
		fire(1);
		fire(1);
	
	}
}
