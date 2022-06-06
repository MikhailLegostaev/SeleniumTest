package test.loans.positive;

import org.junit.jupiter.api.Test;
import test.base.BaseTest;

import static constants.Constant.Urls.CAR_LOANS_URL;

public class CarLoansPositiveTest extends BaseTest {

    @Test
    public void selectAgreementsTabInPublicSession(){
        basePages.goToUrl(CAR_LOANS_URL);
        carLoansPage.selectAgreementsTab();
        basePages.isAethWidgetPresent();
    }
}
