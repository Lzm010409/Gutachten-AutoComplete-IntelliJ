package fall;

import java.util.ArrayList;
import java.util.List;

public class Fahrzeug {
        private String kennzeichen;
        private String art;
        private String hersteller;
        private String typ;
        private String hsn;
        private String fin;
        private String ersteZulassung;
        private String letzteZulassung;
        private String leistung;
        private String hubraum;
        private String hu;
        private String sp;
        private String kilometer;
        private String farbe;
        private String vBereifung;
        private String hBereifung;
        private String reifenHersteller;
        private String reifenProfiltiefe;
        private String antriebsart;
        private String umweltplakette;
        private String krafstoff;
        private String schadstoffklasse;
        private String allgemeinZustand;
        private String karosserieZustand;
        private String lackZustand;
        private String ausstattung;
        private List<String> bVorschaeden = new ArrayList<String>();
        private List<String> nbVorschaeden = new ArrayList<String>();
        private List<String> setArray = new ArrayList<String>();

        public Fahrzeug() {
            setArray.add(kennzeichen);
            setArray.add(art);
            setArray.add(hersteller);
            setArray.add(typ);
            setArray.add(hsn);
            setArray.add(fin);
            setArray.add(ersteZulassung);
            setArray.add(letzteZulassung);
            setArray.add(leistung);
            setArray.add(hubraum);
            setArray.add(hu);
            setArray.add(sp);
            setArray.add(kilometer);
            setArray.add(farbe);
            setArray.add(vBereifung);
            setArray.add(hBereifung);
            setArray.add(reifenHersteller);
            setArray.add(reifenProfiltiefe);
            setArray.add(antriebsart);
            setArray.add(umweltplakette);
            setArray.add(krafstoff);
            setArray.add(schadstoffklasse);
            setArray.add(allgemeinZustand);
            setArray.add(karosserieZustand);
            setArray.add(lackZustand);

        }

        public void addVorschaeden(String schaden, List<String> list) {
            list.add(schaden);
        }

        /**
         * @return the bVorschaeden
         */
        public List<String> getbVorschaeden() {
            return bVorschaeden;
        }

        /**
         * @param bVorschaeden the bVorschaeden to set
         */
        public void setbVorschaeden(List<String> bVorschaeden) {
            this.bVorschaeden = bVorschaeden;
        }

        /**
         * @return the nbVorschaeden
         */
        public List<String> getNbVorschaeden() {
            return nbVorschaeden;
        }

        /**
         * @param nbVorschaeden the nbVorschaeden to set
         */
        public void setNbVorschaeden(List<String> nbVorschaeden) {
            this.nbVorschaeden = nbVorschaeden;
        }

        public String universalGetter(int i) {
            return setArray.get(i);
        }

        public void universalSetter(String input, int i) {
            setArray.set(i, input);
        }

        /**
         * @return the kennzeichen
         */
        public String getKennzeichen() {
            return kennzeichen;
        }

        /**
         * @param kennzeichen the kennzeichen to set
         */
        public void setKennzeichen(String kennzeichen) {
            this.kennzeichen = kennzeichen;
        }

        /**
         * @return the art
         */
        public String getArt() {
            return art;
        }

        /**
         * @param art the art to set
         */
        public void setArt(String art) {
            this.art = art;
        }

        /**
         * @return the hersteller
         */
        public String getHersteller() {
            return hersteller;
        }

        /**
         * @param hersteller the hersteller to set
         */
        public void setHersteller(String hersteller) {
            this.hersteller = hersteller;
        }

        /**
         * @return the typ
         */
        public String getTyp() {
            return typ;
        }

        /**
         * @param typ the typ to set
         */
        public void setTyp(String typ) {
            this.typ = typ;
        }

        /**
         * @return the hsn
         */
        public String getHsn() {
            return hsn;
        }

        /**
         * @param hsn the hsn to set
         */
        public void setHsn(String hsn) {
            this.hsn = hsn;
        }

        /**
         * @return the fin
         */
        public String getFin() {
            return fin;
        }

        /**
         * @param fin the fin to set
         */
        public void setFin(String fin) {
            this.fin = fin;
        }

        /**
         * @return the ersteZulassung
         */
        public String getErsteZulassung() {
            return ersteZulassung;
        }

        /**
         * @param ersteZulassung the ersteZulassung to set
         */
        public void setErsteZulassung(String ersteZulassung) {
            this.ersteZulassung = ersteZulassung;
        }

        /**
         * @return the letzteZulassung
         */
        public String getLetzteZulassung() {
            return letzteZulassung;
        }

        /**
         * @param letzteZulassung the letzteZulassung to set
         */
        public void setLetzteZulassung(String letzteZulassung) {
            this.letzteZulassung = letzteZulassung;
        }

        /**
         * @return the leistung
         */
        public String getLeistung() {
            return leistung;
        }

        /**
         * @param leistung the leistung to set
         */
        public void setLeistung(String leistung) {
            this.leistung = leistung;
        }

        /**
         * @return the hubraum
         */
        public String getHubraum() {
            return hubraum;
        }

        /**
         * @param hubraum the hubraum to set
         */
        public void setHubraum(String hubraum) {
            this.hubraum = hubraum;
        }

        /**
         * @return the hu
         */
        public String getHu() {
            return hu;
        }

        /**
         * @param hu the hu to set
         */
        public void setHu(String hu) {
            this.hu = hu;
        }

        /**
         * @return the sp
         */
        public String getSp() {
            return sp;
        }

        /**
         * @param sp the sp to set
         */
        public void setSp(String sp) {
            this.sp = sp;
        }

        /**
         * @return the kilometer
         */
        public String getKilometer() {
            return kilometer;
        }

        /**
         * @param kilometer the kilometer to set
         */
        public void setKilometer(String kilometer) {
            this.kilometer = kilometer;
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

        /**
         * @return the vBereifung
         */
        public String getvBereifung() {
            return vBereifung;
        }

        /**
         * @param vBereifung the vBereifung to set
         */
        public void setvBereifung(String vBereifung) {
            this.vBereifung = vBereifung;
        }

        /**
         * @return the hBereifung
         */
        public String gethBereifung() {
            return hBereifung;
        }

        /**
         * @param hBereifung the hBereifung to set
         */
        public void sethBereifung(String hBereifung) {
            this.hBereifung = hBereifung;
        }

        /**
         * @return the reifenHersteller
         */
        public String getReifenHersteller() {
            return reifenHersteller;
        }

        /**
         * @param reifenHersteller the reifenHersteller to set
         */
        public void setReifenHersteller(String reifenHersteller) {
            this.reifenHersteller = reifenHersteller;
        }

        /**
         * @return the reifenProfiltiefe
         */
        public String getReifenProfiltiefe() {
            return reifenProfiltiefe;
        }

        /**
         * @param reifenProfiltiefe the reifenProfiltiefe to set
         */
        public void setReifenProfiltiefe(String reifenProfiltiefe) {
            this.reifenProfiltiefe = reifenProfiltiefe;
        }

        /**
         * @return the antriebsart
         */
        public String getAntriebsart() {
            return antriebsart;
        }

        /**
         * @param antriebsart the antriebsart to set
         */
        public void setAntriebsart(String antriebsart) {
            this.antriebsart = antriebsart;
        }

        /**
         * @return the umweltplakette
         */
        public String getUmweltplakette() {
            return umweltplakette;
        }

        /**
         * @param umweltplakette the umweltplakette to set
         */
        public void setUmweltplakette(String umweltplakette) {
            this.umweltplakette = umweltplakette;
        }

        /**
         * @return the krafstoff
         */
        public String getKrafstoff() {
            return krafstoff;
        }

        /**
         * @param krafstoff the krafstoff to set
         */
        public void setKrafstoff(String krafstoff) {
            this.krafstoff = krafstoff;
        }

        /**
         * @return the schadstoffklasse
         */
        public String getSchadstoffklasse() {
            return schadstoffklasse;
        }

        /**
         * @param schadstoffklasse the schadstoffklasse to set
         */
        public void setSchadstoffklasse(String schadstoffklasse) {
            this.schadstoffklasse = schadstoffklasse;
        }

        /**
         * @return the allgemeinZustand
         */
        public String getAllgemeinZustand() {
            return allgemeinZustand;
        }

        /**
         * @param allgemeinZustand the allgemeinZustand to set
         */
        public void setAllgemeinZustand(String allgemeinZustand) {
            this.allgemeinZustand = allgemeinZustand;
        }

        /**
         * @return the karosserieZustand
         */
        public String getKarosserieZustand() {
            return karosserieZustand;
        }

        /**
         * @param karosserieZustand the karosserieZustand to set
         */
        public void setKarosserieZustand(String karosserieZustand) {
            this.karosserieZustand = karosserieZustand;
        }

        /**
         * @return the lackZustand
         */
        public String getLackZustand() {
            return lackZustand;
        }

        /**
         * @param lackZustand the lackZustand to set
         */
        public void setLackZustand(String lackZustand) {
            this.lackZustand = lackZustand;
        }

        /**
         * @return the ausstattung
         */
        public String getAusstattung() {
            return ausstattung;
        }

        /**
         * @param ausstattung the ausstattung to set
         */
        public void setAusstattung(String ausstattung) {
            this.ausstattung = ausstattung;
        }

    }


