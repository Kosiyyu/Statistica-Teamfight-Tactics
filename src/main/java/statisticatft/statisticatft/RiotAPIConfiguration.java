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

    public ResponseEntity<String> basicRequest(String url, HttpMethod method){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set(header, token);
        HttpEntity<String> httpEntity = new HttpEntity(httpHeaders);
        return restTemplate.exchange(url, method, httpEntity, String.class);
    }


}
