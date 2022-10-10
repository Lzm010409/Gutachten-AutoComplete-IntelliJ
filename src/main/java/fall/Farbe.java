package fall;

public enum Farbe {
    UNI("uni"), MET("met"), PERL("perl"), FOLIE("folie");

    String farbe;

    Farbe(String farbe) {
        this.farbe = farbe;

    }

    /**
     * @return the farbe
     */
    public String getFarbe() {
        return farbe;
    }

    /**
     * @param farbe the farbe to set
     */
    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }
}
