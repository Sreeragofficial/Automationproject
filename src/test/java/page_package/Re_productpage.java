package page_package;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Re_productpage {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//*[@id=\"search\"]")
    WebElement search;

    @FindBy(xpath = "//*[@id=\"search_mini_form\"]/div[2]/button")
    WebElement searchclk;

    @FindBy(xpath = "//*[@id=\"product-item-info_143184\"]/div[2]/div/div[1]/strong/a")
    WebElement product;

    @FindBy(xpath = "//*[@id=\"181-sitem-17\"]")
    WebElement size;

    @FindBy(xpath = "//*[@id=\"product-addtocart-button\"]")
    WebElement addtocart;

    @FindBy(xpath = "//*[@id=\"desktop_wrapper\"]/div[3]/div[2]/header/div/div[1]/a")
    WebElement carticon;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/header/div/div[1]/div/div/div/div[2]/div[4]/div[1]/a")
    WebElement minicart;

    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div/div[4]/div[2]/div[6]/ul/li/button")
    WebElement checkout;

    // Constructor to initialize elements and WebDriverWait
    public Re_productpage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void subclk() throws Exception {
        // Type into the search field
        search.sendKeys("Riding jacket");

        // Click the search button
        searchclk.click();

        // Wait for the product link to be clickable and scroll to it
        wait.until(ExpectedConditions.elementToBeClickable(product));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", product);

        // Click the product using JavaScript
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", product);

        // Wait for the size option to be clickable and then click it
        wait.until(ExpectedConditions.elementToBeClickable(size));
        size.click();

        // Wait for the 'Add to Cart' button to be clickable and then click it
        wait.until(ExpectedConditions.elementToBeClickable(addtocart));
        addtocart.click();

        // Wait for the cart icon to be clickable and click it
        wait.until(ExpectedConditions.elementToBeClickable(carticon));
        carticon.click();
    }

    public void cart_click() throws InterruptedException {
        // Wait for and click the minicart
        wait.until(ExpectedConditions.elementToBeClickable(minicart));
        minicart.click();

        // Wait for and click the checkout button
        wait.until(ExpectedConditions.elementToBeClickable(checkout));
        checkout.click();
    }
}
