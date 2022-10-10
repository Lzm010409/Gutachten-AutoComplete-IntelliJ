package fall;

import textpicker.ReadCoordinates;

public class Kunde extends User{
    private float firstCoordinate = ReadCoordinates.AS.getFirst();
    private float secondCoordinate = ReadCoordinates.AS.getSecond();
    private float thirdCoordinate = ReadCoordinates.AS.getThird();
    private float fourthCoordinate = ReadCoordinates.AS.getFourth();

    public Kunde() {

    }


    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * @return the plz
     */
    public String getPlz() {
        return plz;
    }

    /**
     * @param plz the plz to set
     */
    public void setPlz(String plz) {
        this.plz = plz;
    }

    /**
     * @return the stadt
     */
    public String getStadt() {
        return stadt;
    }

    /**
     * @param stadt the stadt to set
     */
    public void setStadt(String stadt) {
        this.stadt = stadt;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return the tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

}
