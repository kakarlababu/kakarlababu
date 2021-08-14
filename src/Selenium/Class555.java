package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class555 {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\kakarla Babu\\Downloads\\chromedriver_win32//chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
	        driver.get("https://phptravels.org/index.php?rp=/login");
         driver.findElement(By.xpath("//*[@id='inputEmail']")).sendKeys("kakarlababu188@gmali.com");
		
		driver.findElement(By.xpath("//*[@id='inputPassword']")).sendKeys("8074583034");
		
		WebElement option = driver.findElement(By.xpath("//*[@id=\"main-body\"]/div/div/div[1]/div/div[3]/div[1]/form/div[3]/label/input"));
		
	option.click();
	WebElement option2 = driver.findElement(By.xpath("//*[@class='recaptcha-checkbox-border']"));
		option2.click();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
