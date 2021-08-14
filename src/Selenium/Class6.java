package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;







public class Class6 {

	public static void main(String[] args) throws Exception {
		

	

	System.setProperty("webdriver.chrome.driver","C:\\Users\\kakarla Babu\\Downloads\\chromedriver_win32//chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			
			driver.get("https://phptravels.org/register.php");
			
			
		//	driver.findElement(By.id("inputFirstName")).sendKeys("babu");
			
			
		//	driver.findElement(By.name("lastname")).sendKeys("kakarla");
			
		//	driver.findElement(By.id("inputEmail")).sendKeys("kakarlababu@gmali.com");
		
			Select drpCountry = new Select(driver.findElement(By.id("customfield1"))) ;
			
			 drpCountry.selectByVisibleText("Friend");
			
//			 drpCountry.selectByIndex(1);
			 
			 Thread.sleep(10000);
			
			
	
	 }
			
			
			
			
			
		//	driver.findElement(By.id("inputPhone")).sendKeys("8074583034");
			
			
			
			
			
			
	//		driver.findElement(By.id("inputCompanyName")).sendKeys("nike");
			
		//	driver.findElement(By.name("address1")).sendKeys("porumamilla");
			
	//		driver.findElement(By.id("inputAddress2")).sendKeys("venkatapuram");
			
		//	driver.findElement(By.name("city")).sendKeys("venkatapuram");

	//		driver.findElement(By.name("state")).sendKeys("ap");
			
		//	driver.findElement(By.id("inputPostcode")).sendKeys("516193");
			
	//		driver.findElement(By.name("country")).sendKeys("india");
			
	//		driver.findElement(By.name("customfield[1]")).sendKeys("google");
			
	//		driver.findElement(By.id("customfield2")).sendKeys("8074583034");
			
	//		driver.findElement(By.name("password")).sendKeys("9490151542");
		
			
		//	driver.findElement(By.name("password2")).sendKeys("9490151542");
	
	
	        // driver.close();		

	
	}	
	
	
	
	
	
			
	
		



