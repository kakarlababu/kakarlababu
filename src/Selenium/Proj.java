package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author kakarla Babu
 *
 */
public class Proj {

	static WebDriver driver;

	static String url = "https://www.flipkart.com/";
	static String drop = "http://demo.automationtesting.in/Register.html";
	static String drop2 = "http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html";
	static String drop3 = "https://phptravels.org/index.php?rp=/login";
	static String drop4 = "https://www.dafabet.com/eu/sports-df/sports";
	static String drop4a="https://www.dafabet.com/eu/join/sports-df?regvia=22";
	static String drop5 = "http://demo.guru99.com/test/radio.html";
	static String drop6 = "https://www.facebook.com/login/identify?ctx=recover";
	static String drop7 = "https://phptravels.org/register.php";

	
	 
	 
	public static void main(String[] args) throws Exception {

		Proj obj = new Proj();

		obj.testcase13();
	}

	public static void openBrowser(String url) {
		setBrowser("Chrome");
		driver.manage().window().maximize();
		driver.get(drop4a);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public static String setBrowser(String browser) {
		if (browser.equalsIgnoreCase("FF")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\kakarla Babu\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\\\Users\\\\kakarla Babu\\\\Downloads\\\\chromedriver_win32//chromedriver.exe");
			driver = new ChromeDriver();
		}

//		if (browser.equalsIgnoreCase("Edge"))
//		{
//			System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\kakarla Babu\\\\Downloads\\\\chromedriver_win32//chromedriver.exe" );
//		}

		return browser;
	}

	public void webdriver() throws InterruptedException {

		// String pagename = driver.getTitle();
		openBrowser(url);
		System.out.println(driver.getTitle());

		// System.out.println(driver.getCurrentUrl());
		// Thread.sleep(2000);
		driver.navigate().to("https://phptravels.com/");
		// Thread.sleep(3000);
		// driver.navigate().back();
		// Thread.sleep(3000);
		// driver.navigate().forward();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.close();

	}

	public void locators() {
		openBrowser(drop);

		Actions act = new Actions(driver);

		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[8]/a"));

		WebElement element2 = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[8]/ul/li[2]/a"));

		// act.moveToElement(element1).build().perform();

		// act.moveToElement(element2).click().build().perform();

		act.moveToElement(element1).moveToElement(element2).click().build().perform();

	}

	public void Click() {
		openBrowser(drop2);
		Actions act = new Actions(driver);

		WebElement source = driver.findElement(By.xpath("//*[@id=\"box5\"]"));
		WebElement destination = driver.findElement(By.xpath("//*[@id=\"box101\"]"));

		// act.clickAndHold(source).moveToElement(destination).release().build().perform();

		act.dragAndDrop(source, destination).build().perform();

		WebElement source1 = driver.findElement(By.xpath("//*[@id=\"box1\"]"));
		WebElement destination2 = driver.findElement(By.xpath("//*[@id=\"box106\"]"));

		act.clickAndHold(source1).moveToElement(destination2).release().build().perform();

	}

	public void key() {
		openBrowser(drop3);
		Actions act = new Actions(driver);

		WebElement name = driver.findElement(By.id("inputEmail"));

		act.keyDown(name, Keys.SHIFT).sendKeys("babu").build().perform();

	}

	public void Radios() {
		openBrowser(drop5);
		WebElement radio1 = driver.findElement(By.xpath("//*[@id='vfb-7-1']"));
		WebElement radio2 = driver.findElement(By.xpath("//*[@id='vfb-7-2']"));

		radio1.click();

		System.out.println("Radio1 is Selected");
      
	//	radio2.click();
	//	System.out.println("Radio2 is Selected");
		
		// checkbox

		WebElement option1 = driver.findElement(By.id("vfb-6-0"));
		option1.click();
		if (option1.isSelected()) {
			System.out.println("Checkbox is Toggled On");

		} else {
			System.out.println("Checkbox is Toggled Off");
		}
		driver.close();
	}

	public void image() {
		openBrowser(drop6);

		driver.findElement(By.xpath("//*[@class='eltiug27 a8c37x1j']")).click();
		if (driver.getTitle().equals("Facebook - log in or sign up")) {
			System.out.println("We are back at Facebook's homepage");
		} else {
			System.out.println("We are NOT in Facebook's homepage");
		}
		driver.close();

	}

	public void dropdown() {
		openBrowser(drop7);
		Select url = new Select(driver.findElement(By.xpath("//*[@id='inputCountry']")));

		// url.selectByIndex(5);
		url.selectByValue("DZ");
		url.selectByVisibleText("India");
	}
	public void dropdown2() 
	{

	}

	public void testCase1() {
		openBrowser(drop4);
		driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@name='submit']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		WebElement guru99seleniumlink;
		guru99seleniumlink= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3")));
		
		if(driver.findElement(By.xpath("//h3")).getText().equalsIgnoreCase("Login Successfully"))
		{
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
			
	}



  public void testCase2() {

  openBrowser(drop4);
driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("admin");
driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin");
driver.findElement(By.xpath("//*[@name='submit']")).click();

WebDriverWait wait=new WebDriverWait(driver, 20);
WebElement drop;
  

if(driver.findElement(By.xpath("//h3")).getText().equalsIgnoreCase("Login successful"))
{
	System.out.println("PASS");
}
else {
	System.out.println("FAIL");
}
	

}




public void testCase3() {

	  openBrowser(drop4);
	driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("8074583034");
	driver.findElement(By.xpath("//*[@name='password']")).sendKeys("shabbeer");
	driver.findElement(By.xpath("//*[@name='submit']")).click();

	WebDriverWait wait=new WebDriverWait(driver, 20);
	WebElement guru99seleniumlink;
	  

	if(driver.getTitle().equalsIgnoreCase("Login successful"))
	{
		System.out.println("PASS");
	}
	else {
		System.out.println("FAIL");
	}
		

	}



public void testCase4() {

	  openBrowser(drop4);
	driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("Shabbeer");
	driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin");
	driver.findElement(By.xpath("//*[@name='submit']")).click();

	WebDriverWait wait=new WebDriverWait(driver, 20);
	WebElement guru99seleniumlink;
	  

	if(driver.getTitle().equalsIgnoreCase("Login successful"))
	{
		System.out.println("PASS");
	}
	else {
		System.out.println("FAIL");
	}
		

	}



public void testCase5() {

	  openBrowser(drop4);
	driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("admin");
	driver.findElement(By.xpath("//*[@name='password']")).sendKeys("jana");
	driver.findElement(By.xpath("//*[@name='submit']")).click();

	WebDriverWait wait=new WebDriverWait(driver, 20);
	WebElement guru99seleniumlink;
	  

	if(driver.getTitle().equalsIgnoreCase("Login successful"))
	{
		System.out.println("PASS");
	}
	else {
		System.out.println("FAIL");
	}
		

	}



public void testCase6() {

	  openBrowser(drop4);
	driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("admin");
	driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin");
	driver.findElement(By.xpath("//*[@name='submit']")).click();

	WebDriverWait wait=new WebDriverWait(driver, 20);
	WebElement guru99seleniumlink;
	  

	if(driver.getTitle().equalsIgnoreCase("Login successful"))
	{
		System.out.println("PASS");
	}
	else {
		System.out.println("FAIL");
	}
		

	}



public void testCase7() {

	  openBrowser(drop4);
	driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("admin");
	driver.findElement(By.xpath("//*[@name='password']")).sendKeys("adminshabbeer");
	driver.findElement(By.xpath("//*[@name='submit']")).click();

	WebDriverWait wait=new WebDriverWait(driver, 20);
	WebElement guru99seleniumlink;
	  

	if(driver.getTitle().equalsIgnoreCase("Login successful"))
	{
		System.out.println("PASS");
	}
	else {
		System.out.println("FAIL");
	}
		

	}



public void testCase8() {

	  openBrowser(drop4);
	driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("BABU");
	driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin");
	driver.findElement(By.xpath("//*[@name='submit']")).click();

	WebDriverWait wait=new WebDriverWait(driver, 20);
	WebElement guru99seleniumlink;
	  

	if(driver.getTitle().equalsIgnoreCase("Login successful"))
	{
		System.out.println("PASS");
	}
	else {
		System.out.println("FAIL");
	}
		

	}


public void testCase9() {

	  openBrowser(drop4);
	driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("admin");
	driver.findElement(By.xpath("//*[@name='password']")).sendKeys("ADMIN");
	driver.findElement(By.xpath("//*[@name='submit']")).click();

	WebDriverWait wait=new WebDriverWait(driver, 20);
	WebElement guru99seleniumlink;
	  

	if(driver.getTitle().equalsIgnoreCase("Login successful"))
	{
		System.out.println("PASS");
	}
	else {
		System.out.println("FAIL");
	}
		

	}



public void testCase10() {

	  openBrowser(drop4);
	driver.findElement(By.xpath("//input[@class='field']")).sendKeys("babu9000");
	driver.findElement(By.xpath("//input[@id='LoginForm_password']")).sendKeys("Admin");
	driver.findElement(By.xpath("//button[@name='LoginForm[submit]']")).click();

	WebDriverWait wait=new WebDriverWait(driver, 20);
    
	  String drop = driver.findElement(By.xpath("//*[@class='login-error']")).getText();
      System.out.println(drop);
	if(driver.getTitle().equalsIgnoreCase("Login sucessfully"))
	{
		System.out.println("PASS");
	}
	else {
		System.out.println("FAIL");
	}
		

	}



public void testcase11() {
	   
  openBrowser(drop4a);

	WebDriverWait wait=new WebDriverWait(driver, 20);
    driver.findElement(By.id("RegistrationForm_username")).sendKeys("mckdd,,");
	  String drop = driver.findElement(By.xpath("/html/body/main/div[1]/div[2]/div[3]/form/div[3]/div/span[1]")).getText();
	  
    System.out.println(drop);
	if(driver.getTitle().equalsIgnoreCase("Login sucessfully"))
	{
		System.out.println("PASS");
	}
	else {
		System.out.println("FAIL");
	}
		

	}



public void testcase12() {
	   
	  openBrowser(drop4a);

		WebDriverWait wait=new WebDriverWait(driver, 20);
	    driver.findElement(By.id("RegistrationForm_username")).sendKeys("7");
		  String drop = driver.findElement(By.xpath("/html/body/main/div[1]/div[2]/div[3]/form/div[3]/div/span[1]")).getText();
		  
	    System.out.println(drop);
		if(driver.getTitle().equalsIgnoreCase("Login sucessfully"))
		{
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
			

		}

	



public void testcase13() {
	   
	  openBrowser(drop4a);

		WebDriverWait wait=new WebDriverWait(driver, 20);
	    driver.findElement(By.id("RegistrationForm_username")).sendKeys("jjjjjdk");
	     
		 String drop = driver.findElement(By.xpath("/html/body/main/div[1]/div[2]/div[3]/form/div[3]/div/span[1]")).getText();
		  
	    System.out.println(drop);
		if(driver.getTitle().equalsIgnoreCase("Login sucessfully"))
		{
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
			

		}

	}












































