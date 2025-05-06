package page_package;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Relogin_page {
	
	
		WebDriver driver;

			@FindBy(xpath="//*[@id=\"desktop_wrapper\"]/div[3]/div[2]/header/div/ul/span[1]/li/a/span")WebElement log;
			@FindBy (xpath="//*[@id=\"login-email-pop\"]")WebElement mail;
			@FindBy (xpath="//*[@id=\"pass-pop\"]")WebElement pass;
			@FindBy (xpath="//*[@id=\"customer-popup-login-form\"]/fieldset/div[4]/div[1]/button")WebElement login;
			@FindBy (xpath="//*[@id=\"desktop_wrapper\"]/div[3]/div[2]/header/div/strong/a/img")WebElement RElogo;

			public Relogin_page(WebDriver driver)
			{
				this.driver=driver;
				PageFactory.initElements(driver, this);  
			}
			public void logicon()
			{
				log.click();
			}

			public void setvalues(String email,String password)
			{
				mail.sendKeys(email);
				pass.sendKeys(password);
			}
			public void login_btn()
			{
				login.click();
				
			}
			public void logosearch() {
				 boolean l=RElogo.isDisplayed();
				 if(l==true) {
					 System.out.println("logo is present");
				 }
				 else
				 {
					 System.out.println("logo is not present");
				 }
				 
			 }
			public void text () {
				 String expt="Motorcycle Apparel, Gear, Merchandise & Clothing";
				 String act=driver.getTitle();
				 System.out.println(act);
				 Assert.assertEquals(expt,act);
					System.out.println("Title Matched");
			 }
			public void screenshot() throws Exception
			{
				File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
				FileHandler.copy(s,new File("./Screenshots/Login_screen.png"));
			
				System.out.println("Screenshot saved successfully");
				
			}


}
