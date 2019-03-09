
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Properties;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.*;

import com.mashape.unirest.http.exceptions.UnirestException;

import Infrastructure.WebDriverWrapper;
import Infrastructure.GenericPageObject;
import ProjectUtils.HttpRequests;
import ProjectUtils.ProcessUtils;
import ProjectUtils.ReadPropertyFile;

public class Basic {
	
	public WebDriverWrapper driverWrapper;
	
	static final String HUB_BATCH_PATH = "C:\\Users\\galif\\OneDrive\\Desktop\\Selenium\\startgrid.bat";
	
	static final String NODE_BATCH_PATH = "C:\\Users\\galif\\OneDrive\\Desktop\\Selenium\\startNode.bat";
		
	public static ReadPropertyFile readProperties = new ReadPropertyFile();
	
	public static Properties prop;
	
	
	
	
	@Rule
	public TestName testName = new TestName();
	
	
	@BeforeClass
	public static void setupClass() {
		
		ProcessUtils.startBatchFromCmd(HUB_BATCH_PATH);
		
		
		ProcessUtils.startBatchFromCmd(NODE_BATCH_PATH);
	
		
		prop = new Properties();
		
		
		prop = readProperties.readPropFile(prop, "C:\\Users\\galif\\eclipse-workspace\\AutomationProject\\src\\test\\java\\SutProperties\\config.properties");
	
	}
	
	@Before
	public void setup() throws MalformedURLException {
		
		driverWrapper = new WebDriverWrapper();
		

		driverWrapper.init("http://localhost:4444/wd/hub");
		
		driverWrapper.MaximizeWIndow();
		
		GenericPageObject.setDriver(driverWrapper);
		
		
	}
	
	@After
	public void tearDown() {
		
		System.out.println("end of: " + testName.getMethodName() + " end");
		
		
		driverWrapper.close();
	}
	
	@AfterClass
	public static void tearDownClass() throws IOException, UnirestException {
		
		ProcessUtils.killProcess();
		
		
		ProcessUtils.closeCmd();
		
		
		readProperties.killInput();
		

		HttpRequests request = new HttpRequests();

		
		request.postFile();
		
		
		System.out.println("killed all running processes!");
	}
}
