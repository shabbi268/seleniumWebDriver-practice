package testNGPracticePackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class basicsTwo {
	
	@Test(groups= {"smoke"})
	public void Demo1() {
		System.out.println("BYE Basics 2");

	}
	
	@BeforeTest
	public void Demo2() {
		System.out.println("Before Test Annotation");

	}

}
