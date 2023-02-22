package statisticatft.statisticatft;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("v1/test")
public class TestController {

    private final RiotAPIService riotAPIService;

    @GetMapping
    public String test(){
        return riotAPIService.getBrazilianChallengerPlayers();
    }
}
