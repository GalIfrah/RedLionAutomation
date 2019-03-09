package ProjectUtils;

import java.io.File;
import java.io.IOException;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;



public class HttpRequests {
	
	
	public void postFile() throws UnirestException {
		
		HttpResponse<JsonNode> jsonResponse = Unirest.post("https://slack.com/api/files.upload")
			  .header("accept", "application/json")
			  .header("Authorization", "Bearer xoxs-568837673152-571019995094-569543257508-3bea45dbbc709bc92f5197ab6c416bc7cd30445db72323a9da28ba21e2b7834a")
			  .field("channels", "CGTLKU1DH")
			  .field("file", new File("C:\\Users\\galif\\eclipse-workspace\\RedLionAutomation\\ScreenShots\\RD_screen.png"))
			  .asJson();
	
}
}
