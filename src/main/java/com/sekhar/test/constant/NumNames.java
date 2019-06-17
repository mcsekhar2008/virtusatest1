package com.sekhar.test.constant;

public enum NumNames {
	EMPTY(""), ONE(" one"), TWO(" two"), THREE(" three"), FOUR(" four"), FIVE(" five"), SIX(" six"), SEVEN(
			" seven"), EIGHT(" eight"), NINE(" nine"), TEN(" ten"), ELEVEN(" eleven"), TWELVE(" twelve"), THIRTEEN(
					" thirteen"), FOURTEEN(" fourteen"), FIFTEEN(" fifteen"), SIXTEEN(
							" sixteen"), SEVENTEEN(" seventeen"), EIGHTEEN(" eighteen"), NINETEEN(" nineteen");
	public static final NumNames values[] = values();
	private final String textRepresentation;

	private NumNames(String textRepresentation) {
		this.textRepresentation = textRepresentation;
	}

	@Override
	public String toString() {
		return textRepresentation;
	}
}
