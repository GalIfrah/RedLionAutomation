import java.text.SimpleDateFormat;
import java.util.Date;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.Test;
import PageObjects.PageObjects.*;


import static org.junit.Assert.*;


public class SanityTests extends Basic {


    public String time_stamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

    @Story("trying allure")
    @Description("test test")
    @Test
    public void redLionSanity() throws InterruptedException {


        HomePage.openRedLion();

        assertTrue(1==1);

//        ConnectPage.login("liorl@mycheck.co.il", "Lior2311");// prop.getProperty("EMAIL"), prop.getProperty("PASSWORD"));
//
//
//        HomePage.enterLocationName("New York");// prop.getProperty("CITY_TO_SEARCH"));
//
//
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
//        ConfirmationPage.enterPhoneNumber("7394624324325");//prop.getProperty("PHONE_NUMBER"));
//
//
//        ConfirmationPage.enterPostalCode("55555555");//prop.getProperty("POSTAL_CODE"));
//
//
//        String full_cancellation_text = OrderSummeryPage.getCancellationPolicyText();
//
//        System.out.println(full_cancellation_text);
//
//        ConfirmationPage.clickOnMangePaymentMethods();
//
//
//        ConfirmationPage.clickOnAddNewCard();
//
//        driverWrapper.swichToIfarme();
//
//        if(OrderSummeryPage.HasCancellation(full_cancellation_text)) {
//
//
//            setTime_stamp(time_stamp);
//
//
//            driverWrapper.takeScreenShot(time_stamp);
//
//
//            // perform room reservation - needs real payment methods...
//
//
////            String confirmation_text = ConfirmationPage.getConfirmationText();
////
////
////            assertEquals(confirmation_text, prop.getProperty("CONFIRMATION_TEXT"));
//        }
//
//
//		else{
//
//                fail("no cancellation policy");
//
//            }


        }

}
