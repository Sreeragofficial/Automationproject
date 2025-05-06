package page_package;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RE_createaccount {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"desktop_wrapper\"]/div[3]/div[2]/header/div/ul/span[1]/li/a/span")WebElement logicon ;
	@FindBy(xpath="//*[@id=\"customer-popup-login-form\"]/fieldset/div[6]/a")WebElement createaccount ;
	@FindBy(xpath="//*[@id=\"firstname\"]")WebElement fname ;
	@FindBy(xpath="//*[@id=\"lastname\"]")WebElement lname ;
	@FindBy(xpath="//*[@id=\"email_address\"]")WebElement email ;
	@FindBy(xpath="//*[@id=\"mobile_no\"]")WebElement mobile_no ;
	@FindBy(xpath="//*[@id=\"dob\"]")WebElement dob ;
	@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")WebElement month;
	@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")WebElement year;
	@FindBy(xpath="//*[@id=\"gender\"]")WebElement gender ;
	@FindBy(xpath="//*[@id=\"password\"]")WebElement pass ;
	@FindBy(xpath="//*[@id=\"tc\"]")WebElement tc ;
	@FindBy(xpath="//*[@id=\"form-validate\"]/div[2]/div[1]/button")WebElement createbtn ;
	
	public RE_createaccount(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements( driver,this);
		
	}
			public void log()
			{
				logicon.click();
			}
			public void create() 
			{
				createaccount.click();
			}
			public void setvalues() 
			{
				fname.sendKeys("sreerag");
				lname.sendKeys("sr");
				email.sendKeys("sreerag.sr777@gmail.com");
				mobile_no.sendKeys("6282858401");
			}
			public void datebirth()
			{
				dob.click();
				Select ob=new Select(month);
				ob.selectByValue("Nov");
				Select ob1=new Select(year);
				ob1.selectByValue("1996");	
				
			}
			public void set()
			{
				pass.sendKeys("Mallok@123");
				tc.click();
			}
			public void button()
			{
				createbtn.click();
			}
		
	}


