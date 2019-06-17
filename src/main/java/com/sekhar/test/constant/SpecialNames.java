package com.sekhar.test.constant;

public enum SpecialNames {

	EMPTY(""), THOUSAND(" thousand"), MILLION(" million"), BILLION(" billion"), TRILLION(" trillion"), QUADRILLION(
			" quadrillion"), QUINTILLION(" quintillion");

	public static final SpecialNames values[] = values();
	private final String textRepresentation;

	private SpecialNames(String textRepresentation) {
		this.textRepresentation = textRepresentation;
	}

	@Override
	public String toString() {
		return textRepresentation;
	}

}
