package autoslot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPlaceOrderPage {
    WebDriver driver;

    @FindBy(name="placeYourOrder1")
    WebElement placeorder_button;

    public AmazonPlaceOrderPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement placeOrderButtonPath() {
        return placeorder_button;
    }
}
