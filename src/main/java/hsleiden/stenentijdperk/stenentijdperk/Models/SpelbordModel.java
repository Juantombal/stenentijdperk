package hsleiden.stenentijdperk.stenentijdperk.Models;

import hsleiden.stenentijdperk.stenentijdperk.Helpers.*;

public class SpelbordModel {
	private Kaart[] kaarten;
	private Hut[] hutjes;
	private Locatie grondstoflocatie;
	private Resource[] resources;
	private int hoeveelheidTools;

	public Kaart[] getKaarten() {
		return kaarten;
	}

	public void setKaarten(Kaart[] kaarten) {
		this.kaarten = kaarten;
	}

	public Hut[] getHutjes() {
		return hutjes;
	}

	public void setHutjes(Hut[] hutjes) {
		this.hutjes = hutjes;
	}

	public Locatie getGrondstoflocatie() {
		return grondstoflocatie;
	}

	public void setGrondstoflocatie(Locatie grondstoflocatie) {
		this.grondstoflocatie = grondstoflocatie;
	}

	public Resource[] getResources() {
		return resources;
	}

	public void setResources(Resource[] resources) {
		this.resources = resources;
	}

	public int getHoeveelheidTools() {
		return hoeveelheidTools;
	}

	public void setHoeveelheidTools(int hoeveelheidTools) {
		this.hoeveelheidTools = hoeveelheidTools;
	}
}
