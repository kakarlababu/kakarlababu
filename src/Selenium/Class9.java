package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;


public class Class9 {

	private static final String List = null;

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kakarla Babu\\Downloads\\chromedriver_win32//chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
        driver.get("https://phptravels.org/register.php");
		
       WebElement webEle = driver.findElement(By.name("country"));
        
			Select dropdown = new Select(webEle);
			
			dropdown.selectByIndex(7);
			
		//	dropdown.selectByValue("IN");
		
		//dropdown.selectByVisibleText("Panama");
		
//	 Click on phone dropdown
//	 get list on values in the dropdown
//		
//	 if UK then clcik on it 
		
		driver.findElement(By.className("flag-container")).click();
	List<WebElement> drop = driver.findElements(By.xpath("//*[@class=\"country\"]"));
	System.out.println(drop.size());
		
          for(int a=0;a<=drop.size()-1;a++) {
			
			System.out.println(drop.get(a).getAttribute("data-country-code"));
		
			if(drop.get(a).getAttribute("data-country-code").equalsIgnoreCase("dz"))
			if(drop.get(a).getAttribute("data-country-code")=="dz")
		
			drop.get(a).click();
				System.out.println("SELECTED"); 
          }
					
	}
		
          
}	
          
		
						
			
          
	
	

