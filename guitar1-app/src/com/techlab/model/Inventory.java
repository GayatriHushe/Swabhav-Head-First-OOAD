package com.techlab.model;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	private List<Guitar> guitars;

	public Inventory() {
		guitars = new ArrayList<Guitar>();
	}

	public void addGuitar(String serialNumber, double price, String builder, String model, String type, String backWood,
			String topWood) {
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

	public Guitar search(Guitar searchGuitar) {
		for (Guitar guitar : guitars ) {
			
			// Ignore serial number and price
			
			String builder = searchGuitar.getBuilder();
			if ((builder != null) && (!builder.equals("")) && (!builder.equals(guitar.getBuilder())))
				continue;
			String model = searchGuitar.getModel();
			if ((model != null) && (!model.equals("")) && (!model.equals(guitar.getModel())))
				continue;
			String type = searchGuitar.getType();
			if ((type != null) && (!searchGuitar.equals("")) && (!type.equals(guitar.getType())))
				continue;
			String backWood = searchGuitar.getBackWood();
			if ((backWood != null) && (!backWood.equals("")) && (!backWood.equals(guitar.getBackWood())))
				continue;
			String topWood = searchGuitar.getTopWood();
			if ((topWood != null) && (!topWood.equals("")) && (!topWood.equals(guitar.getTopWood())))
				continue;
		}
		return null;
	}
	@Override
	public String toString() {
		return "Inventory [guitars=" + guitars + "]";
	}

}
