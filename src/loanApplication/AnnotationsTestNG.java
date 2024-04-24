package loanApplication;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;


public class AnnotationsTestNG {
	@Test
	public void CarLoanWebLogin() {
		System.out.println("Selenium Automation - Car Loan Web Login"); 
	}

	@Test (groups = {"Mobile Test Case"})
	public void CarLoanMobileLogin() {
		System.out.println("Appium Automation - Car Loan Mobile Login"); 
	}
	
	@Test (alwaysRun = true)
	public void CarLoanAPILogin() {
		System.out.println("Rest Assured Automation - Car Loan API Login"); 
	}
	
	@Test
	public void CarLoanWebSignOut() {
		System.out.println("Selenium Automation - Car Loan Web Signout"); 
	}

	@BeforeTest
	public void BeforeTestPreRequisite() {
		System.out.println("This will execute before the test as a Pre-Requisite."); 
	}
	
	@AfterTest
	public void AfterTest() {
		System.out.println("This will execute after the end of the test");  
	}
	
	@org.testng.annotations.BeforeSuite
	public void BeforeSuite() {
		System.out.println("This will execute as the first test for the suite"); 
	}
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("This will execute at the end of the test suite"); 
	}
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println(""); 
		System.out.println("This will execute before each method (TestCase)"); 
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("This will execute after each method (TestCase)"); 
		System.out.println(""); 
	}
	
	@org.testng.annotations.BeforeClass
	public void BeforeClass() {
		System.out.println("This will execute before beginning the execution of any of the methods in the class"); 
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("This will execute after execution of all of the methods in the class"); 
	}

}
