package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Class7 {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kakarla Babu\\Downloads\\chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("8074583034");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).clear();
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("password");
		driver.close();

	}

}
