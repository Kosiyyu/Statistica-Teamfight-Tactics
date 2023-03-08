package statisticatft.statisticatft.tftsummonerv1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import statisticatft.statisticatft.RiotAPIService;
import statisticatft.statisticatft.tftsummonerv1.Summoner;
import statisticatft.statisticatft.tftsummonerv1.Region;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/")
public class SummonerController {

    private final RiotAPIService riotAPIService;
    private SummonerService summonerService;

    @GetMapping("{region}/searchbysummonername/{summonerName}")
    public ResponseEntity<Summoner> getSummonerByName(@PathVariable Region region, @PathVariable String summonerName) throws JsonProcessingException {
        String jsonBody = riotAPIService.searchSummonerBySummonerName(region, summonerName);

        //map json string to Summoner object todo: validate json string or mapper??
        ObjectMapper mapper = new ObjectMapper();
        Summoner summoner = mapper.readValue(jsonBody, Summoner.class);

        //todo: check if summoner already exists in db
        //save to db
        summonerService.saveSummoner(summoner);

        return new ResponseEntity<>(summoner, HttpStatus.OK);
    }
}
