import Infrastructure.Locators;
import org.junit.Test;
import PageObjects.PageObjects.*;



public class SanityTests extends Basic {



    @Test
    public void redLionSanity(){


        // login

        HomePage.openRedLion();

//        ConnectPage.login(prop.getProperty("EMAIL"), prop.getProperty("PASSWORD"));
//
//
//
//        // choose hotel & week a head dates
//
//        HomePage.enterLocationName(prop.getProperty("CITY_TO_SEARCH"));

        System.out.println("gal");
//        HomePage.chooseFirstLocation();
//
//
//        HomePage.clickOnStartDateField();
//
//
//        int active_date = HomePage.getSelectedStartDateIndex(HomePage.getDatePickerValues());
//
//
//        HomePage.getDatePickerValues().get(active_date + 4).click();
//
//
//        HomePage.getDatePickerValues().get(active_date + 5).click();
//
//
//        HomePage.clickOnCheckAvailability();
//
//
//        HomePage.clickOnQuickBook();
//
//
//
//        // fill confirmation data & get cancellation policy text
//
//        ConfirmationPage.enterPhoneNumber(prop.getProperty("PHONE_NUMBER"));
//
//
//        ConfirmationPage.enterPostalCode(prop.getProperty("POSTAL_CODE"));
//
//
//        String full_cancellation_text = OrderSummeryPage.getCancellationPolicyText();
//
//
//        ConfirmationPage.clickOnAgreementCheckbox();
//
//
//        System.out.println(full_cancellation_text);
//
//
//
//        // add payment method
//
//        ConfirmationPage.clickOnMangePaymentMethods();
//
//
//        ConfirmationPage.clickOnAddNewCard();
//
//
//        Wallet.switchToWalletIframe();
//
//
//        Wallet.addPaymentMethod();
//
//
//        Wallet.closeWallet();
//
//
//
//        // complete reservation
//
//        if(OrderSummeryPage.HasCancellation(full_cancellation_text)) {
//
//
//            ConfirmationPage.clickOnReserveRoomBtn();
//
//
//            ReservationSummery.waitForConfirmationScreen();
//
//
//            driverWrapper.takeScreenShot("reservationSummery");
//
//
//            ReservationSummery.clickOnCancellationBtn();
//
//
//            ReservationSummery.clickOnCancellAgreementCheckbox();
//
//
//            ReservationSummery.clickOnCancellConfirmationBtn();
//
//
//            ReservationSummery.getCancalationNumber();
//
//
//            driverWrapper.takeScreenShot("cancellationSummery");
//
//
//        }
//
//
//		else{
//
//            fail("no cancellation policy");
//
//
//            }

        }

}
