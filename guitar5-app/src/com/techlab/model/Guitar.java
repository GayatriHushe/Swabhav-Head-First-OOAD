package com.techlab.model;

public class Guitar extends Instrument
{
	GuitarSpec spec;
	public Guitar(String serialNumber, double price, GuitarSpec spec) {
		super(serialNumber, price, spec);
	}
}
