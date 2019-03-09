

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;

import PageObjects.PageObjects.HomeScreen;;

public class HomeTests extends Basic {

	@Test
	public void test1() throws InterruptedException, IOException {

		HomeScreen.openRedLion();
		
		HomeScreen.clickOnHelloRewardsPopup();
		
		HomeScreen.clickOnHelloRewards();
				
		HomeScreen.enterEmail();
		
		HomeScreen.enterPassword();
		
		HomeScreen.clickOnSignIn();
		
		HomeScreen.enterLocationName();
		
		HomeScreen.chooseFirstLocatio();
	
		HomeScreen.clickOnStartDateField();
		
		int active_date = HomeScreen.getSelectedStartDateIndex(HomeScreen.getDatePickerValues());
		
		HomeScreen.getDatePickerValues().get(active_date + 7).click();
		
		HomeScreen.getDatePickerValues().get(active_date + 8).click();
		
		HomeScreen.clickOnCheckAvailability();
		
		HomeScreen.clickOnQuickBook();
		
		String full_cancellation_text = HomeScreen.getCencelationPolicyText();
		
		if(HomeScreen.HasCancellation(full_cancellation_text)) {
			
			System.out.println("good meod!!!");
			
			// perform room reservation 
		}
		
		Thread.sleep(10000);
	
	}
	
}
