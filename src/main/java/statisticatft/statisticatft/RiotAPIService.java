package statisticatft.statisticatft;

import lombok.Data;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

@Service
public class RiotAPIService {

    private RiotAPIConfiguration riotAPIConfiguration;

    public RiotAPIService(RiotAPIConfiguration riotAPIConfiguration) {
        this.riotAPIConfiguration = riotAPIConfiguration;
    }

    public String getChallengerPlayers(Region region) {
        //https://" + region + ".api.riotgames.com/tft/status/v1/platform-data
        String url = "https://" + region + ".api.riotgames.com/tft/status/v1/platform-data";
        return riotAPIConfiguration.basicRequest(url, HttpMethod.GET).getBody();
    }

    public String searchSummonerBySummonerName(Region region, String summonerName) {
        String url = "https://" + region + ".api.riotgames.com/tft/summoner/v1/summoners/by-name/" + summonerName;
        return riotAPIConfiguration.basicRequest(url, HttpMethod.GET).getBody();
    }

}
