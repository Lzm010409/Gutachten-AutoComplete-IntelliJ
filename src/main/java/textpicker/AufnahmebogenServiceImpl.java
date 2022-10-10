package textpicker;

import fall.Fahrzeug;
import fall.Fall;
import fall.Kunde;

public class AufnahmebogenServiceImpl extends UniversalDateiServiceImpl {
    ReadCoordinates[] readCoordinatesArray;
    private int startCoordinate;
    private int stopCoordinate;

    public AufnahmebogenServiceImpl() {
        // this.fileToRead = fileChooser.chooseFile();
        // this.filePath = this.fileToRead.getAbsolutePath();

    }

    public void coordinatesToArray() {
        readCoordinatesArray = new ReadCoordinates[48];
        readCoordinatesArray[0] = ReadCoordinates.AS;
        readCoordinatesArray[1] = ReadCoordinates.TEL;
        readCoordinatesArray[2] = ReadCoordinates.MAIL;
        readCoordinatesArray[3] = ReadCoordinates.ADATUM;
        readCoordinatesArray[4] = ReadCoordinates.SDATUMORT;
        readCoordinatesArray[5] = ReadCoordinates.GNUMMER;
        readCoordinatesArray[6] = ReadCoordinates.SNUMMER;
        readCoordinatesArray[7] = ReadCoordinates.KENNZEICHENUG;
        readCoordinatesArray[8] = ReadCoordinates.BORT;
        readCoordinatesArray[9] = ReadCoordinates.BDATUM;
        readCoordinatesArray[10] = ReadCoordinates.BUHRZEIT;
        readCoordinatesArray[11] = ReadCoordinates.BANWESEND;
        readCoordinatesArray[12] = ReadCoordinates.AP;
        readCoordinatesArray[13] = ReadCoordinates.KENNZEICHEN;
        readCoordinatesArray[14] = ReadCoordinates.FART;
        readCoordinatesArray[15] = ReadCoordinates.FHERSTELLER;
        readCoordinatesArray[16] = ReadCoordinates.FTYP;
        readCoordinatesArray[17] = ReadCoordinates.FHSN;
        readCoordinatesArray[18] = ReadCoordinates.FPAPIERE;
        readCoordinatesArray[19] = ReadCoordinates.FIN;
        readCoordinatesArray[20] = ReadCoordinates.FERSTZUL;
        readCoordinatesArray[20] = ReadCoordinates.FLETZTZUL;
        readCoordinatesArray[21] = ReadCoordinates.FLEISTUNG;
        readCoordinatesArray[22] = ReadCoordinates.FHUBRAUM;
        readCoordinatesArray[23] = ReadCoordinates.FHU;
        readCoordinatesArray[24] = ReadCoordinates.FSP;
        readCoordinatesArray[25] = ReadCoordinates.FKILOMETER;
        readCoordinatesArray[26] = ReadCoordinates.FFARBE;
        readCoordinatesArray[27] = ReadCoordinates.FVBEREIFUNG;
        readCoordinatesArray[28] = ReadCoordinates.FHBEREIFUNG;
        readCoordinatesArray[29] = ReadCoordinates.FREIFENHERSTELLER;
        readCoordinatesArray[30] = ReadCoordinates.FPROFILTIEFE;
        readCoordinatesArray[31] = ReadCoordinates.FANTRIEBSART;
        readCoordinatesArray[32] = ReadCoordinates.FUMWELTPLAKETTE;
        readCoordinatesArray[33] = ReadCoordinates.FKRAFTSTOFF;
        readCoordinatesArray[34] = ReadCoordinates.FSCHADSTOFFKLASSE;
        readCoordinatesArray[35] = ReadCoordinates.FALLGZUSTAND;
        readCoordinatesArray[36] = ReadCoordinates.FKARRZUSTAND;
        readCoordinatesArray[37] = ReadCoordinates.FLACKZUSTAND;
        readCoordinatesArray[38] = ReadCoordinates.FBZUSTAND;
        readCoordinatesArray[39] = ReadCoordinates.FAUSSTATTUNG;
        readCoordinatesArray[40] = ReadCoordinates.NBEHVORSCHADEN;
        readCoordinatesArray[42] = ReadCoordinates.BEHVORSCHADEN;
        readCoordinatesArray[43] = ReadCoordinates.SCHADENHERGANG;
        readCoordinatesArray[44] = ReadCoordinates.PLAUSIBILITÄT;
        readCoordinatesArray[45] = ReadCoordinates.NOTIZEN;
        readCoordinatesArray[46] = ReadCoordinates.SCHICHTDICKENMESSUNG;
        readCoordinatesArray[47] = ReadCoordinates.DEFAULT;

    }

    public void writeKundenData(Kunde kunde) throws Exception {
        try {
            boolean anrede = false;
            boolean name = false;
            boolean adresse = false;
            boolean plz = false;
            boolean stadt = false;
            readFile(ReadCoordinates.AS);

            String[] asArr = textFromCoordinates.split("\\r?\\n");
            String[] nameArr = asArr[0].split("");
            String[] plzStadtArr = asArr[2].split("");
            int index = 1;
            int tempindex = 0;
            int plzLaenge = 5;
            String tempName = "";
            String tempPlz = "";
            String tempStadt = "";

            /*
             * for (int i = 0; i < asArr.length; i++) { System.out.println(asArr[i]); }
             */

            if (asArr[0].contains("Hr.")) {
                anrede = true;
                kunde.setAnrede("Herr");
                tempindex = "Hr.".length();
                for (int i = 0; i < tempindex; i++) {
                    nameArr[i] = "";
                }
                for (int i = tempindex; i < nameArr.length; i++) {

                    tempName += nameArr[i];

                }

            }
            if (asArr[0].contains("Fr.")) {
                anrede = true;
                kunde.setAnrede("Frau");
                tempindex = "Fr.".length();
                for (int i = 0; i < tempindex; i++) {
                    nameArr[i] = "";
                }
                for (int i = tempindex; i < nameArr.length; i++) {

                    tempName += nameArr[i];
                }

            }
            if (asArr[0].contains("Firma")) {
                anrede = true;
                kunde.setAnrede("Firma");
                tempindex = "Firma".length();
                for (int i = 0; i < tempindex; i++) {
                    nameArr[i] = "";
                }
                for (int i = tempindex; i < nameArr.length; i++) {

                    tempName += nameArr[i];

                }
            }

            for (int i = 0; i < plzLaenge; i++) {
                tempPlz += plzStadtArr[i];
                plzStadtArr[i] = "";
            }

            for (int i = plzLaenge; i < plzStadtArr.length; i++) {
                if (plzStadtArr[i].charAt(0) != ' ') {
                    tempStadt += plzStadtArr[i];
                }
            }

            kunde.setName(tempName);
            kunde.setAdresse(asArr[1]);
            kunde.setPlz(tempPlz);
            kunde.setStadt(tempStadt);

            System.out.println(kunde.getName());
            System.out.println(kunde.getAdresse());
            System.out.println(kunde.getPlz());
            System.out.println(kunde.getStadt());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writeKundenMail(Kunde kunde) throws Exception {
        readFile(ReadCoordinates.MAIL);
        kunde.setMail(this.textFromCoordinates);
        System.out.println(kunde.getMail());
    }

    public void writeKundenTel(Kunde kunde) throws Exception {
        readFile(ReadCoordinates.TEL);
        kunde.setTel(this.textFromCoordinates);
        System.out.println(kunde.getTel());
    }

    public void writeFahrzeugData(Fahrzeug fahrzeug) throws Exception {
        startCoordinate = 13;
        stopCoordinate = 42;
        String[] bvorschadenArr;
        String[] nbvorschadenArr;
        fahrzeug.setKennzeichen(readFileWithReturn(ReadCoordinates.KENNZEICHEN));
        fahrzeug.setArt(readFileWithReturn(ReadCoordinates.FART));
        fahrzeug.setHersteller(readFileWithReturn(ReadCoordinates.FHERSTELLER));
        fahrzeug.setTyp(readFileWithReturn(ReadCoordinates.FTYP));
        fahrzeug.setHsn(readFileWithReturn(ReadCoordinates.FHSN));
        fahrzeug.setFin(readFileWithReturn(ReadCoordinates.FIN));
        fahrzeug.setErsteZulassung(readFileWithReturn(ReadCoordinates.FERSTZUL));
        fahrzeug.setLetzteZulassung(readFileWithReturn(ReadCoordinates.FLETZTZUL));
        fahrzeug.setLeistung(readFileWithReturn(ReadCoordinates.FLEISTUNG));
        fahrzeug.setHubraum(readFileWithReturn(ReadCoordinates.FHUBRAUM));
        fahrzeug.setHu(readFileWithReturn(ReadCoordinates.FHU));
        fahrzeug.setSp(readFileWithReturn(ReadCoordinates.FSP));
        fahrzeug.setKilometer(readFileWithReturn(ReadCoordinates.FKILOMETER));
        fahrzeug.setFarbe(readFileWithReturn(ReadCoordinates.FFARBE));
        fahrzeug.setvBereifung(readFileWithReturn(ReadCoordinates.FVBEREIFUNG));
        fahrzeug.sethBereifung(readFileWithReturn(ReadCoordinates.FHBEREIFUNG));
        fahrzeug.setReifenHersteller(readFileWithReturn(ReadCoordinates.FREIFENHERSTELLER));
        fahrzeug.setReifenProfiltiefe(readFileWithReturn(ReadCoordinates.FPROFILTIEFE));
        fahrzeug.setAntriebsart(readFileWithReturn(ReadCoordinates.FANTRIEBSART));
        fahrzeug.setUmweltplakette(readFileWithReturn(ReadCoordinates.FUMWELTPLAKETTE));
        fahrzeug.setKrafstoff(readFileWithReturn(ReadCoordinates.FKRAFTSTOFF));
        fahrzeug.setSchadstoffklasse(readFileWithReturn(ReadCoordinates.FSCHADSTOFFKLASSE));
        fahrzeug.setAllgemeinZustand(readFileWithReturn(ReadCoordinates.FALLGZUSTAND));
        fahrzeug.setKarosserieZustand(readFileWithReturn(ReadCoordinates.FKARRZUSTAND));
        fahrzeug.setLackZustand(readFileWithReturn(ReadCoordinates.FLACKZUSTAND));
        fahrzeug.setAusstattung(readFileWithReturn(ReadCoordinates.FAUSSTATTUNG));

        String bVorschaden = readFileWithReturn(ReadCoordinates.BEHVORSCHADEN);
        String nbVorschaden = readFileWithReturn(ReadCoordinates.NBEHVORSCHADEN);
//
        bvorschadenArr = bVorschaden.split("\\r?\\n");
        nbvorschadenArr = nbVorschaden.split("\\r?\\n");

        for (int i = 0; i < bvorschadenArr.length; i++) {
            fahrzeug.addVorschaeden(bvorschadenArr[i], fahrzeug.getbVorschaeden());
        }
        for (int i = 0; i < nbvorschadenArr.length; i++) {
            fahrzeug.addVorschaeden(nbvorschadenArr[i], fahrzeug.getbVorschaeden());
        }

    }

    public void writeFallData(Fall fall) throws Exception {
        fall.setAuftragsdatum(readFileWithReturn(ReadCoordinates.ADATUM));
        fall.setSchadenDatumOrt(readFileWithReturn(ReadCoordinates.SDATUMORT));
        fall.setGutachtennummer(readFileWithReturn(ReadCoordinates.GNUMMER));
        fall.setSchadennummer(readFileWithReturn(ReadCoordinates.SNUMMER));
        // fall.setVersicherung(readFileWithReturn(ReadCoordinates.?));
        fall.setKennzeichenug(readFileWithReturn(ReadCoordinates.KENNZEICHENUG));
        fall.setBort(readFileWithReturn(ReadCoordinates.BORT));
        fall.setBdatum(readFileWithReturn(ReadCoordinates.BDATUM));
        fall.setAp(readFileWithReturn(ReadCoordinates.AP));
        fall.setBuhrzeit(readFileWithReturn(ReadCoordinates.BUHRZEIT));
        fall.setBanwesend(readFileWithReturn(ReadCoordinates.BANWESEND));
        fall.setSchadenhergang(readFileWithReturn(ReadCoordinates.SCHADENHERGANG));
        // fall.setPlausibel(readFileWithReturn(ReadCoordinates.ADATUM));
        // fall.setSchichtdicke(readFileWithReturn(ReadCoordinates.ADATUM));
        fall.setNotizen(readFileWithReturn(ReadCoordinates.NOTIZEN));

    }

    /**
     * @return the startCoordinate
     */
    public int getStartCoordinate() {
        return startCoordinate;
    }

    /**
     * @param startCoordinate the startCoordinate to set
     */
    public void setStartCoordinate(int startCoordinate) {
        this.startCoordinate = startCoordinate;
    }

    /**
     * @return the stopCoordinate
     */
    public int getStopCoordinate() {
        return stopCoordinate;
    }

    /**
     * @param stopCoordinate the stopCoordinate to set
     */
    public void setStopCoordinate(int stopCoordinate) {
        this.stopCoordinate = stopCoordinate;
    }

}
