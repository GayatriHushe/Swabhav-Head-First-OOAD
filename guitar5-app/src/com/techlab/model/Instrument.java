package com.techlab.model;

public abstract class Instrument {
	private String serialNumber;
	private InstrumentSpec spec;
	private double price;
	
	public Instrument(String serialNumber, double price,InstrumentSpec spec) {
		this.serialNumber=serialNumber;
		this.price=price;
		this.spec=spec;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public InstrumentSpec getSpec() {
		return spec;
	}
}
