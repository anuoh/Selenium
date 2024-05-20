package com.sdet;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

public class JanMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability("platformName", "android");
		dc.setCapability("platformVersion", "13");
		dc.setCapability("deviceName", "adb-R58N348JWCX-EDP0fe._adb-tls-connect._tcp.");
		dc.setCapability("appPackage", "com.solodroid.solomerce");
		dc.setCapability("appActivity", ".activities.MainActivity");
		dc.setCapability("automationName", "uiAutomator2");
		
		URL appium = new URL("http://127.0.0.1:4723");
		AndroidDriver driver = new AndroidDriver(appium, dc);
	}

}
