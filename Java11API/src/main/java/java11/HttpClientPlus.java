package java11;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
/**
 * 
 * @author rishiraj
 * to demonstrate HttpClient for GET, POST and PUT request/response handling as in JDK 11
 */
public class HttpClientPlus {
	public static void main(String[] args) throws IOException, InterruptedException {
		var getEndpoint = "https://postman-echo.com/get?uname=name&password=pass";
		var localFilePath = "httpClientLogs2024.txt";
		File file = Path.of(localFilePath).toFile();
		if(!file.exists()) file.createNewFile();
		
		HttpRequest req = HttpRequest.newBuilder()
							.uri(URI.create(getEndpoint))
							.GET()
							.version(Version.HTTP_2)
							.build();
		
	HttpClient client = HttpClient.newBuilder()
							.build();
	
	HttpResponse<String> response = client.send(req,BodyHandlers.ofString());
	System.out.println(response.statusCode());
	System.out.println(response.body());
	Files.writeString(Path.of(localFilePath),response.statusCode() + "\n" + response.body(), StandardOpenOption.APPEND);
	
	
	var postEndpoint = "http://dummy.restapiexample.com/api/v1/create";
	 
	 String inputJson = "{ \"name\":\"rr\", \"salary\":\"105000\", \"age\":\"30\" }";
	 
					req = HttpRequest.newBuilder()
							.uri(URI.create(postEndpoint))
							.header("Content-Type", "application/json")
							.POST(HttpRequest.BodyPublishers.ofString(inputJson))		         
							.version(Version.HTTP_2)
							.build();
					
	response = client.send(req,BodyHandlers.ofString());
	System.out.println(response.statusCode());
	System.out.println(response.body());
	Files.writeString(Path.of(localFilePath),"\n"+response.statusCode() + "\n" + response.body(), StandardOpenOption.APPEND);
	
	
		var putEndpoint = "https://dummy.restapiexample.com/public/api/v1/update/21";
	 
	  inputJson = "{ \"name\":\"rishi\", \"salary\":\"150000\", \"age\":\"32\" }";
	 
					req = HttpRequest.newBuilder()
							.uri(URI.create(putEndpoint ))
							.header("Content-Type", "application/json")
							.PUT(HttpRequest.BodyPublishers.ofString(inputJson))		         
							.version(Version.HTTP_2)
							.build();
					
	response = client.send(req,BodyHandlers.ofString());
	System.out.println(response.statusCode());
	System.out.println(response.body());
	Files.writeString(Path.of(localFilePath),"\n"+response.statusCode() + "\n" + response.body(), StandardOpenOption.APPEND);
	
		
	}
}
