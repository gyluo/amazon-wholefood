package autoslot.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSubstitutePage {
    //subsContinueButton-announce
    WebDriver driver;

    @FindBy(id="subsContinueButton")
    WebElement continueSpan;

    public AmazonSubstitutePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement checkoutButtonPath() {
        WebElement submit_button = continueSpan.findElement(By.xpath(".//input"));
        return submit_button;
    }
}
