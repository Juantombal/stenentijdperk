package hsleiden.stenentijdperk.stenentijdperk.Models;

import hsleiden.stenentijdperk.stenentijdperk.Helpers.Hut;
import hsleiden.stenentijdperk.stenentijdperk.Helpers.Kaart;
import hsleiden.stenentijdperk.stenentijdperk.Helpers.Resource;
import hsleiden.stenentijdperk.stenentijdperk.Helpers.Stamlid;

import java.util.ArrayList;

public class PlayerModel {
    private String naam;
    private int id;
    private int lobbyId;
    private int punten;
    private Resource[] resources;
    private ArrayList<Kaart> kaarten;
    private ArrayList<Hut> hutten;
    private ArrayList<Stamlid> stamleden;
    private int[] tools;
    private int graan;
    private boolean toolkaart;
    private ArrayList<String> treasure;

    public PlayerModel(String naam,
                       int id, int lobbyId,
                       int punten,
                       Resource[] resources,
                       ArrayList<Kaart> kaarten,
                       ArrayList<Hut> hutten,
                       ArrayList<Stamlid> stamleden,
                       int[] tools,
                       int graan,
                       boolean toolkaart,
                       ArrayList<String> treasure) {
        this.naam = naam;
        this.id = id;
        this.lobbyId = lobbyId;
        this.punten = punten;
        this.resources = resources;
        this.kaarten = kaarten;
        this.hutten = hutten;
        this.stamleden = stamleden;
        this.tools = tools;
        this.graan = graan;
        this.toolkaart = toolkaart;
        this.treasure = treasure;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLobbyId() {
        return lobbyId;
    }

    public void setLobbyId(int lobbyId) {
        this.lobbyId = lobbyId;
    }

    public int getPunten() {
        return punten;
    }

    public void setPunten(int punten) {
        this.punten = punten;
    }

    public Resource[] getResources() {
        return resources;
    }

    public void setResources(Resource[] resources) {
        this.resources = resources;
    }

    public ArrayList<Kaart> getKaarten() {
        return kaarten;
    }

    public void setKaarten(ArrayList<Kaart> kaarten) {
        this.kaarten = kaarten;
    }

    public ArrayList<Hut> getHutten() {
        return hutten;
    }

    public void setHutten(ArrayList<Hut> hutten) {
        this.hutten = hutten;
    }

    public ArrayList<Stamlid> getStamleden() {
        return stamleden;
    }

    public void setStamleden(ArrayList<Stamlid> stamleden) {
        this.stamleden = stamleden;
    }

    public int[] getTools() {
        return tools;
    }

    public void setTools(int[] tools) {
        this.tools = tools;
    }

    public int getGraan() {
        return graan;
    }

    public void setGraan(int graan) {
        this.graan = graan;
    }

    public boolean isToolkaart() {
        return toolkaart;
    }

    public void setToolkaart(boolean toolkaart) {
        this.toolkaart = toolkaart;
    }

    public ArrayList<String> getTreasure() {
        return treasure;
    }

    public void setTreasure(ArrayList<String> treasure) {
        this.treasure = treasure;
    }
}
