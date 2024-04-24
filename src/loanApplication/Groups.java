package loanApplication;

import org.testng.annotations.Test;

public class Groups {
	@Test(groups= {"Smoke"})
	public static void CarLoanWebLogin() {
		System.out.println("Selenium Automation - Car Loan Web Login");
	}

	@Test (timeOut = 4000)
	public static void CarLoanMobileLogin() {
		System.out.println("Appium Automation - Car Loan Mobile Login");
	}

	@Test (enabled = false)
	public static void CarLoanAPILogin() {
		System.out.println("Rest Assured Automation - Car Loan API Login");
	}

	@Test (dependsOnMethods = {"CarLoanWebLogin"})
	public static void CarLoanVerifySignIn() {
		System.out.println("Selenium Automation - Verify Car Loan Login successful");
	}

	@Test(groups= {"Smoke"})
	public static void CarLoanLogOut() {
		System.out.println("Selenium Automation - Car Loan Web LogOut");
	}
	
	@Test(groups= {"Smoke"})
	public static void CarLoanDetails() {
		System.out.println("Selenium Automation - Car Loan Details");
	}

}
