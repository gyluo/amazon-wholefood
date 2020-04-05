package autoslot.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginHomePage {
    //nav-cart

    WebDriver driver;

    @FindBy(id="nav-cart")
    WebElement cart_link;

    public AmazonLoginHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement cartLinkPath() {
        return cart_link;
    }
}
