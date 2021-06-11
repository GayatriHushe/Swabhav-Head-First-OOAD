package com.techlab.model;

public abstract class InstrumentSpec {
	private String model;
	private Wood topWood;
	private Wood backWood;
	private Type type;
	private Builder builder;

	public InstrumentSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
		this.builder=builder;
		this.model=model;
		this.type=type;
		this.backWood=backWood;
		this.topWood=topWood;
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
	@Override
	public String toString() {
		return "GuitarSpec [model=" + model + ", topWood=" + topWood + ", backWood=" + backWood + ", type=" + type
				+ ", builder=" + builder + "]";
	}
	public boolean matches(InstrumentSpec otherSpec) 
	{
			if (builder != otherSpec.builder)
				return false;
			if ((model != null) && (!model.equals("")) &&
					(!model.equals(otherSpec.model)))
				return false;
			if (type != otherSpec.type)
				return false;
			if (backWood != otherSpec.backWood)
				return false;
			if (topWood != otherSpec.topWood)
				return false;
			return true;
		}
}
