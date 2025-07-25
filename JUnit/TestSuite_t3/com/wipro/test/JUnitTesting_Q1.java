package com.wipro.test;

import java.util.Arrays;

public class JUnitTesting_Q1 {

	public String Concat(String s1,String s2) {
		return s1+" "+s2;
	}
	public int[] sortValues(int[] arr) {
		Arrays.sort(arr);
		return arr;
	}
    public boolean checkPresence(String str,String a) {
    	return str.contains(a);
    }
	
}
