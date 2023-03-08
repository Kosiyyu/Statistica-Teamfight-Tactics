package statisticatft.statisticatft;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RiotAPIConfiguration {

    @Value("${riot.api.token}")
    private String token;

    @Value("${riot.api.header}")
    private String header;

    //"Origin": "https://developer.riotgames.com

    public ResponseEntity<String> basicRequest(String url, HttpMethod method){
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders httpHeaders0 = new HttpHeaders();
        httpHeaders0.set("Accept", "application/json");

        HttpHeaders httpHeaders1 = new HttpHeaders();
        httpHeaders1.set("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/110.0.0.0 Safari/537.36");


        HttpHeaders httpHeaders2 = new HttpHeaders();
        httpHeaders2.set("Accept-Language", "en-GB,en;q=0.9,pl-PL;q=0.8,pl;q=0.7,en-US;q=0.6");


        HttpHeaders httpHeaders3 = new HttpHeaders();
        httpHeaders3.set("Accept-Charset", "application/x-www-form-urlencoded; charset=UTF-8");

        HttpHeaders httpHeaders4 = new HttpHeaders();
        httpHeaders4.set("Origin", "https://developer.riotgames.com");

        HttpHeaders httpHeaders5 = new HttpHeaders();
        httpHeaders5.set(header, token);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.addAll(httpHeaders0);
        httpHeaders.addAll(httpHeaders1);
        httpHeaders.addAll(httpHeaders2);
        httpHeaders.addAll(httpHeaders3);
        httpHeaders.addAll(httpHeaders4);
        httpHeaders.addAll(httpHeaders5);
        System.out.println(httpHeaders);
        HttpEntity<String> httpEntity = new HttpEntity(httpHeaders);
        return restTemplate.exchange(url, method, httpEntity, String.class);
    }


}
