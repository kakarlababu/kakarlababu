package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamictable {

	public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\kakarla Babu\\Downloads\\chromedriver_win32//chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
	        driver.get("http://demo.guru99.com/test/web-table-element.php");
	        
		List <WebElement> coa = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th"));
		System.out.println("no of coa are :" + coa.size());
		
		List <WebElement> row = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr/td[1]"));
		
		System.out.println("No of rows are : " + row.size());
		
		
		
		
		
		
		
		

	}

}
