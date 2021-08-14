package Selenium;






import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;




public class Class12 {

	public static void main(String[] args) throws Exception {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kakarla Babu\\Downloads\\chromedriver_win32//chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
        
	driver.get("https://phptravels.org/register.php");
		
		
  Select babu = new Select(driver.findElement(By.id("inputCountry")));
 
	  
	  driver.findElement(By.xpath("//*[@class=\"flag-container\"]")).click();
	  Thread.sleep(2000);
	  
	  List<WebElement> coy = driver.findElements(By.xpath("//*[@class=\"country\"]"));
	  int counter=1;
	  for(int i=0;i<=coy.size()-1;i++)
	  {
		 
		//   System.out.println(coy.get(i).getText());
		  if(coy.get(i).getText().startsWith("A"))
		  {
		  coy.get(i).click();
			  System.out.println(coy.get(i).getText());
			 
			  counter++;
		  }
		  
		  
	  }
	  System.out.println(counter);
	}
}
				
	     // babu.selectByIndex(3);
		//babu.selectByValue("AF");
			
	   //  babu.selectByVisibleText("Angola");
			
      
	
			
	 
	  
		
	      
	      
		
		  
	      
	      
		   

	


	

	
	
		
	


