package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class25 {

	public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\kakarla Babu\\Downloads\\chromedriver_win32//chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
	        driver.get("https://phptravels.org/register.php");
	        
	//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("babu");
	// driver.findElement(By.xpath("//*[contains(@name,'firstname')]")).sendKeys("babu");
	//	driver.findElement(By.xpath("//*[@type='text' or @name='firstname']")).sendKeys("8097");
	     
	//driver.findElement(By.xpath("//input[@type='text' and @name='lastname']")).sendKeys("88888888888");
		
	driver.findElement(By.xpath("//input[start-with(@id,'inputFirstName')]")).sendKeys("8888j");
	
    
	
		
		
		
		
	   
		
		
		

	}

}
