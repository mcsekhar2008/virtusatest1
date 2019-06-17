package com.sekhar.test.validations.impl;

import java.util.Scanner;

import com.sekhar.test.exception.InvalidInputException;
import com.sekhar.test.validations.InputValidator;

public class InputValidatorImpl implements InputValidator{
	public Integer validateAndReturnInput() throws InvalidInputException {
		try {
			System.out.println("Please enter an integer to convert to word format:");
			Scanner s = new Scanner(System.in);
			Integer n = s.nextInt();
			return n;
		} catch (Exception e) {
			throw new InvalidInputException(e.getMessage());
		}
	}
}
