package loanApplication;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parameterization {
	
	@Parameters({"URL"})
	@Test
	public static void PersonalLoanWebLogin(String urlname) {
		System.out.println("Selenium Automation - Personal Loan Web Login"); 
		System.out.println(urlname);
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
