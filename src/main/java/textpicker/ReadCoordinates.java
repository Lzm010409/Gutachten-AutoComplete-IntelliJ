package textpicker;

public enum ReadCoordinates {
    AS(55, 650, 200, 32), TEL(55, 638, 100, 15), MAIL(187, 635, 200, 15), ADATUM(428, 782, 260, 23),
    SDATUMORT(428, 759, 260, 23), GNUMMER(428, 736, 260, 23), SNUMMER(428, 713, 260, 23),
    KENNZEICHENUG(428, 690, 260, 23), BORT(100, 582, 270, 35), BDATUM(375, 582, 270, 35), BUHRZEIT(375, 569, 270, 13),
    BANWESEND(375, 549, 270, 13), AP(100, 548, 200, 15), KENNZEICHEN(110, 531, 120, 13), FART(110, 514, 120, 13),
    FHERSTELLER(110, 497, 120, 13), FTYP(110, 480, 120, 13), FHSN(110, 463, 120, 13), FPAPIERE(110, 446, 120, 13),
    FIN(110, 429, 120, 13), FERSTZUL(110, 412, 120, 13), FLETZTZUL(110, 395, 120, 13), FLEISTUNG(110, 378, 120, 13),
    FHUBRAUM(110, 361, 120, 13), FHU(110, 361, 120, 13), FSP(110, 361, 120, 13), FKILOMETER(375, 518, 120, 25),
    FFARBE(375, 503, 150, 13), FVBEREIFUNG(375, 486, 150, 13), FHBEREIFUNG(375, 469, 150, 13),
    FREIFENHERSTELLER(375, 452, 150, 13), FPROFILTIEFE(375, 435, 150, 13), FANTRIEBSART(375, 423, 150, 13),
    FUMWELTPLAKETTE(375, 399, 150, 13), FKRAFTSTOFF(375, 399, 150, 13), FSCHADSTOFFKLASSE(375, 382, 150, 13),
    FALLGZUSTAND(375, 368, 150, 13), FKARRZUSTAND(375, 353, 150, 13), FLACKZUSTAND(375, 339, 150, 13),
    FBZUSTAND(375, 321, 150, 13), FAUSSTATTUNG(110, 250, 185, 60), NBEHVORSCHADEN(110, 182, 185, 75),
    NOTIZEN(110, 30, 530, 120), SCHADENHERGANG(375, 266, 185, 45), PLAUSIBILITÄT(375, 251, 185, 15),
    BEHVORSCHADEN(375, 196, 185, 45), SCHICHTDICKENMESSUNG(375, 166, 80, 15), DEFAULT(0, 0, 595, 841);

    float first, second, third, fourth;

    ReadCoordinates(float i, float j, float k, float l) {
        // TODO Auto-generated constructor stub
        this.first = i;
        this.second = j;
        this.third = k;
        this.fourth = l;


    }

    /**
     * @return the first
     */
    public float getFirst() {
        return first;
    }

    /**
     * @param first the first to set
     */
    public void setFirst(float first) {
        this.first = first;
    }

    /**
     * @return the second
     */
    public float getSecond() {
        return second;
    }

    /**
     * @param second the second to set
     */
    public void setSecond(float second) {
        this.second = second;
    }

    /**
     * @return the third
     */
    public float getThird() {
        return third;
    }

    /**
     * @param third the third to set
     */
    public void setThird(float third) {
        this.third = third;
    }

    /**
     * @return the fourth
     */
    public float getFourth() {
        return fourth;
    }

    /**
     * @param fourth the fourth to set
     */
    public void setFourth(float fourth) {
        this.fourth = fourth;
    }


}
