package com.techlab.model;

public class Guitar 
{
	private String serialNumber;
	private GuitarSpec guitarSpec;
	private double price;
	
	public Guitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backWood,
			Wood topWood) {
		this.serialNumber=serialNumber;
		this.price=price;
		this.guitarSpec=new GuitarSpec(builder, model, type, backWood, topWood);
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
	public GuitarSpec getGuitarSpec() {
		return guitarSpec;
	}
	
	
}
