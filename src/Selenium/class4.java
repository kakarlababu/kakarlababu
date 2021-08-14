package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class class4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","" );
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.close();
		
		

	}

}
