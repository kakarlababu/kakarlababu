package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathtable {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\kakarla Babu\\Downloads\\chromedriver_win32//chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
	        driver.get("http://demo.guru99.com/test/write-xpath-table.html");
	        
	        String innerText = driver.findElement(
	        		By.xpath("/html/body/center/table/tbody/tr[1]/td[2]")).getText(); 	
	              System.out.println(innerText); 
	        	driver.quit();
	        
	        
	      
	     	
	                

	        
	        
	


	}

}
