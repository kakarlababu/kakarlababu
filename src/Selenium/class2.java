package Selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class2 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kakarla Babu\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");

//		WebElement link ;
//		link = driver.findElement(By.linkText("english"));
//		link.click();
		Thread.sleep(5000);
//		WebElement searchBox;
//		searchBox = driver.findElement(By.id("searchinput"));
		List<WebElement> l1 = driver.findElements(By.xpath("//*[@class='eFQ30H']"));
//		searchBox.sendKeys("software");
		
		System.out.println(l1.size());
		
		for(int a=0;a<=l1.size();a++) {
		
//		if (l1.get(0).getText()== "Mobile")
//		{
//			driver.findElement(By.xpath(l1.get(0).toString())).click();
			System.out.println(l1.get(a).getText());
//		}
		
		}
		Thread.sleep(5000);
		driver.quit();
		
		
		
	}

}
