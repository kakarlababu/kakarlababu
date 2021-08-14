package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

public class Class5 {

	public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\kakarla Babu\\Downloads\\chromedriver_win32//chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
	        driver.get("https://www.facebook.com/");

driver.findElement(By.id("email")).sendKeys("9490151542");
		driver.findElement(By.name("pass")).sendKeys("jana.9000");
		driver.findElement(By.name("login")).submit();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
		
		if(driver.findElement(By.xpath("//h3")).getText().equalsIgnoreCase("Login Successfully"))
		{
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
			
	}

	}


