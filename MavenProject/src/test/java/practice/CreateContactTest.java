package practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContactTest {
@Test
	public void Test1()
	{
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in");
		System.out.println("hello");
	}


}
//pushed
