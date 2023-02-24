package statisticatft.statisticatft;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import statisticatft.statisticatft.notyetentity.Summoner;

@AllArgsConstructor
@RestController
@RequestMapping("v1/test")
public class TestController {

    private final RiotAPIService riotAPIService;

    @GetMapping
    public String test(){
        return riotAPIService.getChallengerPlayers(Region.EUN1);
    }

    @GetMapping("/search/{region}/{summonerName}")
    public ResponseEntity<Summoner> getSummonerByName(@PathVariable Region region, @PathVariable String summonerName) throws JsonProcessingException {
        String jsonBody = riotAPIService.searchSummonerBySummonerName(Region.EUN1, summonerName);
        ObjectMapper mapper = new ObjectMapper();
        Summoner summoner = mapper.readValue(jsonBody, Summoner.class);
        //do something with summoner object
        return new ResponseEntity<>(summoner, HttpStatus.OK);
    }
}
