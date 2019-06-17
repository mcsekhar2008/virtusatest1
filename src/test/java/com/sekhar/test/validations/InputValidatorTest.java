package com.sekhar.test.validations;

import com.sekhar.test.exception.InvalidInputException;
import com.sekhar.test.validations.impl.InputValidatorImpl;

import junit.framework.Assert;
import junit.framework.TestCase;
import static org.mockito.Mockito.*;

public class InputValidatorTest extends TestCase {
	
	public void testvalidateAndReturnInput() {
    	InputValidator in = mock(InputValidatorImpl.class);
    	Integer i;
		try {
			when(in.validateAndReturnInput()).thenReturn(43);
			i = in.validateAndReturnInput();
			Assert.assertNotNull(i);
		} catch (InvalidInputException e) {
		}
    }
	
	public void testvalidateAndReturnInput1() {
    	InputValidator in = mock(InputValidatorImpl.class);
    	Integer i;
    	boolean thrown = false;
		try {
			when(in.validateAndReturnInput()).thenThrow(new InvalidInputException("invalid Input"));
			i = in.validateAndReturnInput();
			Assert.assertNotNull(i);
		} catch (InvalidInputException e) {
			thrown = true;
		}
		Assert.assertTrue(thrown);
    }

}
