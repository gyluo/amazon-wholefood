package testcases.amazonfresh;

import guoying.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import testcases.mytheresa.BrowserSetting;
import variables.mytheresa.Configures;

import java.util.List;

public class BuyFood {
    @Test
    public void buyFoodInALoop() throws Exception {
        BrowserSetting bs = new BrowserSetting();

        while(true) {
            WebDriver driver = bs.BrowserSettings();

            boolean available = buyfood(driver);

            if (!available) {
                driver.close();
                Thread.sleep(2 * 60 * 1000); //every 10 mins
            } else {
                System.out.println("Order complete!");
                break;
            }
        }
    }

    private void beeps() throws InterruptedException {
        for(int i=0; i<1000; i++) {
            java.awt.Toolkit.getDefaultToolkit().beep();
            Thread.sleep(1);
        }
    }

    private boolean buyfood(WebDriver driver) throws InterruptedException {
        AmazonHomePage homepage = new AmazonHomePage(driver);
        homepage.accountListLinkPath().click();

        // account create page's object access
        AmazonLoginPage loginPage = new AmazonLoginPage(driver);

        loginPage.emailFieldPath().sendKeys(Configures.username);
        loginPage.continueButtonPath().click();

        AmazonLogin2Page login2Page = new AmazonLogin2Page(driver);
        login2Page.passwordFieldPath().sendKeys(Configures.password);
        login2Page.signinButtonPath().click();

        AmazonLoginHomePage loginHomePage = new AmazonLoginHomePage(driver);
        loginHomePage.cartLinkPath().click();

        AmazonCheckoutPage checkoutPage = new AmazonCheckoutPage(driver);
        checkoutPage.proceedToCheckoutPath().click();

        AmazonCheckout2Page checkout2Page = new AmazonCheckout2Page(driver);
        checkout2Page.checkoutButtonPath().click();

        AmazonSubstitutePage substitutePage = new AmazonSubstitutePage(driver);
        substitutePage.checkoutButtonPath().click();

        AmazonAvailablePage availablePage = new AmazonAvailablePage(driver);
        List<WebElement> availableButtons = availablePage.availableButtons();

        for(WebElement availButton : availableButtons) {
            System.out.println(availButton.getText());
            if(!availButton.getText().contains("Not available")) {
                availButton.click();
                WebElement slotDivButton = availablePage.slotDivOfButton();
                if(slotDivButton != null) {
                    slotDivButton.click();
                    availablePage.submitButton().click();

                    Thread.sleep(1000);

                    AmazonPaymentPage pagementPage = new AmazonPaymentPage(driver);
                    pagementPage.submitButton().click();

                    AmazonPlaceOrderPage placeOrderPage = new AmazonPlaceOrderPage(driver);
                    placeOrderPage.placeOrderButtonPath().click();

                    return true;
                }
            }
        }

        return false;
    }
}
