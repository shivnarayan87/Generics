package com.generics;

import java.util.ArrayList;

public class WildCardType {
	
	public void m1(ArrayList<?> l) {
		l.add(null);
		
		
	}
	
	public static void main(String[] args) {
		ArrayList<?> l= new ArrayList<String>();
		ArrayList<?> l1= new ArrayList<Integer>();
		
		WildCardType wc= new WildCardType();
		wc.m1(l);
		wc.m1(l1);
		
	}

}
