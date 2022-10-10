package fall;

public enum Kategorie {
    EINS(1), ZWEI(2), DREI(3), VIER(4), FÜNF(5);

    int kategorie;

    Kategorie(int kategorie) {
        this.kategorie = kategorie;
    }

    /**
     * @return the kategorie
     */
    public int getKategorie() {
        return kategorie;
    }

    /**
     * @param kategorie the kategorie to set
     */
    public void setKategorie(int kategorie) {
        this.kategorie = kategorie;
    }

}
