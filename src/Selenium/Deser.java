package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Deser {

	public static void main(String[] args) {
		
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		  
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "IE");
		capabilities.setCapability(InternetExplorerDriver.
		  INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);

		
		
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\kakarla Babu\\Downloads\\chromedriver_win32//chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
	        driver.get("http://gmail.com");
	    
              driver.quit();
	}

}
