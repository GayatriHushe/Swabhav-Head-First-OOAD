package com.techlab.model;

public enum InstrumentType {
	GUITAR,MANDOLIN,BANJO,DOBRA,BASS, FIDDLE;
	@Override
	public String toString() {
		switch (this) {
		case GUITAR:
			return "Guitar";
		case MANDOLIN:
			return "Mandolin";
		case BANJO:
			return "Banjo";
		case DOBRA:
			return "Dobra";
		case BASS:
			return "Bass";
		case FIDDLE:
			return "Fiddle";
		default:
			return "DefaultInstrument";
		}
	}
}
