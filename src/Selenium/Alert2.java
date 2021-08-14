package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class Alert2 {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\kakarla Babu\\Downloads\\chromedriver_win32//chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
	        driver.get("https://demoqa.com/alerts");

	    	driver.findElement(By.id("alertButton")).click();
		      
		System.out.println(driver.switchTo().alert().getText());
		
			
	//this send keys	
	//	driver.switchTo().alert().sendKeys("msms");
		
	//	driver.switchTo().alert().accept();
		Alert alertbox = driver.switchTo().alert();
		alertbox.accept();
	
	}

}
