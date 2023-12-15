package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTest {

	
	public void demoTest()
	{
	//browser launching//
	String BROWSER = System.getProperty("browser");
	String URL = System.getProperty("url");
	System.out.println("BROWSER");
	System.out.println("URL");
	
	WebDriver driver;
	
	if(BROWSER.equalsIgnoreCase("chrome"))
	{
	 WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 
	}
	else {
		driver=new EdgeDriver();
	}
	driver.get(URL);
	
	
	
	
	}
	
}
