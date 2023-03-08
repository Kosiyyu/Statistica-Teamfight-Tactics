package statisticatft.statisticatft.tftsummonerv1;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SummonerService {
    private final SummonerRepository summonerRepository;

    public Summoner saveSummoner(Summoner summoner) {
        return summonerRepository.save(summoner);
    }
}
