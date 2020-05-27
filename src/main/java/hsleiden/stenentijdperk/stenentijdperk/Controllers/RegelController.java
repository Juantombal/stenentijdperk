package hsleiden.stenentijdperk.stenentijdperk.Controllers;

import hsleiden.stenentijdperk.stenentijdperk.Models.RegelModel;

import java.util.ArrayList;

public class RegelController {
    private RegelModel model;

    public RegelController(){
        ArrayList<String> regels = new ArrayList<>();
        model = new RegelModel(regels);
    }

    public void showRegels(){ }
    public void hideRegels(){}
}
