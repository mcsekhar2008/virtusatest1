package com.sekhar.test.service.impl;

import com.sekhar.test.constant.NumNames;
import com.sekhar.test.constant.SpecialNames;
import com.sekhar.test.constant.TensNames;
import com.sekhar.test.service.NumberToWord;

public class NumberToWordImpl implements NumberToWord{
	 private String convertLessThanOneThousand(int number) {
	        String current;
	        
	        if (number % 100 < 20){
	            current = NumNames.values[number % 100].toString();
	            number /= 100;
	        }
	        else {
	            current = NumNames.values[number % 10].toString();
	            number /= 10;
	            
	            current = TensNames.values[number % 10] + current;
	            number /= 10;
	        }
	        if (number == 0) return current;
	        return NumNames.values[number] + " hundred" + current;
	    }
	    
	 public String convert(int number) {

	        if (number == 0) { return "zero"; }
	        
	        String prefix = "";
	        
	        if (number < 0) {
	            number = -number;
	            prefix = "negative";
	        }
	        
	        String current = "";
	        int place = 0;
	        
	        do {
	            int n = number % 1000;
	            if (n != 0){
	                String s = convertLessThanOneThousand(n);
	                current = s + SpecialNames.values[place] + current;
	            }
	            place++;
	            number /= 1000;
	        } while (number > 0);
	        
	        return (prefix + current).trim();
	    }
}
