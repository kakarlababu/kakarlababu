package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class11 {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\kakarla Babu\\Downloads\\chromedriver_win32//chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
        driver.get("https://phptravels.org/register.php");
		
		
	//	String textReceived = driver.findElement(By.xpath("//*[@id=\"inputCountry\"]")).getText();
		
		String textReceived = driver.findElement(By.id("customfield1")).getText();
		
		System.out.println("---------+textRecived");
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
