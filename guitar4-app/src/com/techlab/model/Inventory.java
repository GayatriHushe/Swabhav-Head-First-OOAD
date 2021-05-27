package com.techlab.model;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	private List<Guitar> guitars;

	public Inventory() {
		guitars = new ArrayList<Guitar>();
	}

	public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood,
			Wood topWood, int numStrings) {
		Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood,numStrings);
		guitars.add(guitar);
	}

	public Guitar getGuitar(String serialNumber) {
		for (Guitar guitar : guitars) {
			if (guitar.getSerialNumber().equals(serialNumber))
				return guitar;
		}
		return null;
	}

	public List search(GuitarSpec searchGuitar) {
		List matchingGuitars=new ArrayList();
		for (Guitar guitar : guitars ) {
			GuitarSpec spec=guitar.getGuitarSpec();
			// Ignore serial number and price

			if(spec.matches(searchGuitar))
				matchingGuitars.add(guitar);
		}
		return matchingGuitars;
	}
	@Override
	public String toString() {
		return "Inventory [guitars=" + guitars + "]";
	}

}
