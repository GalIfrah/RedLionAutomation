import java.io.IOException;
import java.util.Properties;
import ProjectUtils.SlackService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.*;
import com.mashape.unirest.http.exceptions.UnirestException;
import Infrastructure.WebDriverWrapper;
import Infrastructure.GenericPageObject;
import ProjectUtils.ProcessUtils;
import ProjectUtils.ReadPropertyFile;



public class Basic {


	public WebDriverWrapper driverWrapper;

	public static Properties prop = null;

	public static ReadPropertyFile readProperties = new ReadPropertyFile();

//	static final String HUB_PATH = "/home/gal/IdeaProjects/RedLionAutomation/startHub.sh";
//
//	static final String NODE_PATH = "/home/gal/IdeaProjects/RedLionAutomation/startNode.sh";

	public static String time_stamp = null;



	@Rule
	public TestName testName = new TestName();



	@BeforeClass
	public static void setupClass() {

			prop = new Properties();


			prop = readProperties.readPropFile(prop, "/home/gal/IdeaProjects/RedLionAutomation/src/test/java/SutProperties/config.properties");


			ProcessUtils.startGrid(prop.getProperty("HUB_PATH"));


			ProcessUtils.startGrid(prop.getProperty("NODE_PATH"));

	}



	@Before
	public void setup() throws IOException {

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

		SlackService slack = new SlackService();


		slack.uploadImage("/home/gal/IdeaProjects/RedLionAutomation/ScreenShots/" + time_stamp + ".png");


		ProcessUtils.killProcess();


		readProperties.killInput();


		System.out.println("killed all running processes!");

	}



	public void setTimeStemp(String taken_time_stamp) {

		time_stamp = taken_time_stamp;

	}

}
