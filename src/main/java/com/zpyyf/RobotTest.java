package com.zpyyf;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class RobotTest {
	public static void main(String[] args) throws AWTException, IOException {
		Robot robot = new Robot();
		Runtime.getRuntime().exec("cmd /c start notepad");
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_SPACE);
		robot.keyRelease(KeyEvent.VK_SPACE);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		for (int i = 0; i < 100000; i++) {
			robot.keyPress(KeyEvent.VK_A);
			robot.keyRelease(KeyEvent.VK_A);
			robot.keyPress(KeyEvent.VK_SPACE);
			robot.keyRelease(KeyEvent.VK_SPACE);
			robot.delay(2);
		}
	}
}
