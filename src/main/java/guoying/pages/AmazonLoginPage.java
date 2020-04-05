package guoying.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPage {
    WebDriver driver;

    @FindBy(id="ap_email")
    WebElement email_field;

    @FindBy(id="continue")
    WebElement continue_button;

    public AmazonLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement emailFieldPath() {
        return email_field;
    }

    public WebElement continueButtonPath() {
        return continue_button;
    }
}
