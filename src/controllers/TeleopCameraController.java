package controllers;

import lib.Loop;
import main.Robot;

public class TeleopCameraController implements Loop {

	@Override
	public void onStart() {
		//no-op
		
	}

	@Override
	public void onLoop() {
		Robot.dc.poke();
		
	}

	@Override
	public void onStop() {
		//no-op
		
	}
}
