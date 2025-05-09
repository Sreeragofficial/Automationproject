package base_package;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base_RoyalEnfield 
{
	
		public static WebDriver driver;
		@BeforeTest
		public void setup()
		{
			driver=new ChromeDriver();
			driver.get("https://store.royalenfield.com/en/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		}
		@AfterTest
		public void teardown()
		{
			driver.quit();
		}


}
