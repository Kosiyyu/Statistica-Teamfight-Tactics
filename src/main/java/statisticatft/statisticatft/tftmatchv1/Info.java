package statisticatft.statisticatft.tftmatchv1;

import java.util.List;

public class Info {
    private long gameDateTime;		        //Unix timestamp.
    private float gameLength;		        //Game length in seconds.
    private String gameVariation;	        //Game variation key. Game variations documented in TFT static data.
    private String gameVersion;	            //Game client version.
    private List<Participant> participants;	//A list of participants.
    private int queueId;		            //Please refer to the League of Legends documentation.
    private int tftSetNumber;		        //Teamfight Tactics set number.

    //feched example

}
