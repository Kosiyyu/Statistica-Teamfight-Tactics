package statisticatft.statisticatft.tftmatchv1;

public enum GlobalRegion {
    AMERICAS("americas"),//NA and SA
    ASIA("asia"),//KR and JP
    EUROPE("europe"),//EU and RU
    SEA("sea");//SEA and OCE?????????????????

    public String region;
    GlobalRegion(String region) {
        this.region = region;
    }

}
