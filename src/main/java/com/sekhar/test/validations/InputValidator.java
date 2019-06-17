package com.sekhar.test.validations;

import com.sekhar.test.exception.InvalidInputException;

public interface InputValidator {
	public Integer validateAndReturnInput() throws InvalidInputException;
}
