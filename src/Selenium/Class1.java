package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {

	public static void main(String[] args) throws Exception {
		openBrowserChrome();
	}

	public static void openBrowserChrome() throws Exception {
		
		System.getProperty("\"C:\\\\\\\\Users\\\\\\\\kakarla Babu\\\\\\\\Downloads\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe\",");
		WebDriver driver = new ChromeDriver();
		

		

		driver.manage().window().maximize();

		Thread.sleep(2000);

		// enter url
		driver.get("https://www.amazon.com/");
		Thread.sleep(5000);

		// verify Amazon log


		if (driver.getTitle().isEmpty()) {
			System.out.println("Fail");
		} else {
			System.out.println("Pass");
			System.out.println(driver.getTitle().toString());
		}
		// close the browser
		driver.close();
		driver.quit();
	}
	
	
	public static void openBrowserFireFOx() throws Exception {
		// Opne browser.
		
		
		
		

		// enter url
		

		// verify flipkart log
		//static-assets-web.flixcart.com/www/linchpin/fk-cp-zion/img/flipkart-plus_8d85f4.png"

		
		// close the browser
		
	}
}
