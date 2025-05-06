package page_package;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class Checkoutpage {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "/html/body/div[1]/div[2]/main/div[3]/div/div[4]/div[4]/ol/li[1]/div[2]/form/div/fieldset/div/div[1]/div/input")
    WebElement Addressline1;

    @FindBy(xpath = "/html/body/div[1]/div[2]/main/div[3]/div/div[4]/div[4]/ol/li[1]/div[2]/form/div/fieldset/div/div[2]/div/input")
    WebElement Addressline2;

    @FindBy(xpath = "/html/body/div[1]/div[2]/main/div[3]/div/div[4]/div[4]/ol/li[1]/div[2]/form/div/div[4]/div/select")
    WebElement State;

    @FindBy(xpath = "/html/body/div[1]/div[2]/main/div[3]/div/div[4]/div[4]/ol/li[1]/div[2]/form/div/div[6]/div/input")
    WebElement City;

    @FindBy(xpath = "/html/body/div[1]/div[2]/main/div[3]/div/div[4]/div[4]/ol/li[1]/div[2]/form/div/div[7]/div/input")
    WebElement Zipcode;

    @FindBy(xpath = "/html/body/div[1]/div[2]/main/div[3]/div/div[4]/div[4]/ol/li[1]/div[2]/form/div/div[8]/div/select")
    WebElement Addresstype;

    @FindBy(xpath = "/html/body/div[1]/div[2]/main/div[3]/div/div[4]/div[4]/ol/li[1]/div[2]/form/div/div[9]/div/div[1]/input")
    WebElement phno;

    @FindBy(xpath = "//*[@id='shipping-method-buttons-container']/div[1]/button")
    WebElement nextbutn;

    public Checkoutpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void details() {
        wait.until(ExpectedConditions.visibilityOf(Addressline1)).sendKeys("Vaishnavi apartment");
        Addressline2.sendKeys("Devi nagar kollam");

        wait.until(ExpectedConditions.elementToBeClickable(State));
        new Select(State).selectByVisibleText("Kerala");

        City.sendKeys("Kollam");
        Zipcode.sendKeys("691013");
        new Select(Addresstype).selectByVisibleText("Home");
        phno.sendKeys("9048636426");
    }

    public void buttonclick() throws Exception {
        wait.until(ExpectedConditions.elementToBeClickable(nextbutn)).click();
        Thread.sleep(4000);
    }
    public void screenshot1() throws Exception
	{
		File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		FileHandler.copy(s,new File("./Screenshots/Payment_screen.png"));
	
		System.out.println("Screenshot saved successfully");
		
	}
}
