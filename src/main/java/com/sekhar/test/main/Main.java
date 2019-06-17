package com.sekhar.test.main;


import com.sekhar.test.exception.InvalidInputException;
import com.sekhar.test.service.NumberToWord;
import com.sekhar.test.service.impl.NumberToWordImpl;
import com.sekhar.test.validations.InputValidator;
import com.sekhar.test.validations.impl.InputValidatorImpl;

public class Main {
	public static void main(String[] args) {
		NumberToWord obj = new NumberToWordImpl();
		while (true) {
			try {
				InputValidator validator = new InputValidatorImpl();
				Integer n = validator.validateAndReturnInput();
				System.out.println("word converstion for given input: ");
				System.out.println(obj.convert(n));
			} catch (InvalidInputException e) {
				//e.printStackTrace();
				System.out.println("Got error:"+e.getMessage());
			}
			
		}
	}
}
