package com.techlab.model;

public enum Style {
	A,F;
	
	@Override
	public String toString() {
		switch (this) {
		case A:
			return "A Style";
		case F:
			return "F Style";
		default:
			return "Default Style";}
	}
	

}
