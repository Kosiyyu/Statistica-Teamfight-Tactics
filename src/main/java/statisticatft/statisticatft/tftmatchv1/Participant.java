package statisticatft.statisticatft.tftmatchv1;

import java.util.List;

public class Participant {
    private Companion companion;//Participant's companion.
    private int gold_left;	            	//Gold left after participant was eliminated.
    private int last_round;	            	//The round the participant was eliminated in. Note: If the player was eliminated in stage 2-1 their last_round would be 5.
    private int level;		                //Participant Little Legend level. Note: This is not the number of active units.
    private int placement;		            //Participant placement upon elimination.
    private int players_eliminated;	    	//Number of players the participant eliminated.
    private float puuid;                    //Summoner PUUID.????????????
    private int time_eliminated;    		//The number of seconds before the participant was eliminated.
    private int total_damage_to_players;	//Damage the participant dealt to other players.
    private List<Trait> traits;             //A complete list of traits for the participant's active units.
    private List<Unit> units;               //A list of active units for the participant.
}
