

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;

import PageObjects.PageObjects.HomeScreen;
import ProjectUtils.SlackService;

public class HomeTests extends Basic {

	@Test
	public void test1() throws Exception {
	
		HomeScreen.openRedLion();
		
		driverWrapper.takeScreenShot("test2");
		
		SlackService slack = new SlackService();
	
		Thread.sleep(10000);
		
		slack.uploadImage("C:\\Users\\galif\\eclipse-workspace\\RedLionAutomation\\ScreenShots\\test.png");

//		slack.send_message("http://sites.goop.co.il/GoopSitesFiles/0/User/Upload/1.jpg");
		
//		HomeScreen.clickOnHelloRewardsPopup();
//		
//		HomeScreen.clickOnHelloRewards();
//				
//		HomeScreen.enterEmail();
//		
//		HomeScreen.enterPassword();
//		
//		HomeScreen.clickOnSignIn();
//		
//		HomeScreen.enterLocationName();
//		
//		HomeScreen.chooseFirstLocatio();
//	
//		HomeScreen.clickOnStartDateField();
//		
//		int active_date = HomeScreen.getSelectedStartDateIndex(HomeScreen.getDatePickerValues());
//		
//		HomeScreen.getDatePickerValues().get(active_date + 7).click();
//		
//		HomeScreen.getDatePickerValues().get(active_date + 8).click();
//		
//		HomeScreen.clickOnCheckAvailability();
//		
//		HomeScreen.clickOnQuickBook();
//				
//		String full_cancellation_text = HomeScreen.getCencelationPolicyText();
//		
//		if(HomeScreen.HasCancellation(full_cancellation_text)) {
//			
//			System.out.println("good meod!!!");
//			
//			driverWrapper.takeScreenShot("RD_screen");
//			// perform room reservation 
//		}
////		
//		Thread.sleep(1000);
//		
	}
	
}
