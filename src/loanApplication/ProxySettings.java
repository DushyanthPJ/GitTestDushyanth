package loanApplication;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ProxySettings {
	public static void main (String[] args) {
		ChromeOptions options = new ChromeOptions();
		//options.addExtensions("D:\\My Learnings\\Selenium Files\\extension");
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("IPAddress:8080");
		options.setCapability("proxy", proxy);
		
		System.setProperty("webdriver.chrome.driver", "D:\\My Learnings\\Selenium Files\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
	}

}
