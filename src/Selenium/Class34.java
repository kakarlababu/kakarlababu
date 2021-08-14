package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class34 {


	
	public static void main(String[] args) {
		
		

		System.setProperty("WebDriver.Chrome.driver","C:\\Users\\kakarla Babu\\Downloads\\chromedriver_win32.//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		System.out.println(driver.getTitle());
	}

}
