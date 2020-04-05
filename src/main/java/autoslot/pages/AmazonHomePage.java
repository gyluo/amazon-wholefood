package autoslot.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {
    WebDriver driver;

    @FindBy(id="nav-link-accountList")
    WebElement account_list_link;

    public AmazonHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement accountListLinkPath() {
        return account_list_link;
    }
}
