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
			  .header("Authorization", "Bearer xoxs-568837673152-571019995094-571926761299-20fe8de9708febc126b55420af6ea2f89b5056f743d2398f3c52f1ed44b5b813")
			  .field("channels", "CGTLKU1DH")
			  .field("file", new File("C:\\Users\\galif\\eclipse-workspace\\RedLionAutomation\\ScreenShots\\RD_screen.png"))
			  .asJson();
	
}
}
