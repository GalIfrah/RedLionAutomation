package ProjectUtils;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.apache.http.entity.mime.content.FileBody;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;



public class SlackService {
	
	
	public void send_message(String content) throws UnirestException {

		try {
			
			HttpResponse<String> response = Unirest.post("https://slack.com/api/chat.postMessage")
					
					  .header("accept", "application/json")
					  .header("Authorization", "Bearer xoxs-568837673152-571019995094-574034181318-92322004fb6f31844ea52c046d36e53a49b281753e5bac4f7e4ff64b751943d6")
					  .field("channel", "CGTLKU1DH")
					  .field("text", content)
					  .asString();
		
		
		} catch (UnirestException e) {
			
		
			System.out.println(e.getMessage());
		
		}
			
	}
	

	public void uploadImage(String image_path) throws UnirestException {

		try {
		
			HttpResponse<JsonNode> jsonResponse = Unirest.post("https://slack.com/api/files.upload")

					  .header("accept", "application/json")
					  .header("Authorization", "Bearer xoxs-568837673152-571019995094-574034181318-92322004fb6f31844ea52c046d36e53a49b281753e5bac4f7e4ff64b751943d6")
					  .field("channels", "CGTLKU1DH")
					  .field("file", new File(image_path))
					  .asJson();
		
			
		} catch (UnirestException e) {
		
		
			System.out.println(e.getMessage());
	
		}
		
	}
	
}
