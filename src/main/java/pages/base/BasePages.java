package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static constants.Constant.TimoutVariables.EXPLICIT_WAIT;

public class BasePages {
    public WebDriver driver;
    public BasePages(WebDriver driver){
        this.driver = driver;
    }
    public final By authWidget = By.xpath("//iframe[@src='https://login-widget.privat24.ua/']");
    public void goToUrl(String url){
    driver.get(url);
    }
    public WebElement weitElementIsVisible(WebElement element){
        new WebDriverWait(driver, EXPLICIT_WAIT).until(ExpectedConditions.visibilityOf(element));
        return element;
    }
    //
    //Check is auth frame is visible
    //
    public void isAethWidgetPresent(){
        WebElement authFrame = driver.findElement(authWidget);
        weitElementIsVisible(authFrame);

    }
}
