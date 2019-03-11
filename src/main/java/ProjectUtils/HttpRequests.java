package ProjectUtils;

import java.io.File;
import java.io.IOException;

import org.apache.http.entity.mime.content.FileBody;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;



public class HttpRequests {
	
	
	public void postFile() throws UnirestException {
//		System.out.println(System.getProperty("slack"));
		HttpResponse<JsonNode> jsonResponse = Unirest.post("https://slack.com/api/files.upload")
			  .header("accept", "application/json")
			  .header("Authorization", "Bearer xoxs-568837673152-571019995094-573492971862-552c650ecff40fa211275232d881b466224f09cf7e0933fe207dd8decb75f5c2")
			  .field("channels", "CGTLKU1DH")
			  .field("file", new File("C:\\Program Files (x86)\\Jenkins\\workspace\\RedLionProduction\\ScreenShots\\GAL.png"))
			  .asJson();
	
	}
}
