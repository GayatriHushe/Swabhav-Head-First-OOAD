package com.techlab.model;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	private List<Guitar> guitars;

	public Inventory() {
		guitars = new ArrayList<Guitar>();
	}

	public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood,
			Wood topWood) {
		Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
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

			if (searchGuitar.getBuilder() != spec.getBuilder())
				continue;
			String model = searchGuitar.getModel();
			if ((model != null) && (!model.equals("")) && (!model.equals(spec.getModel())))
				continue;
			if (searchGuitar.getType() != spec.getType())
				continue;
			if (searchGuitar.getBackWood() != spec.getBackWood())
				continue;
			if (searchGuitar.getTopWood() != spec.getTopWood())
				continue;
			matchingGuitars.add(guitar);
		}
		return matchingGuitars;
	}
	@Override
	public String toString() {
		return "Inventory [guitars=" + guitars + "]";
	}

}
