package com.sekhar.test.constant;

public enum TensNames {
	EMPTY(""), TEN(" ten"), TWENTY(" twenty"), THIRTY(" thirty"), FOURTY(" forty"), FIFTY(" fifty"), SIXTY(
			" sixty"), SEVENTY(" seventy"), EIGHTY(" eighty"), NINETY(" ninety");
	public static final TensNames values[] = values();
	private final String textRepresentation;

	private TensNames(String textRepresentation) {
		this.textRepresentation = textRepresentation;
	}

	@Override
	public String toString() {
		return textRepresentation;
	}

}
