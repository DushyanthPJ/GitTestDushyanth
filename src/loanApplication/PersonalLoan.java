package loanApplication;

import org.testng.annotations.Test;

public class PersonalLoan {
	
	@Test
	public static void PersonalLoanWebLogin() {
		System.out.println("Selenium Automation - Personal Loan Web Login"); 
	}

	@Test
	public static void PersonalLoanMobileLogin() {
		System.out.println("Appium Automation - Personal Loan Mobile Login"); 
	}
	
	@Test
	public static void PersonalLoanAPILogin() {
		System.out.println("Rest Assured Automation - Personal Loan API Login"); 
	}
}
