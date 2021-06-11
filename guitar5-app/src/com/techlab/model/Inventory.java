package com.techlab.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {
	private List inventory;

	public Inventory() {
		inventory = new ArrayList();
	}

	public void addGuitar(String serialNumber, double price, InstrumentSpec spec) {
		Instrument instrument=null;
		if(spec instanceof GuitarSpec)
			instrument = new Guitar(serialNumber, price, (GuitarSpec)spec);
		else
			instrument=new Mandolin(serialNumber, price, (MandolinSpec)spec);
		
		inventory.add(instrument);
	}

	public Instrument get(String serialNumber) {
		for (Iterator iterator = inventory.iterator(); iterator.hasNext();) {
			Instrument instrument = (Instrument) iterator.next();
			if (instrument.getSerialNumber().equals(serialNumber))
				return instrument;
		}
		return null;
	}

	public List search(MandolinSpec searchSpec) {
		List matchingMandolins=new ArrayList();
		for (Iterator iterator = matchingMandolins.iterator(); iterator.hasNext();) {
			Mandolin mandolin = (Mandolin) iterator.next();
			if(mandolin.getSpec().matches(searchSpec))
				matchingMandolins.add(mandolin);
			
		}
		return matchingMandolins;
	}
	@Override
	public String toString() {
		return "Inventory [guitars=" + inventory + "]";
	}

}
