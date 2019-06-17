package com.sekhar.test.service.impl;


import com.sekhar.test.service.NumberToWord;
import com.sekhar.test.service.impl.NumberToWordImpl;

import junit.framework.Assert;
import junit.framework.TestCase;

public class NumberToWordImplTest extends TestCase {
	NumberToWord obj;
	
	@Override
    protected void setUp() throws Exception
    {
        super.setUp();
        this.obj = new NumberToWordImpl();
    }
	
	public void testConvert() {
    	Assert.assertEquals("fifty six million nine hundred forty five thousand seven hundred eighty one",obj.convert(56945781));
    }
    
    public void testConvert1() {
    	Assert.assertEquals("fifteen",obj.convert(15));
    }
    
    public void testConvert2() {
    	String str =obj.convert(-15);
    	Assert.assertNotSame("fifteen", str.intern());
    }
}
