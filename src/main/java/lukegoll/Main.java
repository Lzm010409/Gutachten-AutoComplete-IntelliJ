package lukegoll;

import fall.Fahrzeug;
import fall.Fall;
import fall.Kunde;
import textpicker.AufnahmebogenServiceImpl;

public class Main {
    public static void main(String[] args) throws Exception {
        AufnahmebogenServiceImpl a1 = new AufnahmebogenServiceImpl();
        Kunde k1 = new Kunde();
        Fahrzeug f1 = new Fahrzeug();
        Fall fall1 = new Fall();
        a1.writeKundenData(k1);
        a1.writeKundenMail(k1);
        a1.writeKundenTel(k1);
        a1.writeFahrzeugData(f1);
        a1.writeFallData(fall1);
        System.out.println(fall1.getSchadenDatumOrt());
    }

    }
