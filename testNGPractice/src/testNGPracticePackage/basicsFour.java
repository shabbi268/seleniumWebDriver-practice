package testNGPracticePackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class basicsFour {
	
	@AfterTest
	public void webLoginHomeLoan() {
		System.out.println("Home Web Login");

	}
	
	@Test
	public void mobileLoginHomeLoan() {
		System.out.println("Home Mobile Login");

	}
	
	@BeforeMethod
	public void apiLoginHomeLoan() {
		System.out.println("Home API Login");

	}
	

}
