package hsleiden.stenentijdperk.stenentijdperk.Helpers;

import java.util.HashMap;

public class Hut {
    private int waarde;
    private HashMap kosten;

    public Hut(int waarde, HashMap kosten){
        this.waarde = waarde;
        this.kosten = kosten;
    }

    public int getWaarde() {
        return waarde;
    }

    public HashMap getKosten() {
        return kosten;
    }
}
