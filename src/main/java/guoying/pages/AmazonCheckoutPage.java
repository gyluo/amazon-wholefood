package guoying.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonCheckoutPage {
    WebDriver driver;

    public AmazonCheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement proceedToCheckoutPath() {
        WebElement proceed_checkout_button = driver.findElement(By.xpath("//*[starts-with(@name,'proceedToALMCheckout-')]"));
        return proceed_checkout_button;
    }
}
