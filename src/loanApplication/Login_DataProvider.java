package loanApplication;


import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login_DataProvider {
	@Test
	public static void CarLoanWebLogin() {
		System.out.println("Selenium Automation - Car Loan Web Login"); 
	}

	@Test
	public static void CarLoanMobileLogin() {
		System.out.println("Appium Automation - Car Loan Mobile Login"); 
	}
	
	
	@Test(dataProvider = "credentialsDataSet")
	public static void CarLoanAPILogin(String userName, String password) {
		System.out.println("Rest Assured Automation - Car Loan API Login"); 
		System.out.println("Username = "+userName+"--- Password = "+password);
		System.out.println("");
	}
	
	@DataProvider
	public Object[][] credentialsDataSet() {
		Object object[][] = new Object[3][2];
		object[0][0] = "firstUsername";
		object[0][1] = "firstPassword";
		
		object[1][0] = "secondUsername";
		object[1][1] = "secondPassword";
		
		object[2][0] = "thirdUsername";
		object[2][1] = "thirdPassword";
		
		return object;
	}
	
	@DataProvider
	public Object[][] hashmapCredentialsDataSet() {
		
		//HASMAP CREATION AND MAPPING DATA FOR 1ST RUN
		HashMap<String, String> map = new HashMap<>();
		map.put("Username", "firstUserName");
		map.put("Password", "firstPassword");
		
		//HASMAP CREATION AND MAPPING DATA FOR 2ND RUN
		HashMap<String, String> map1 = new HashMap<>();
		map1.put("Username", "secondUserName");
		map1.put("Password", "secondPassword");
		
		return new Object[][] {{map}, {map1}};		
		
	}
	
	@Test(dataProvider = "hashmapCredentialsDataSet")
	public static void hashmapData(HashMap<String, String> inputData) {
		System.out.println("Rest Assured Automation - Hash Map Data Retival"); 
		System.out.println("Username = "+inputData.get("Username")+"--- Password = "+inputData.get("Password"));
		System.out.println("");
	}
	
	
}
