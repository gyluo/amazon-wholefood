package autoslot.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonCheckout2Page {
    //proceedToCheckout
    WebDriver driver;

    @FindBy(name="proceedToCheckout")
    WebElement checkout_button;

    public AmazonCheckout2Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement checkoutButtonPath() {
        return checkout_button;
    }
}
