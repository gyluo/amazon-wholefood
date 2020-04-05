package guoying.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLogin2Page {
    WebDriver driver;

    @FindBy(id="ap_password")
    WebElement password_field;

    @FindBy(id="signInSubmit")
    WebElement signin_button;

    public AmazonLogin2Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement passwordFieldPath() {
        return password_field;
    }

    public WebElement signinButtonPath() {
        return signin_button;
    }
}
