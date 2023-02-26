package statisticatft.statisticatft.tftmatchv1;

import lombok.Data;

import java.util.List;

@Data
public class Unit {
    private List<Integer> items;		//A list of the unit's items. Please refer to the Teamfight Tactics documentation for item ids.
    private String characterId;         //This field was introduced in patch 9.22 with data_version 2.
    private String chosen;	            //If a unit is chosen as part of the Fates set mechanic, the chosen trait will be indicated by this field. Otherwise this field is excluded from the response.
    private String name;	            //Unit name. This field is often left blank.
    private int rarity;	                //Unit rarity. This doesn't equate to the unit cost.
    private int tier;	                //Unit tier.
}
