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
public class HttpApiWithNewHttpClient {
	public static void main(String[] args) throws IOException, InterruptedException {
		// 1. GET request-response flow - START

		// java.nio.file.Path#of(string) method to convert a string to a file path
		var localFilePath = "httpClientLogs2024.txt";
		File file = Path.of(localFilePath).toFile();
		if(!file.exists()) file.createNewFile();

		var getEndpoint = "https://postman-echo.com/get?uname=name&password=pass";

		// class java.net.http.HttpRequest
		HttpRequest req = HttpRequest.newBuilder()
							.uri(URI.create(getEndpoint))
							.GET()
							.version(Version.HTTP_2)
							.build();
		// class java.net.http.HttpClient
		HttpClient client = HttpClient.newBuilder()
								.build();

		// interface java.net.http.HttpResponse
		HttpResponse<String> response = client.send(req,BodyHandlers.ofString());
		System.out.println(response.statusCode());
		System.out.println(response.body());
		Files.writeString(Path.of(localFilePath)
				,response.statusCode() + "\n" + response.body()
				, StandardOpenOption.APPEND);
		// 1. GET request-response flow - DONE

		// 2. POST request-response flow - START
		var postEndpoint = "http://dummy.restapiexample.com/api/v1/create";

		// "before Java 15" style
		//String inputJson = "{ \"name\":\"rr\", \"salary\":\"105000\", \"age\":\"30\" }";

		// "Java 15 and later" style
		String inputJson = """
{ "name":"rr",
"salary":"105000",
 "age":"30"
 }
""";

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
		// 2. POST request-response flow - DONE

		// 3. PUT request-response flow - START
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
		// java.nio.file.Files.writeString() method is available since Java 11
		Files.writeString(Path.of(localFilePath),"\n"+response.statusCode() + "\n" + response.body(), StandardOpenOption.APPEND);
		// 3. PUT request-response flow - DONE
	}
}
