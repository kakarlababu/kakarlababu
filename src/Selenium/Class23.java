package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class23 {

	public static void main(String[] args) {
		
	      System.setProperty("webdriver.chrome.driver", "C:\\Users\\kakarla Babu\\Downloads\\chromedriver_win32//chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
	        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		Actions act = new Actions(driver);
		
		WebElement source = driver.findElement(By.xpath("//*[@id=\"box5\"]"));
		WebElement destination = driver.findElement(By.xpath("//*[@id=\"box101\"]"));
		
		//act.clickAndHold(source).moveToElement(destination).release().build().perform();
		
		
    act.dragAndDrop(source, destination).build().perform();
    
    WebElement source1 = driver.findElement(By.xpath("//*[@id=\"box1\"]"));
	WebElement destination2 = driver.findElement(By.xpath("//*[@id=\"box106\"]"));
	
    act.clickAndHold(source1).moveToElement(destination2).release().build().perform();
    
    
    
	}

}
