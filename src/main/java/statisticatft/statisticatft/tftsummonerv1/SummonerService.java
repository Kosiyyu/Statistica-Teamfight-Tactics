package statisticatft.statisticatft.tftsummonerv1;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class SummonerService {

    @Autowired  //injection with lombok all args constructor doesn't work todo: fix
    private SummonerRepository summonerRepository;

    public Summoner saveSummoner(Summoner summoner) {
        return summonerRepository.save(summoner);
    }
}
