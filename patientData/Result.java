package java11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class Result {

    public static List<Integer> getRecordsByAgeGroup(int ageStart, int ageEnd, int bpDiff) throws IOException, InterruptedException {
        /*
        parameters : 0,100 incl

        //return sorted array or list
        or return list [-1]

        condition set 1:
        a. ageStart , userAge, ageEnd
        b. bpDia - bpSys > bpDiff

        condition set 2:
        a. bpDia - bpSys < bpDiff

        criteria 3:
        bpdiff < bpd - bps

        return an array of IDs or records
        */

        var userDataEndpoint = "https://jsonmock.hackerrank.com/api/medical_records";

        HttpClient restClient = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(userDataEndpoint))
                .GET()
                .version(HttpClient.Version.HTTP_2)
                .build();

        HttpResponse userData = restClient.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(userData.body());

        ObjectMapper
return  null;
    }

    public record UserDataRecord(int id,
long                                         timestamp,
Vitals vitals,
String                                         userDob)

    public record Vitals(short bloodPressureDiastole,
            short bloodPressureSystole)

    public static void main(String[] args) throws IOException, InterruptedException {
        getRecordsByAgeGroup(28,30,63);
    }

}
