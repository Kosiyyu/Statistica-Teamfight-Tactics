package statisticatft.statisticatft;

public enum Region {

    BR1("br1"),//Brazil
    EUN1("eun1"),//Europe Nordic & East
    EUW1("euw1"),//Europe West
    JP1("jp1"),//Japan
    KR("kr"),//Korea
    LA1("la1"),//Latin America North
    LA2("la2"),//Latin America North
    NA1("na1"),//North America
    OC1("oc1"),//Oceania
    PBE1("pbe1"),//Public Beta Environment
    PH2("ph2"),//Philippines
    RU("ru"),//Russia
    SG2("sg2"),//Singapore, Malaysia, & Indonesia
    TH2("th2"),//Thailand
    TR1("tr1"),//Turkey
    TW2("tw2"),//Taiwan, Hong Kong, and Macao
    VN2("vn2");//Vietnam

    public final String value;

    private Region(String value) {
        this.value = value;
    }

}
