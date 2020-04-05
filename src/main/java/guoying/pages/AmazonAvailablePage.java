package guoying.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AmazonAvailablePage {
    WebDriver driver;

    @FindBy(name="proceedToCheckout")
    WebElement checkout_button;

    public AmazonAvailablePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public List<WebElement> availableButtons() {
        List<WebElement> available_buttons = driver.findElements(By.xpath("//*[starts-with(@name, '2020')]"));
        System.out.print("\007");
        return available_buttons;
    }

    public WebElement slotDivOfButton() {
        List<WebElement> slot_divs = driver.findElements(By.cssSelector("div[class='ufss-slot-price-container']"));
        for(WebElement slotdiv : slot_divs) {
            WebElement slotspan = slotdiv.findElement(By.cssSelector("span[class='ufss-slot-price-text'"));
            if(!slotspan.getText().equals("Not available")) {
                return slotdiv;
            }
        }
        return null;
    }

    public WebElement submitButton() {
        WebElement submit_button = driver.findElement(By.cssSelector("input[type='submit']"));
        return submit_button;
    }
}
