package autoslot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPaymentPage {
    WebDriver driver;

    public AmazonPaymentPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement submitButton() {
        WebElement submit_button = driver.findElement(By.cssSelector("input[type='submit']"));
        return submit_button;
    }
}
