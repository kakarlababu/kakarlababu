package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alert {

	public static void main(String[] args) throws InterruptedException {
		
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\kakarla Babu\\Downloads\\chromedriver_win32//chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
	        driver.get("http://demo.guru99.com/test/delete_customer.php");

		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("99999");
		
	    driver.findElement(By.name("submit")).submit();			
		
	         
        org.openqa.selenium.Alert alert = driver.switchTo().alert();		
        		
             
        String alertMessage= driver.switchTo().alert().getText();		
        		
      	
        System.out.println(alertMessage);	
        Thread.sleep(5000);
        		
     		
       alert.accept();	
 
    
	}	
		
		
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	

	

		
	


