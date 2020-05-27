package hsleiden.stenentijdperk.stenentijdperk.Models;

import java.util.ArrayList;

public class RegelModel {
    private ArrayList<String> regels = new ArrayList<>();

    public RegelModel(ArrayList<String> regels){
        this.regels = regels;
    }

    public ArrayList<String> getRegels() {
        return regels;
    }
}
