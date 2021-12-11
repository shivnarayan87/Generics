package com.generics;

import java.util.ArrayList;
// T is a bounded type. it only allow to add integer type value.limit the boundary
public class GenericsDemo<T extends Number> {
	public static void main(String[] args) {
		
		GenericsDemo<Number> t1= new GenericsDemo<Number>();
		//GenericsDemo<Integer> t2= new GenericsDemo<Integer>();
		t1.addData(10);
		t1.addData(new Integer(12));
		
		
		

		
	}
	
	public void addData(T t) {
		
	}
	
	


}
