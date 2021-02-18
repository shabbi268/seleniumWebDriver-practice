package testNGPracticePackage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class basicsThree {
	
	@Parameters({"url"})
	@Test(groups= {"smoke"})
	public void webLoginCarLoan(String urlName) {
		System.out.println("Car Web Login "+ urlName);

	}
	
	@BeforeMethod
	public void mobileLoginCarLoan() {
		System.out.println("Car Mobile Login");

	}
	
	@Test
	public void apiLoginCarLoan() {
		System.out.println("Car API Login");

	}
	
	@DataProvider
	public void getData() {
		
	}
	

}
