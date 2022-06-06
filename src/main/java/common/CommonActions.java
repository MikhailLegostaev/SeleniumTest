package common;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static common.Config.PLATFORM_AND_BROWSER;
import static constants.Constant.TimoutVariables.IMPLICIT_WAIT;

public class CommonActions {
    public static WebDriver createDriver(){
        WebDriver driver = null;
        switch (PLATFORM_AND_BROWSER ){
            case "chrome_mac":
                System.setProperty("webdriver.chrome.driver","/Users/legostaevmihail/Documents/JAVA/Seleniumcourse/src/main/resources/chromedriver");
            driver = new ChromeDriver();
            break;
            default:
                Assertions.fail("INCORRECT BROWSER NAME" + PLATFORM_AND_BROWSER);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        return driver;
    }
}
