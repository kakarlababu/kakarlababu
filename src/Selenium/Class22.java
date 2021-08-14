package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class22 {

	public static void main(String[] args) {
		
		
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\kakarla Babu\\Downloads\\chromedriver_win32//chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
        driver.get("http://demo.automationtesting.in/Register.html");
        
    	Actions act = new Actions(driver);
		
        
 WebElement element1 = driver. findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[8]/a"));
 	
	WebElement element2 = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[8]/ul/li[2]/a"));
	
	//act.moveToElement(element1).build().perform();
	
  //  act.moveToElement(element2).click().build().perform();

	act.moveToElement(element1).moveToElement(element2).click().build().perform();
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
