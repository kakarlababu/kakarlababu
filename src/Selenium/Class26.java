package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class26 {

	public static void main(String[] args) {
		
		
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\kakarla Babu\\Downloads\\chromedriver_win32//chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
	        driver.get("https://phptravels.org/index.php?rp=/login");
	        
		Actions act = new Actions(driver);
		
		
		
		WebElement name = driver.findElement(By.id("inputEmail"));
		
		act.keyDown(name, Keys.SHIFT).sendKeys("babu").build().perform();
		
		
		
		
		

	}

}
