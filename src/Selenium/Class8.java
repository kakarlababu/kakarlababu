package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class Class8 {

	public static void main(String[] args) {
		
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kakarla Babu\\Downloads\\chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("https://www.dafabet.com/in/join?regvia=2");
		
	//	driver.findElement(By.xpath("//*[@id=\"inputLastName\"]")).sendKeys("kakarla");
	//	driver.findElement(By.cssSelector("#inputFirstName")).sendKeys("babu");
		
		Select babu= new Select (driver.findElement(By.name("RegistrationForm[country]")));
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
