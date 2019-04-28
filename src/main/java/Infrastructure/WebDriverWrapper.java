package Infrastructure;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class WebDriverWrapper {


	RemoteWebDriver remoteWebDriver;



	public void init(String remoteUrl) throws MalformedURLException {
		
		ChromeOptions options = new ChromeOptions();

		options.setBinary("/etc/alternatives/google-chrome");
//		options.addArguments("--headless", "--disable-gpu", "--no-sandbox", "--disable-dev-shm-usage");

		remoteWebDriver = new RemoteWebDriver(new URL(remoteUrl), options);
	}
	
	
	public WebElement findElementBy(Locators locator, String value) {
		
		WebElement element = null;
		
		
		WebDriverWait driverWait = new WebDriverWait(remoteWebDriver, 15);
		
		
		switch (locator) {
		
		
		case XPATH:
			try {
				
				element = driverWait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(value)));
	
				
			} catch (NullPointerException e){
				
				
					System.out.println(e.getMessage());
			}
			break;
			
			
		case ID:
			
			try {
			
				
				element = driverWait.until(ExpectedConditions.presenceOfElementLocated(By.id(value)));
			
				
			} catch (NullPointerException e){
			
				
				System.out.println(e.getMessage());
			}
			break;
			

		default:
			
			
			System.out.println("the locator type is wrong - please use the Locators enum");
		}
		
		
		return element;
	}
	
	
	public List<WebElement> findElementsBy(String value){
		
		WebDriverWait driverWait = new WebDriverWait(remoteWebDriver, 10);
		
		
		return driverWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(value)));
		
	}


	public void open(String url) {


		remoteWebDriver.get(url);
	}


	public void clearField(WebElement elementToClear) {
		
		elementToClear.clear();
		
		
		try {
			
			Thread.sleep(1000);
		
		
		} catch(InterruptedException e) {
			
		
			System.out.println(e.getMessage());
		}
	}


	public void close() {

		remoteWebDriver.close();
	}


	public void quit() {

		remoteWebDriver.quit();
	}


	public String getTitle() {
		
		return remoteWebDriver.getTitle(); 
	}


	public void hover(String elementToHoverValue) {
		
		Actions action = new Actions(remoteWebDriver);
		
		
		WebElement elementToHover = remoteWebDriver.findElementByXPath(elementToHoverValue);
		
		
		action.moveToElement(elementToHover).build().perform();
		
	}
	
	
	public void HoverAndClick(String elementToHoverValue, String elementToClickValue) {
	
		Actions action = new Actions(remoteWebDriver);
		
		
		WebElement elementToHover = remoteWebDriver.findElementByXPath(elementToHoverValue);

		
		WebElement elementToClick = remoteWebDriver.findElementByXPath(elementToClickValue);
		
		
		action.moveToElement(elementToHover).doubleClick(elementToClick).build().perform();

	}
	
	
	public void scrollToElement(String value) {

		try {

			Thread.sleep(2000);

		} catch (InterruptedException e){

			System.out.println(e.getMessage());

		}

		WebElement element = remoteWebDriver.findElementByXPath(value);
		
		
		((JavascriptExecutor) remoteWebDriver).executeScript("arguments[0].scrollIntoView();", element);
		
	}

	public void scrollToElementById(String value) {

		try {

			Thread.sleep(2000);

		} catch (InterruptedException e){

			System.out.println(e.getMessage());

		}

		WebElement element = remoteWebDriver.findElementById(value);


		((JavascriptExecutor) remoteWebDriver).executeScript("arguments[0].scrollIntoView();", element);

	}
	
	
	public File takeScreenShot(String name){

		File source = null;

		try {

			TakesScreenshot sc = (TakesScreenshot) remoteWebDriver;


			source = sc.getScreenshotAs(OutputType.FILE);


			FileUtils.copyFile(source, new File("/home/gal/IdeaProjects/RedLionAutomation/ScreenShots/" + name + ".png"));

			System.out.println("/home/gal/IdeaProjects/RedLionAutomation/ScreenShots" + name + ".png");

		}

		catch(IOException e){

			}

		return source;
	}
	
	
	public WebElement waitForElemToBeClickable(String value) {
		
		WebDriverWait wait = new WebDriverWait(remoteWebDriver, 10);
		
		
		return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(value)));
	} 
	
	
	public boolean waitForInvisibility(String value) {
		
		WebDriverWait wait = new WebDriverWait(remoteWebDriver, 10);
		
		
		return wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(value)));
	}


//	check return type


	public WebElement waitForVisibilityById(String value){

		WebDriverWait wait = new WebDriverWait(remoteWebDriver, 15);

		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(value)));
	}

	public WebElement waitForVisibilityByXpath(String value){

		WebDriverWait wait = new WebDriverWait(remoteWebDriver, 15);

		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(value)));
	}


	public void switchToIframe(String iframe_name){

		remoteWebDriver.switchTo().frame(iframe_name);

	}


	public void switchToDefaultContent(){

		remoteWebDriver.switchTo().defaultContent();
	}


	public void MaximizeWindow() {
		
		remoteWebDriver.manage().window().maximize();
	}
	
	
	public void waitForElement() {
		
		try {
			
			Thread.sleep(4000);
		
			

		} catch(InterruptedException e) {
			
			
			System.out.println(e.getMessage());
		}
	}
	
}
