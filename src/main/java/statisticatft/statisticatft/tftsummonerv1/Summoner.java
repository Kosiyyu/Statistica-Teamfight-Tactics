package statisticatft.statisticatft.tftsummonerv1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Summoner {
    private String accountId;       //Encrypted account ID. Max length 56 characters.
    private int profileIconId;      //ID of the summoner icon associated with the summoner.
    private long revisionDate;      //Date summoner was last modified specified as epoch milliseconds. The following events will update this timestamp: profile icon change, playing the tutorial or advanced tutorial, finishing a game, summoner name change
    private String name;            //Summoner name.
    private String id;              //Encrypted summoner ID. Max length 63 characters.
    private String puuid;           //Encrypted PUUID. Exact length of 78 characters.
    private long summonerLevel;     //Summoner level associated with the summoner.
}
