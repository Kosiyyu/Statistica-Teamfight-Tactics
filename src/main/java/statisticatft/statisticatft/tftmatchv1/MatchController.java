package statisticatft.statisticatft.tftmatchv1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import statisticatft.statisticatft.RiotAPIService;
import statisticatft.statisticatft.tftsummonerv1.Region;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/")
public class MatchController {

    private final RiotAPIService riotAPIService;

    @GetMapping("/{globalRegion}/getmatchbysummonerpuuid/{puuid}")
    public ResponseEntity<List<String>> getMatchBySummonerPuuid(@PathVariable GlobalRegion globalRegion, @PathVariable String puuid) throws JsonProcessingException {
        String jsonBody = riotAPIService.getMatchByPuuid(globalRegion, puuid);
        ObjectMapper mapper = new ObjectMapper();
        List<String> idList = mapper.readValue(jsonBody, List.class);
        //do something with summoner object
        return new ResponseEntity<>(idList, HttpStatus.OK);
    }

    @GetMapping("/{globalRegion}/getmatchbymatchid/{id}")
    public String getMatchByMatchId(@PathVariable GlobalRegion globalRegion, @PathVariable String id) throws JsonProcessingException {
        String jsonBody = riotAPIService.getMatchByPuuid(globalRegion, id);
        ObjectMapper mapper = new ObjectMapper();
        Match match = mapper.readValue(jsonBody, Match.class);//todo!!!
        return "test";
    }
}
