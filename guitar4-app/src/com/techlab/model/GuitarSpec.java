package com.techlab.model;

public class GuitarSpec 
{
	private String model;
	private Wood topWood;
	private Wood backWood;
	private Type type;
	private Builder builder;
	private int numStrings;

	public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numStrings) {
		this.builder=builder;
		this.model=model;
		this.type=type;
		this.backWood=backWood;
		this.topWood=topWood;
		this.numStrings=numStrings;
	}
	public Builder getBuilder() {
		return builder;
	}
	public String getModel() {
		return model;
	}
	public Type getType() {
		return type;
	}
	public Wood getBackWood() {
		return backWood;
	}
	public Wood getTopWood() {
		return topWood;
	}
	public int getNumStrings() {
		return numStrings;
	}
	@Override
	public String toString() {
		return "GuitarSpec [model=" + model + ", topWood=" + topWood + ", backWood=" + backWood + ", type=" + type
				+ ", builder=" + builder + "]";
	}
	public boolean matches(GuitarSpec otherSpec) 
	{
			if (builder != otherSpec.builder)
				return false;
			if ((model != null) && (!model.equals("")) &&
					(!model.equals(otherSpec.model)))
				return false;
			if (type != otherSpec.type)
				return false;
			if (numStrings != otherSpec.numStrings)
				return false;
			if (backWood != otherSpec.backWood)
				return false;
			if (topWood != otherSpec.topWood)
				return false;
			return true;
		}

	}
