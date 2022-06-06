package test.telecomunications.positive;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Test;
import pages.telecomunications.MobilePhoneReplenishmentPage;
import test.base.BaseTest;



import static com.codeborne.selenide.Selenide.open;
import static constants.Constant.MobileReplenishmentData.*;
import static constants.Constant.Urls.MOBILE_PEYMENT_URL;

public class MobilePhoneReplenishmentPositiveTest extends BaseTest {
    @Test
    @Epic("1 тест")
    @Feature("1 тест")
    @Step("1 шаг")
//    public void OpenTest(){
//        open("https://docs.qameta.io/allure/#_junit_5");
//    }

    public void checkIsRedirectToAuth(){
        basePages.goToUrl(MOBILE_PEYMENT_URL);
        mobilePhoneReplenishmentPage.selectCardFromWallet();
        basePages.isAethWidgetPresent();
    }
    @Test
    public void checkMinimumReplenishmentAmout(){
        basePages.goToUrl(MOBILE_PEYMENT_URL);
        mobilePhoneReplenishmentPage
                .enterPhoneNumber(MOBILE_PAYMENT_PHONE_NUMBER)
                .enterAmount("1")
                .enterCardFrom(MOBILE_PAYMENT_CARD)
                .enterCardExpDate(MOBILE_PAYMENT_CARD_EXP_DATA)
                .enterCardCvv(MOBILE_PAYMENT_CARD_CVV)
                .submitToTheCard()
                .checkPeymentDetails("Mobile payment. Phone number +380992372022");
    }
}
