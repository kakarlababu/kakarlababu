package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class786 {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\kakarla Babu\\Downloads\\chromedriver_win32//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		driver.get("http://demo.guru99.com/test/radio.html");
		
	WebElement radio1 =	driver.findElement(By.xpath("//*[@id='vfb-7-1']"));
	WebElement radio2 = driver.findElement(By.xpath("//*[@id='vfb-7-2']"));
		
		radio1.click();
		
		System.out.println("Radio Button Option 1 Selected");					
		
        		
      radio2.click();			
       System.out.println("Radio Button Option 2 Selected");	
		
		
		//checkbox
		
       WebElement option1 = driver.findElement(By.id("vfb-6-0"));							
       option1.click();
        if (option1.isSelected()) {					
            System.out.println("Checkbox is Toggled On");					

        } else {			
            System.out.println("Checkbox is Toggled Off");					
       }		
	
		
	driver.get("http://demo.guru99.com/test/facebook.html");
     
	WebElement drop = driver.findElement(By.id("persist_box"));
	
	  for (int i=0; i<2; i++) {											
         drop.click (); 			
          System.out.println("Facebook Persists Checkbox Status is -  "+drop.isSelected());
	
      }		
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
  }		

		




