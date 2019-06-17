package com.sekhar.test.constant;

import com.sekhar.test.constant.NumNames;

import junit.framework.Assert;
import junit.framework.TestCase;

public class NumNamesTest extends TestCase {
	public void testNumber() {
    	NumNames num = NumNames.values[1];
    	Assert.assertEquals(num.toString(), " one");
    }
	
	public void testNumberZero() {
    	NumNames num = NumNames.values[0];
    	Assert.assertNotSame(num.toString(), " ".intern());
    }
}
