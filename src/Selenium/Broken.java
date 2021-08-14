package Selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken {

	public static void main(String[] args) throws IOException {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\kakarla Babu\\Downloads\\chromedriver_win32//chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
	        driver.get("http://demo.guru99.com/test/newtours/");
	      
		List <WebElement> links = driver.findElements(By.tagName("a"));
		int size= links.size();
		//System.out.println(size);
		
		for(int i=0; i<size; i++)  {
		
		WebElement element = links.get(i);
		
		String ur4 = element.getAttribute("href");
		
		URL link=new URL(ur4);
		
		HttpURLConnection httpcon = (HttpURLConnection) link.openConnection();
	
		httpcon.connect();
		
		int rescode = httpcon.getResponseCode();
		
		
		if(rescode>400) {
		
			  System.out.println(ur4+" is a broken link");
        }
        else{
            System.out.println(ur4+" is a valid link");
        
        }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		}	

	}


