package statisticatft.statisticatft;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

@Service
public class RiotAPIService {

    private final RiotAPIConfiguration riotAPIConfiguration;

    public RiotAPIService(RiotAPIConfiguration riotAPIConfiguration) {
        this.riotAPIConfiguration = riotAPIConfiguration;
    }

    public String getBrazilianChallengerPlayers() {
        String url = "https://br1.api.riotgames.com/tft/league/v1/challenger";
        return riotAPIConfiguration.basicRequest(url, HttpMethod.GET).getBody();
    }
}
