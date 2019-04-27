import Infrastructure.Locators;
import io.qameta.allure.*;
import org.junit.Test;
import PageObjects.PageObjects.*;
import static org.junit.jupiter.api.Assertions.*;


@Epic("sanity tests")
@Feature("sanity options")

public class SanityTests extends Basic {



    @Test
    @Story("Sanity1")
    @Description("E2E - user make full flow with adding cc")
    @Severity(SeverityLevel.BLOCKER)
    public void redLionSanity(){


        // login

        HomePage.openRedLion();

        ConnectPage.login(prop.getProperty("EMAIL"), prop.getProperty("PASSWORD"));



        // choose hotel & week a head dates

        HomePage.enterLocationName(prop.getProperty("CITY_TO_SEARCH"));


        HomePage.chooseFirstLocation();


        HomePage.clickOnStartDateField();


        int active_date = HomePage.getSelectedStartDateIndex(HomePage.getDatePickerValues());


        HomePage.getDatePickerValues().get(active_date + 4).click();


        HomePage.getDatePickerValues().get(active_date + 5).click();


        HomePage.clickOnCheckAvailability();


        HomePage.clickOnQuickBook();



        // fill confirmation data & get cancellation policy text

        ConfirmationPage.enterPhoneNumber(prop.getProperty("PHONE_NUMBER"));


        ConfirmationPage.enterPostalCode(prop.getProperty("POSTAL_CODE"));


        String full_cancellation_text = OrderSummeryPage.getCancellationPolicyText();


        ConfirmationPage.clickOnAgreementCheckbox();


        System.out.println(full_cancellation_text);



        // add payment method

        ConfirmationPage.clickOnMangePaymentMethods();


        ConfirmationPage.clickOnAddNewCard();


        Wallet.switchToWalletIframe();


        Wallet.addPaymentMethod();


        Wallet.closeWallet();



        // complete reservation

        if(OrderSummeryPage.HasCancellation(full_cancellation_text)) {


            ConfirmationPage.clickOnReserveRoomBtn();


            ReservationSummery.waitForConfirmationScreen();


            driverWrapper.takeScreenShot("reservationSummery");


            ReservationSummery.clickOnCancellationBtn();


            ReservationSummery.clickOnCancellAgreementCheckbox();


            ReservationSummery.clickOnCancellConfirmationBtn();


            ReservationSummery.getCancalationNumber();


            driverWrapper.takeScreenShot("cancellationSummery");


        }


		else{

            fail("no cancellation policy");


            }

        }

}
