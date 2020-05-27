package hsleiden.stenentijdperk.stenentijdperk.Controllers;

import hsleiden.stenentijdperk.stenentijdperk.Models.LobbyModel;

public class LobbyController {
    private LobbyModel model;

    public LobbyController() {
        model = new LobbyModel();
    }

    public void startSpel(){
        SpelbordController c = new SpelbordController();
    }
}
