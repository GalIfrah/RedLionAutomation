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
			  .header("Authorization", "Bearer xoxs-568837673152-571019995094-571933464530-97b95a9552e3113afd6032e1209e53a755e7b1e64e937ed662b8f35a4969f884")
			  .field("channels", "CGTLKU1DH")
			  .field("file", new File("C:\\Users\\galif\\eclipse-workspace\\RedLionAutomation\\ScreenShots\\RD_screen.png"))
			  .asJson();
	
}
}
