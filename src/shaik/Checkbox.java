package shaik;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Checkbox {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\kakarla Babu\\Downloads\\chromedriver_win32//chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
	        driver.get("https://phptravels.org/register.php");

	       Select babu = new  Select(driver.findElement(By.id("inputPhone")));
	        
	     
			List<WebElement> drop = babu.getOptions();
	       int size =  drop.size();
	       System.out.println(size);
		  }	        
	        
	        
	}




