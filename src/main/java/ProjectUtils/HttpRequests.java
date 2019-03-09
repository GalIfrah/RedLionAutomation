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
			  .header("Authorization", "Bearer xoxp-568837673152-571019995094-571184949664-6f7ae8bb3870c0c0dbfe1437912fdcbe")
			  .field("channels", "CGTLKU1DH")
			  .field("file", new File("C:\\Users\\galif\\eclipse-workspace\\RedLionAutomation\\ScreenShots\\RD_screen.png"))
			  .asJson();
	
}
}
