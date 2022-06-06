package pages.telecomunications;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePages;

import java.nio.file.WatchEvent;

public class MobilePhoneReplenishmentPage extends BasePages {
    public MobilePhoneReplenishmentPage(WebDriver driver){
        super(driver);
    }
    private final By buttonWallet = By.xpath("//*[@id=\"app\"]/div[2]/section/div/div[1]/div[2]/div[1]/div/form/div[4]/div/div[1]/div[2]/div/div[1]");
    private final By inputCardFrom = By.xpath("//input[@data-qa-node='numberdebitSource']");
    private final By inputCardExpDate = By.xpath("//input[@data-qa-node='expiredebitSource']");
    private final By inputCardCvv = By.xpath("//input[@data-qa-node='cvvdebitSource']");
    private final By inputPhoneNumber = By.xpath("//input[@data-qa-node='phone-number']");
    private final By inputAmount = By.xpath("//input[@data-qa-node='amount']");
    private final By buttonSubmitToTheCard = By.xpath("//button[@data-qa-node='submit']");
    private final By peymentDetails = By.xpath("//span[@data-qa-node='details']");

    public MobilePhoneReplenishmentPage enterPhoneNumber(String number){
        driver.findElement(inputPhoneNumber).sendKeys(number);
        return this;
    }
    public MobilePhoneReplenishmentPage enterCardCvv(String cvv){
        driver.findElement(inputCardCvv).sendKeys(cvv);
        return this;
    }
    public MobilePhoneReplenishmentPage enterCardExpDate(String cardExpDate){
        driver.findElement(inputCardExpDate).sendKeys(cardExpDate);
        return this;
    }
    public MobilePhoneReplenishmentPage enterAmount(String amount){
        driver.findElement(inputAmount).sendKeys(amount);
        return this;
    }
    public MobilePhoneReplenishmentPage enterCardFrom (String cardFrom){
        driver.findElement(inputCardFrom).sendKeys(cardFrom);
        return this;
    }
    public MobilePhoneReplenishmentPage selectCardFromWallet(){
        driver.findElement(buttonWallet).click();
        return this;
    }
    public MobilePhoneReplenishmentPage submitToTheCard(){
        driver.findElement(buttonSubmitToTheCard).click();
        return this;
    }
    public MobilePhoneReplenishmentPage checkPeymentDetails(String text){
        weitElementIsVisible(driver.findElement(peymentDetails));
        WebElement details = driver.findElement(peymentDetails);
        Assertions.assertEquals(text, details.getText());
        return this;
    }
}
